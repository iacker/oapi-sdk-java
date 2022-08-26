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

public class ListModerator {

  /**
   * 可发言用户 ID 类型
   * <p> 示例值：user_id
   */
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 可发言用户 ID
   * <p> 示例值：4d7a3c6g
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * tenant key
   * <p> 示例值：2ca1d211f64f6438
   */
  @SerializedName("tenant_key")
  private String tenantKey;

  // builder 开始
  public ListModerator() {
  }

  public ListModerator(Builder builder) {
    /**
     * 可发言用户 ID 类型
     * <p> 示例值：user_id
     */
    this.userIdType = builder.userIdType;
    /**
     * 可发言用户 ID
     * <p> 示例值：4d7a3c6g
     */
    this.userId = builder.userId;
    /**
     * tenant key
     * <p> 示例值：2ca1d211f64f6438
     */
    this.tenantKey = builder.tenantKey;
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

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTenantKey() {
    return this.tenantKey;
  }

  public void setTenantKey(String tenantKey) {
    this.tenantKey = tenantKey;
  }

  public static class Builder {

    /**
     * 可发言用户 ID 类型
     * <p> 示例值：user_id
     */
    private String userIdType;
    /**
     * 可发言用户 ID
     * <p> 示例值：4d7a3c6g
     */
    private String userId;
    /**
     * tenant key
     * <p> 示例值：2ca1d211f64f6438
     */
    private String tenantKey;

    /**
     * 可发言用户 ID 类型
     * <p> 示例值：user_id
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }


    /**
     * 可发言用户 ID
     * <p> 示例值：4d7a3c6g
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    /**
     * tenant key
     * <p> 示例值：2ca1d211f64f6438
     *
     * @param tenantKey
     * @return
     */
    public Builder tenantKey(String tenantKey) {
      this.tenantKey = tenantKey;
      return this;
    }


    public ListModerator build() {
      return new ListModerator(this);
    }
  }
}
