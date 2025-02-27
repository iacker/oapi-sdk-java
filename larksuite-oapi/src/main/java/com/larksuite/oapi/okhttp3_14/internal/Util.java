/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.larksuite.oapi.okhttp3_14.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import com.larksuite.oapi.okhttp3_14.Headers;
import com.larksuite.oapi.okhttp3_14.HttpUrl;
import com.larksuite.oapi.okhttp3_14.RequestBody;
import com.larksuite.oapi.okhttp3_14.ResponseBody;
import com.larksuite.oapi.okhttp3_14.internal.http2.Header;
import com.larksuite.oapi.okio1_17.Buffer;
import com.larksuite.oapi.okio1_17.BufferedSource;
import com.larksuite.oapi.okio1_17.ByteString;
import com.larksuite.oapi.okio1_17.Options;
import com.larksuite.oapi.okio1_17.Source;

import static java.nio.charset.StandardCharsets.UTF_16BE;
import static java.nio.charset.StandardCharsets.UTF_16LE;
import static java.nio.charset.StandardCharsets.UTF_8;

/** Junk drawer of utility methods. */
public final class Util {
  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final Headers EMPTY_HEADERS = Headers.of();

  public static final ResponseBody EMPTY_RESPONSE = ResponseBody.create(null, EMPTY_BYTE_ARRAY);
  public static final RequestBody EMPTY_REQUEST = RequestBody.create(null, EMPTY_BYTE_ARRAY);

  /** Byte order marks. */
  private static final Options UNICODE_BOMS = Options.of(
      ByteString.decodeHex("efbbbf"),   // UTF-8
      ByteString.decodeHex("feff"),     // UTF-16BE
      ByteString.decodeHex("fffe"),     // UTF-16LE
      ByteString.decodeHex("0000ffff"), // UTF-32BE
      ByteString.decodeHex("ffff0000")  // UTF-32LE
  );

  private static final Charset UTF_32BE = Charset.forName("UTF-32BE");
  private static final Charset UTF_32LE = Charset.forName("UTF-32LE");

  /** GMT and UTC are equivalent for our purposes. */
  public static final TimeZone UTC = TimeZone.getTimeZone("GMT");

  public static final Comparator<String> NATURAL_ORDER = String::compareTo;

  private static final Method addSuppressedExceptionMethod;

  static {
    Method m;
    try {
      m = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
    } catch (Exception e) {
      m = null;
    }
    addSuppressedExceptionMethod = m;
  }

  public static void addSuppressedIfPossible(Throwable e, Throwable suppressed) {
    if (addSuppressedExceptionMethod != null) {
      try {
        addSuppressedExceptionMethod.invoke(e, suppressed);
      } catch (InvocationTargetException | IllegalAccessException ignored) {
      }
    }
  }

  /**
   * Quick and dirty pattern to differentiate IP addresses from hostnames. This is an approximation
   * of Android's private InetAddress#isNumeric API.
   *
   * <p>This matches IPv6 addresses as a hex string containing at least one colon, and possibly
   * including dots after the first colon. It matches IPv4 addresses as strings containing only
   * decimal digits and dots. This pattern matches strings like "a:.23" and "54" that are neither IP
   * addresses nor hostnames; they will be verified as IP addresses (which is a more strict
   * verification).
   */
  private static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile(
      "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

  private Util() {
  }

  public static void checkOffsetAndCount(long arrayLength, long offset, long count) {
    if ((offset | count) < 0 || offset > arrayLength || arrayLength - offset < count) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  /**
   * Closes {@code closeable}, ignoring any checked exceptions. Does nothing if {@code closeable} is
   * null.
   */
  public static void closeQuietly(Closeable closeable) {
    if (closeable != null) {
      try {
        closeable.close();
      } catch (RuntimeException rethrown) {
        throw rethrown;
      } catch (Exception ignored) {
      }
    }
  }

  /**
   * Closes {@code socket}, ignoring any checked exceptions. Does nothing if {@code socket} is
   * null.
   */
  public static void closeQuietly(Socket socket) {
    if (socket != null) {
      try {
        socket.close();
      } catch (AssertionError e) {
        if (!isAndroidGetsocknameError(e)) throw e;
      } catch (RuntimeException rethrown) {
        throw rethrown;
      } catch (Exception ignored) {
      }
    }
  }

  /**
   * Closes {@code serverSocket}, ignoring any checked exceptions. Does nothing if {@code
   * serverSocket} is null.
   */
  public static void closeQuietly(ServerSocket serverSocket) {
    if (serverSocket != null) {
      try {
        serverSocket.close();
      } catch (RuntimeException rethrown) {
        throw rethrown;
      } catch (Exception ignored) {
      }
    }
  }

  /**
   * Attempts to exhaust {@code source}, returning true if successful. This is useful when reading a
   * complete source is helpful, such as when doing so completes a cache body or frees a socket
   * connection for reuse.
   */
  public static boolean discard(Source source, int timeout, TimeUnit timeUnit) {
    try {
      return skipAll(source, timeout, timeUnit);
    } catch (IOException e) {
      return false;
    }
  }

  /**
   * Reads until {@code in} is exhausted or the deadline has been reached. This is careful to not
   * extend the deadline if one exists already.
   */
  public static boolean skipAll(Source source, int duration, TimeUnit timeUnit) throws IOException {
    long now = System.nanoTime();
    long originalDuration = source.timeout().hasDeadline()
        ? source.timeout().deadlineNanoTime() - now
        : Long.MAX_VALUE;
    source.timeout().deadlineNanoTime(now + Math.min(originalDuration, timeUnit.toNanos(duration)));
    try {
      Buffer skipBuffer = new Buffer();
      while (source.read(skipBuffer, 8192) != -1) {
        skipBuffer.clear();
      }
      return true; // Success! The source has been exhausted.
    } catch (InterruptedIOException e) {
      return false; // We ran out of time before exhausting the source.
    } finally {
      if (originalDuration == Long.MAX_VALUE) {
        source.timeout().clearDeadline();
      } else {
        source.timeout().deadlineNanoTime(now + originalDuration);
      }
    }
  }

  /** Returns an immutable copy of {@code list}. */
  public static <T> List<T> immutableList(List<T> list) {
    return Collections.unmodifiableList(new ArrayList<>(list));
  }

  /** Returns an immutable copy of {@code map}. */
  public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
    return map.isEmpty()
        ? Collections.emptyMap()
        : Collections.unmodifiableMap(new LinkedHashMap<>(map));
  }

  /** Returns an immutable list containing {@code elements}. */
  @SafeVarargs
  public static <T> List<T> immutableList(T... elements) {
    return Collections.unmodifiableList(Arrays.asList(elements.clone()));
  }

  public static ThreadFactory threadFactory(String name, boolean daemon) {
    return runnable -> {
      Thread result = new Thread(runnable, name);
      result.setDaemon(daemon);
      return result;
    };
  }

  /**
   * Returns an array containing only elements found in {@code first} and also in {@code
   * second}. The returned elements are in the same order as in {@code first}.
   */
  public static String[] intersect(
      Comparator<? super String> comparator, String[] first, String[] second) {
    List<String> result = new ArrayList<>();
    for (String a : first) {
      for (String b : second) {
        if (comparator.compare(a, b) == 0) {
          result.add(a);
          break;
        }
      }
    }
    return result.toArray(new String[result.size()]);
  }

  /**
   * Returns true if there is an element in {@code first} that is also in {@code second}. This
   * method terminates if any intersection is found. The sizes of both arguments are assumed to be
   * so small, and the likelihood of an intersection so great, that it is not worth the CPU cost of
   * sorting or the memory cost of hashing.
   */
  public static boolean nonEmptyIntersection(
      Comparator<String> comparator, String[] first, String[] second) {
    if (first == null || second == null || first.length == 0 || second.length == 0) {
      return false;
    }
    for (String a : first) {
      for (String b : second) {
        if (comparator.compare(a, b) == 0) {
          return true;
        }
      }
    }
    return false;
  }

  public static String hostHeader(HttpUrl url, boolean includeDefaultPort) {
    String host = url.host().contains(":")
        ? "[" + url.host() + "]"
        : url.host();
    return includeDefaultPort || url.port() != HttpUrl.defaultPort(url.scheme())
        ? host + ":" + url.port()
        : host;
  }

  /**
   * Returns true if {@code e} is due to a firmware bug fixed after Android 4.2.2.
   * https://code.google.com/p/android/issues/detail?id=54072
   */
  public static boolean isAndroidGetsocknameError(AssertionError e) {
    return e.getCause() != null && e.getMessage() != null
        && e.getMessage().contains("getsockname failed");
  }

  public static int indexOf(Comparator<String> comparator, String[] array, String value) {
    for (int i = 0, size = array.length; i < size; i++) {
      if (comparator.compare(array[i], value) == 0) return i;
    }
    return -1;
  }

  public static String[] concat(String[] array, String value) {
    String[] result = new String[array.length + 1];
    System.arraycopy(array, 0, result, 0, array.length);
    result[result.length - 1] = value;
    return result;
  }

  /**
   * Increments {@code pos} until {@code input[pos]} is not ASCII whitespace. Stops at {@code
   * limit}.
   */
  public static int skipLeadingAsciiWhitespace(String input, int pos, int limit) {
    for (int i = pos; i < limit; i++) {
      switch (input.charAt(i)) {
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
          continue;
        default:
          return i;
      }
    }
    return limit;
  }

  /**
   * Decrements {@code limit} until {@code input[limit - 1]} is not ASCII whitespace. Stops at
   * {@code pos}.
   */
  public static int skipTrailingAsciiWhitespace(String input, int pos, int limit) {
    for (int i = limit - 1; i >= pos; i--) {
      switch (input.charAt(i)) {
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
          continue;
        default:
          return i + 1;
      }
    }
    return pos;
  }

  /** Equivalent to {@code string.substring(pos, limit).trim()}. */
  public static String trimSubstring(String string, int pos, int limit) {
    int start = skipLeadingAsciiWhitespace(string, pos, limit);
    int end = skipTrailingAsciiWhitespace(string, start, limit);
    return string.substring(start, end);
  }

  /**
   * Returns the index of the first character in {@code input} that contains a character in {@code
   * delimiters}. Returns limit if there is no such character.
   */
  public static int delimiterOffset(String input, int pos, int limit, String delimiters) {
    for (int i = pos; i < limit; i++) {
      if (delimiters.indexOf(input.charAt(i)) != -1) return i;
    }
    return limit;
  }

  /**
   * Returns the index of the first character in {@code input} that is {@code delimiter}. Returns
   * limit if there is no such character.
   */
  public static int delimiterOffset(String input, int pos, int limit, char delimiter) {
    for (int i = pos; i < limit; i++) {
      if (input.charAt(i) == delimiter) return i;
    }
    return limit;
  }

  /**
   * If {@code host} is an IP address, this returns the IP address in canonical form.
   *
   * <p>Otherwise this performs IDN ToASCII encoding and canonicalize the result to lowercase. For
   * example this converts {@code ☃.net} to {@code xn--n3h.net}, and {@code WwW.GoOgLe.cOm} to
   * {@code www.google.com}. {@code null} will be returned if the host cannot be ToASCII encoded or
   * if the result contains unsupported ASCII characters.
   */
  public static String canonicalizeHost(String host) {
    // If the input contains a :, it’s an IPv6 address.
    if (host.contains(":")) {
      // If the input is encased in square braces "[...]", drop 'em.
      InetAddress inetAddress = host.startsWith("[") && host.endsWith("]")
          ? decodeIpv6(host, 1, host.length() - 1)
          : decodeIpv6(host, 0, host.length());
      if (inetAddress == null) return null;
      byte[] address = inetAddress.getAddress();
      if (address.length == 16) return inet6AddressToAscii(address);
      if (address.length == 4) return inetAddress.getHostAddress(); // An IPv4-mapped IPv6 address.
      throw new AssertionError("Invalid IPv6 address: '" + host + "'");
    }

    try {
      String result = IDN.toASCII(host).toLowerCase(Locale.US);
      if (result.isEmpty()) return null;

      // Confirm that the IDN ToASCII result doesn't contain any illegal characters.
      if (containsInvalidHostnameAsciiCodes(result)) {
        return null;
      }
      // TODO: implement all label limits.
      return result;
    } catch (IllegalArgumentException e) {
      return null;
    }
  }

  private static boolean containsInvalidHostnameAsciiCodes(String hostnameAscii) {
    for (int i = 0; i < hostnameAscii.length(); i++) {
      char c = hostnameAscii.charAt(i);
      // The WHATWG Host parsing rules accepts some character codes which are invalid by
      // definition for OkHttp's host header checks (and the WHATWG Host syntax definition). Here
      // we rule out characters that would cause problems in host headers.
      if (c <= '\u001f' || c >= '\u007f') {
        return true;
      }
      // Check for the characters mentioned in the WHATWG Host parsing spec:
      // U+0000, U+0009, U+000A, U+000D, U+0020, "#", "%", "/", ":", "?", "@", "[", "\", and "]"
      // (excluding the characters covered above).
      if (" #%/:?@[\\]".indexOf(c) != -1) {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the index of the first character in {@code input} that is either a control character
   * (like {@code \u0000 or \n}) or a non-ASCII character. Returns -1 if {@code input} has no such
   * characters.
   */
  public static int indexOfControlOrNonAscii(String input) {
    for (int i = 0, length = input.length(); i < length; i++) {
      char c = input.charAt(i);
      if (c <= '\u001f' || c >= '\u007f') {
        return i;
      }
    }
    return -1;
  }

  /** Returns true if {@code host} is not a host name and might be an IP address. */
  public static boolean verifyAsIpAddress(String host) {
    return VERIFY_AS_IP_ADDRESS.matcher(host).matches();
  }

  /** Returns a {@link Locale#US} formatted {@link String}. */
  public static String format(String format, Object... args) {
    return String.format(Locale.US, format, args);
  }

  public static Charset bomAwareCharset(BufferedSource source, Charset charset) throws IOException {
    switch (source.select(UNICODE_BOMS)) {
      case 0: return UTF_8;
      case 1: return UTF_16BE;
      case 2: return UTF_16LE;
      case 3: return UTF_32BE;
      case 4: return UTF_32LE;
      case -1: return charset;
      default: throw new AssertionError();
    }
  }

  public static int checkDuration(String name, long duration, TimeUnit unit) {
    if (duration < 0) throw new IllegalArgumentException(name + " < 0");
    if (unit == null) throw new NullPointerException("unit == null");
    long millis = unit.toMillis(duration);
    if (millis > Integer.MAX_VALUE) throw new IllegalArgumentException(name + " too large.");
    if (millis == 0 && duration > 0) throw new IllegalArgumentException(name + " too small.");
    return (int) millis;
  }

  public static int decodeHexDigit(char c) {
    if (c >= '0' && c <= '9') return c - '0';
    if (c >= 'a' && c <= 'f') return c - 'a' + 10;
    if (c >= 'A' && c <= 'F') return c - 'A' + 10;
    return -1;
  }

  /** Decodes an IPv6 address like 1111:2222:3333:4444:5555:6666:7777:8888 or ::1. */
  private static @Nullable InetAddress decodeIpv6(String input, int pos, int limit) {
    byte[] address = new byte[16];
    int b = 0;
    int compress = -1;
    int groupOffset = -1;

    for (int i = pos; i < limit; ) {
      if (b == address.length) return null; // Too many groups.

      // Read a delimiter.
      if (i + 2 <= limit && input.regionMatches(i, "::", 0, 2)) {
        // Compression "::" delimiter, which is anywhere in the input, including its prefix.
        if (compress != -1) return null; // Multiple "::" delimiters.
        i += 2;
        b += 2;
        compress = b;
        if (i == limit) break;
      } else if (b != 0) {
        // Group separator ":" delimiter.
        if (input.regionMatches(i, ":", 0, 1)) {
          i++;
        } else if (input.regionMatches(i, ".", 0, 1)) {
          // If we see a '.', rewind to the beginning of the previous group and parse as IPv4.
          if (!decodeIpv4Suffix(input, groupOffset, limit, address, b - 2)) return null;
          b += 2; // We rewound two bytes and then added four.
          break;
        } else {
          return null; // Wrong delimiter.
        }
      }

      // Read a group, one to four hex digits.
      int value = 0;
      groupOffset = i;
      for (; i < limit; i++) {
        char c = input.charAt(i);
        int hexDigit = decodeHexDigit(c);
        if (hexDigit == -1) break;
        value = (value << 4) + hexDigit;
      }
      int groupLength = i - groupOffset;
      if (groupLength == 0 || groupLength > 4) return null; // Group is the wrong size.

      // We've successfully read a group. Assign its value to our byte array.
      address[b++] = (byte) ((value >>> 8) & 0xff);
      address[b++] = (byte) (value & 0xff);
    }

    // All done. If compression happened, we need to move bytes to the right place in the
    // address. Here's a sample:
    //
    //      input: "1111:2222:3333::7777:8888"
    //     before: { 11, 11, 22, 22, 33, 33, 00, 00, 77, 77, 88, 88, 00, 00, 00, 00  }
    //   compress: 6
    //          b: 10
    //      after: { 11, 11, 22, 22, 33, 33, 00, 00, 00, 00, 00, 00, 77, 77, 88, 88 }
    //
    if (b != address.length) {
      if (compress == -1) return null; // Address didn't have compression or enough groups.
      System.arraycopy(address, compress, address, address.length - (b - compress), b - compress);
      Arrays.fill(address, compress, compress + (address.length - b), (byte) 0);
    }

    try {
      return InetAddress.getByAddress(address);
    } catch (UnknownHostException e) {
      throw new AssertionError();
    }
  }

  /** Decodes an IPv4 address suffix of an IPv6 address, like 1111::5555:6666:192.168.0.1. */
  private static boolean decodeIpv4Suffix(
      String input, int pos, int limit, byte[] address, int addressOffset) {
    int b = addressOffset;

    for (int i = pos; i < limit; ) {
      if (b == address.length) return false; // Too many groups.

      // Read a delimiter.
      if (b != addressOffset) {
        if (input.charAt(i) != '.') return false; // Wrong delimiter.
        i++;
      }

      // Read 1 or more decimal digits for a value in 0..255.
      int value = 0;
      int groupOffset = i;
      for (; i < limit; i++) {
        char c = input.charAt(i);
        if (c < '0' || c > '9') break;
        if (value == 0 && groupOffset != i) return false; // Reject unnecessary leading '0's.
        value = (value * 10) + c - '0';
        if (value > 255) return false; // Value out of range.
      }
      int groupLength = i - groupOffset;
      if (groupLength == 0) return false; // No digits.

      // We've successfully read a byte.
      address[b++] = (byte) value;
    }

    if (b != addressOffset + 4) return false; // Too few groups. We wanted exactly four.
    return true; // Success.
  }

  /** Encodes an IPv6 address in canonical form according to RFC 5952. */
  private static String inet6AddressToAscii(byte[] address) {
    // Go through the address looking for the longest run of 0s. Each group is 2-bytes.
    // A run must be longer than one group (section 4.2.2).
    // If there are multiple equal runs, the first one must be used (section 4.2.3).
    int longestRunOffset = -1;
    int longestRunLength = 0;
    for (int i = 0; i < address.length; i += 2) {
      int currentRunOffset = i;
      while (i < 16 && address[i] == 0 && address[i + 1] == 0) {
        i += 2;
      }
      int currentRunLength = i - currentRunOffset;
      if (currentRunLength > longestRunLength && currentRunLength >= 4) {
        longestRunOffset = currentRunOffset;
        longestRunLength = currentRunLength;
      }
    }

    // Emit each 2-byte group in hex, separated by ':'. The longest run of zeroes is "::".
    Buffer result = new Buffer();
    for (int i = 0; i < address.length; ) {
      if (i == longestRunOffset) {
        result.writeByte(':');
        i += longestRunLength;
        if (i == 16) result.writeByte(':');
      } else {
        if (i > 0) result.writeByte(':');
        int group = (address[i] & 0xff) << 8 | address[i + 1] & 0xff;
        result.writeHexadecimalUnsignedLong(group);
        i += 2;
      }
    }
    return result.readUtf8();
  }

  public static X509TrustManager platformTrustManager() {
    try {
      TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
          TrustManagerFactory.getDefaultAlgorithm());
      trustManagerFactory.init((KeyStore) null);
      TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
      if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
        throw new IllegalStateException("Unexpected default trust managers:"
            + Arrays.toString(trustManagers));
      }
      return (X509TrustManager) trustManagers[0];
    } catch (GeneralSecurityException e) {
      throw new AssertionError("No System TLS", e); // The system has no TLS. Just give up.
    }
  }

  public static Headers toHeaders(List<Header> headerBlock) {
    Headers.Builder builder = new Headers.Builder();
    for (Header header : headerBlock) {
      Internal.instance.addLenient(builder, header.name.utf8(), header.value.utf8());
    }
    return builder.build();
  }

  public static List<Header> toHeaderBlock(Headers headers) {
    List<Header> result = new ArrayList<>();
    for (int i = 0; i < headers.size(); i++) {
      result.add(new Header(headers.name(i), headers.value(i)));
    }
    return result;
  }

  /**
   * Returns the system property, or defaultValue if the system property is null or
   * cannot be read (e.g. because of security policy restrictions).
   */
  public static String getSystemProperty(String key, @Nullable String defaultValue) {
    String value;
    try {
      value = System.getProperty(key);
    } catch (AccessControlException ex) {
      return defaultValue;
    }
    return value != null ? value : defaultValue;
  }

  /** Returns true if an HTTP request for {@code a} and {@code b} can reuse a connection. */
  public static boolean sameConnection(HttpUrl a, HttpUrl b) {
    return a.host().equals(b.host())
        && a.port() == b.port()
        && a.scheme().equals(b.scheme());
  }
}
