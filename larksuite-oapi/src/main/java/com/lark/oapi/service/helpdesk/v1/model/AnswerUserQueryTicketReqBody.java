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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;

public class AnswerUserQueryTicketReqBody {

  /**
   * 事件ID,可从订阅事件中提取
   * <p> 示例值：abcd
   */
  @SerializedName("event_id")
  private String eventId;
  /**
   * faq结果列表
   * <p> 示例值：
   */
  @SerializedName("faqs")
  private UserQueryFaqInfo[] faqs;

  // builder 开始
  public AnswerUserQueryTicketReqBody() {
  }

  public AnswerUserQueryTicketReqBody(Builder builder) {
    /**
     * 事件ID,可从订阅事件中提取
     * <p> 示例值：abcd
     */
    this.eventId = builder.eventId;
    /**
     * faq结果列表
     * <p> 示例值：
     */
    this.faqs = builder.faqs;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEventId() {
    return this.eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public UserQueryFaqInfo[] getFaqs() {
    return this.faqs;
  }

  public void setFaqs(UserQueryFaqInfo[] faqs) {
    this.faqs = faqs;
  }

  public static class Builder {

    /**
     * 事件ID,可从订阅事件中提取
     * <p> 示例值：abcd
     */
    private String eventId;
    /**
     * faq结果列表
     * <p> 示例值：
     */
    private UserQueryFaqInfo[] faqs;

    /**
     * 事件ID,可从订阅事件中提取
     * <p> 示例值：abcd
     *
     * @param eventId
     * @return
     */
    public Builder eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }


    /**
     * faq结果列表
     * <p> 示例值：
     *
     * @param faqs
     * @return
     */
    public Builder faqs(UserQueryFaqInfo[] faqs) {
      this.faqs = faqs;
      return this;
    }


    public AnswerUserQueryTicketReqBody build() {
      return new AnswerUserQueryTicketReqBody(this);
    }
  }
}
