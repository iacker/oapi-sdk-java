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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class Emoji {

  /**
   * emoji类型 [emoji类型列举](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)
   * <p> 示例值：SMILE
   */
  @SerializedName("emoji_type")
  private String emojiType;

  // builder 开始
  public Emoji() {
  }

  public Emoji(Builder builder) {
    /**
     * emoji类型 [emoji类型列举](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)
     * <p> 示例值：SMILE
     */
    this.emojiType = builder.emojiType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEmojiType() {
    return this.emojiType;
  }

  public void setEmojiType(String emojiType) {
    this.emojiType = emojiType;
  }

  public static class Builder {

    /**
     * emoji类型 [emoji类型列举](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)
     * <p> 示例值：SMILE
     */
    private String emojiType;

    /**
     * emoji类型 [emoji类型列举](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message-reaction/emojis-introduce)
     * <p> 示例值：SMILE
     *
     * @param emojiType
     * @return
     */
    public Builder emojiType(String emojiType) {
      this.emojiType = emojiType;
      return this;
    }


    public Emoji build() {
      return new Emoji(this);
    }
  }
}
