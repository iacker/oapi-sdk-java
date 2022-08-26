// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class Location {

  /**
   * 地址 ID
   * <p> 示例值：6921213751454744578
   */
  @SerializedName("location_id")
  private String locationId;
  /**
   * 地址名称
   * <p> 示例值：浙江省杭州市余杭区五常街道木桥头西溪八方城
   */
  @SerializedName("location_name")
  private String locationName;
  /**
   * 地址类型，1：GPS，2：Wi-Fi，8：IP
   * <p> 示例值：1
   */
  @SerializedName("location_type")
  private Integer locationType;
  /**
   * 地址纬度
   * <p> 示例值：30.28994
   */
  @SerializedName("latitude")
  private Double latitude;
  /**
   * 地址经度
   * <p> 示例值：120.04509
   */
  @SerializedName("longitude")
  private Double longitude;
  /**
   * Wi-Fi 名称
   * <p> 示例值：TP-Link-af12ca
   */
  @SerializedName("ssid")
  private String ssid;
  /**
   * Wi-Fi 的 MAC 地址
   * <p> 示例值：08:00:20:0A:8C:6D
   */
  @SerializedName("bssid")
  private String bssid;
  /**
   * 地图类型，1：高德， 2：谷歌
   * <p> 示例值：1
   */
  @SerializedName("map_type")
  private Integer mapType;
  /**
   * 地址名称
   * <p> 示例值：北京市海淀区中航广场
   */
  @SerializedName("address")
  private String address;
  /**
   * IP 地址
   * <p> 示例值：122.224.123.146
   */
  @SerializedName("ip")
  private String ip;
  /**
   * 额外信息，例如：运营商信息
   * <p> 示例值：中国电信
   */
  @SerializedName("feature")
  private String feature;
  /**
   * GPS 打卡的有效范围
   * <p> 示例值：300
   */
  @SerializedName("gps_range")
  private Integer gpsRange;

  // builder 开始
  public Location() {
  }

  public Location(Builder builder) {
    /**
     * 地址 ID
     * <p> 示例值：6921213751454744578
     */
    this.locationId = builder.locationId;
    /**
     * 地址名称
     * <p> 示例值：浙江省杭州市余杭区五常街道木桥头西溪八方城
     */
    this.locationName = builder.locationName;
    /**
     * 地址类型，1：GPS，2：Wi-Fi，8：IP
     * <p> 示例值：1
     */
    this.locationType = builder.locationType;
    /**
     * 地址纬度
     * <p> 示例值：30.28994
     */
    this.latitude = builder.latitude;
    /**
     * 地址经度
     * <p> 示例值：120.04509
     */
    this.longitude = builder.longitude;
    /**
     * Wi-Fi 名称
     * <p> 示例值：TP-Link-af12ca
     */
    this.ssid = builder.ssid;
    /**
     * Wi-Fi 的 MAC 地址
     * <p> 示例值：08:00:20:0A:8C:6D
     */
    this.bssid = builder.bssid;
    /**
     * 地图类型，1：高德， 2：谷歌
     * <p> 示例值：1
     */
    this.mapType = builder.mapType;
    /**
     * 地址名称
     * <p> 示例值：北京市海淀区中航广场
     */
    this.address = builder.address;
    /**
     * IP 地址
     * <p> 示例值：122.224.123.146
     */
    this.ip = builder.ip;
    /**
     * 额外信息，例如：运营商信息
     * <p> 示例值：中国电信
     */
    this.feature = builder.feature;
    /**
     * GPS 打卡的有效范围
     * <p> 示例值：300
     */
    this.gpsRange = builder.gpsRange;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getLocationId() {
    return this.locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public String getLocationName() {
    return this.locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public Integer getLocationType() {
    return this.locationType;
  }

  public void setLocationType(Integer locationType) {
    this.locationType = locationType;
  }

  public Double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public String getSsid() {
    return this.ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public String getBssid() {
    return this.bssid;
  }

  public void setBssid(String bssid) {
    this.bssid = bssid;
  }

  public Integer getMapType() {
    return this.mapType;
  }

  public void setMapType(Integer mapType) {
    this.mapType = mapType;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getFeature() {
    return this.feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  public Integer getGpsRange() {
    return this.gpsRange;
  }

  public void setGpsRange(Integer gpsRange) {
    this.gpsRange = gpsRange;
  }

  public static class Builder {

    /**
     * 地址 ID
     * <p> 示例值：6921213751454744578
     */
    private String locationId;
    /**
     * 地址名称
     * <p> 示例值：浙江省杭州市余杭区五常街道木桥头西溪八方城
     */
    private String locationName;
    /**
     * 地址类型，1：GPS，2：Wi-Fi，8：IP
     * <p> 示例值：1
     */
    private Integer locationType;
    /**
     * 地址纬度
     * <p> 示例值：30.28994
     */
    private Double latitude;
    /**
     * 地址经度
     * <p> 示例值：120.04509
     */
    private Double longitude;
    /**
     * Wi-Fi 名称
     * <p> 示例值：TP-Link-af12ca
     */
    private String ssid;
    /**
     * Wi-Fi 的 MAC 地址
     * <p> 示例值：08:00:20:0A:8C:6D
     */
    private String bssid;
    /**
     * 地图类型，1：高德， 2：谷歌
     * <p> 示例值：1
     */
    private Integer mapType;
    /**
     * 地址名称
     * <p> 示例值：北京市海淀区中航广场
     */
    private String address;
    /**
     * IP 地址
     * <p> 示例值：122.224.123.146
     */
    private String ip;
    /**
     * 额外信息，例如：运营商信息
     * <p> 示例值：中国电信
     */
    private String feature;
    /**
     * GPS 打卡的有效范围
     * <p> 示例值：300
     */
    private Integer gpsRange;

    /**
     * 地址 ID
     * <p> 示例值：6921213751454744578
     *
     * @param locationId
     * @return
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }


    /**
     * 地址名称
     * <p> 示例值：浙江省杭州市余杭区五常街道木桥头西溪八方城
     *
     * @param locationName
     * @return
     */
    public Builder locationName(String locationName) {
      this.locationName = locationName;
      return this;
    }


    /**
     * 地址类型，1：GPS，2：Wi-Fi，8：IP
     * <p> 示例值：1
     *
     * @param locationType
     * @return
     */
    public Builder locationType(Integer locationType) {
      this.locationType = locationType;
      return this;
    }


    /**
     * 地址纬度
     * <p> 示例值：30.28994
     *
     * @param latitude
     * @return
     */
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }


    /**
     * 地址经度
     * <p> 示例值：120.04509
     *
     * @param longitude
     * @return
     */
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
      return this;
    }


    /**
     * Wi-Fi 名称
     * <p> 示例值：TP-Link-af12ca
     *
     * @param ssid
     * @return
     */
    public Builder ssid(String ssid) {
      this.ssid = ssid;
      return this;
    }


    /**
     * Wi-Fi 的 MAC 地址
     * <p> 示例值：08:00:20:0A:8C:6D
     *
     * @param bssid
     * @return
     */
    public Builder bssid(String bssid) {
      this.bssid = bssid;
      return this;
    }


    /**
     * 地图类型，1：高德， 2：谷歌
     * <p> 示例值：1
     *
     * @param mapType
     * @return
     */
    public Builder mapType(Integer mapType) {
      this.mapType = mapType;
      return this;
    }


    /**
     * 地址名称
     * <p> 示例值：北京市海淀区中航广场
     *
     * @param address
     * @return
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }


    /**
     * IP 地址
     * <p> 示例值：122.224.123.146
     *
     * @param ip
     * @return
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }


    /**
     * 额外信息，例如：运营商信息
     * <p> 示例值：中国电信
     *
     * @param feature
     * @return
     */
    public Builder feature(String feature) {
      this.feature = feature;
      return this;
    }


    /**
     * GPS 打卡的有效范围
     * <p> 示例值：300
     *
     * @param gpsRange
     * @return
     */
    public Builder gpsRange(Integer gpsRange) {
      this.gpsRange = gpsRange;
      return this;
    }


    public Location build() {
      return new Location(this);
    }
  }
}
