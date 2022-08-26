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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class CreateTimeoffEventReq {

  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  @Body
  private TimeoffEvent body;

  // builder 开始
  public CreateTimeoffEventReq() {
  }

  public CreateTimeoffEventReq(Builder builder) {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public TimeoffEvent getTimeoffEvent() {
    return this.body;
  }

  public void setTimeoffEvent(TimeoffEvent body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType; // 此次调用中使用的用户ID的类型
    private TimeoffEvent body;

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType {@link com.lark.oapi.service.calendar.v4.enums.CreateTimeoffEventUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.calendar.v4.enums.CreateTimeoffEventUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public TimeoffEvent getTimeoffEvent() {
      return this.body;
    }

    /**
     * body
     *
     * @param body
     * @return
     */
    public Builder timeoffEvent(TimeoffEvent body) {
      this.body = body;
      return this;
    }

    public CreateTimeoffEventReq build() {
      return new CreateTimeoffEventReq(this);
    }
  }
}
