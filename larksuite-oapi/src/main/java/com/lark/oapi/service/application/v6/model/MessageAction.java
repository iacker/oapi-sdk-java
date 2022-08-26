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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class MessageAction {

  /**
   * pc 端链接
   * <p> 示例值：https://www.example.com
   */
  @SerializedName("pc_app_link")
  private String pcAppLink;
  /**
   * 移动端链接
   * <p> 示例值：https://www.example.com
   */
  @SerializedName("mobile_app_link")
  private String mobileAppLink;
  /**
   * 国际化信息
   * <p> 示例值：
   */
  @SerializedName("i18n")
  private MessageActionI18nInfo[] i18n;

  // builder 开始
  public MessageAction() {
  }

  public MessageAction(Builder builder) {
    /**
     * pc 端链接
     * <p> 示例值：https://www.example.com
     */
    this.pcAppLink = builder.pcAppLink;
    /**
     * 移动端链接
     * <p> 示例值：https://www.example.com
     */
    this.mobileAppLink = builder.mobileAppLink;
    /**
     * 国际化信息
     * <p> 示例值：
     */
    this.i18n = builder.i18n;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPcAppLink() {
    return this.pcAppLink;
  }

  public void setPcAppLink(String pcAppLink) {
    this.pcAppLink = pcAppLink;
  }

  public String getMobileAppLink() {
    return this.mobileAppLink;
  }

  public void setMobileAppLink(String mobileAppLink) {
    this.mobileAppLink = mobileAppLink;
  }

  public MessageActionI18nInfo[] getI18n() {
    return this.i18n;
  }

  public void setI18n(MessageActionI18nInfo[] i18n) {
    this.i18n = i18n;
  }

  public static class Builder {

    /**
     * pc 端链接
     * <p> 示例值：https://www.example.com
     */
    private String pcAppLink;
    /**
     * 移动端链接
     * <p> 示例值：https://www.example.com
     */
    private String mobileAppLink;
    /**
     * 国际化信息
     * <p> 示例值：
     */
    private MessageActionI18nInfo[] i18n;

    /**
     * pc 端链接
     * <p> 示例值：https://www.example.com
     *
     * @param pcAppLink
     * @return
     */
    public Builder pcAppLink(String pcAppLink) {
      this.pcAppLink = pcAppLink;
      return this;
    }


    /**
     * 移动端链接
     * <p> 示例值：https://www.example.com
     *
     * @param mobileAppLink
     * @return
     */
    public Builder mobileAppLink(String mobileAppLink) {
      this.mobileAppLink = mobileAppLink;
      return this;
    }


    /**
     * 国际化信息
     * <p> 示例值：
     *
     * @param i18n
     * @return
     */
    public Builder i18n(MessageActionI18nInfo[] i18n) {
      this.i18n = i18n;
      return this;
    }


    public MessageAction build() {
      return new MessageAction(this);
    }
  }
}
