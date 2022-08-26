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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditRecipientEntity {

  /**
   * 接收者对象类型
   * <p> 示例值：
   */
  @SerializedName("recipient_type")
  private String recipientType;
  /**
   * 接收者对象值，可能存在department_id、user_id等，需要进行lark_id的转换
   * <p> 示例值：
   */
  @SerializedName("recipient_value")
  private String recipientValue;
  /**
   * recipient 详情
   * <p> 示例值：
   */
  @SerializedName("recipient_detail")
  private AuditRecipientDetail recipientDetail;

  // builder 开始
  public AuditRecipientEntity() {
  }

  public AuditRecipientEntity(Builder builder) {
    /**
     * 接收者对象类型
     * <p> 示例值：
     */
    this.recipientType = builder.recipientType;
    /**
     * 接收者对象值，可能存在department_id、user_id等，需要进行lark_id的转换
     * <p> 示例值：
     */
    this.recipientValue = builder.recipientValue;
    /**
     * recipient 详情
     * <p> 示例值：
     */
    this.recipientDetail = builder.recipientDetail;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getRecipientType() {
    return this.recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public String getRecipientValue() {
    return this.recipientValue;
  }

  public void setRecipientValue(String recipientValue) {
    this.recipientValue = recipientValue;
  }

  public AuditRecipientDetail getRecipientDetail() {
    return this.recipientDetail;
  }

  public void setRecipientDetail(AuditRecipientDetail recipientDetail) {
    this.recipientDetail = recipientDetail;
  }

  public static class Builder {

    /**
     * 接收者对象类型
     * <p> 示例值：
     */
    private String recipientType;
    /**
     * 接收者对象值，可能存在department_id、user_id等，需要进行lark_id的转换
     * <p> 示例值：
     */
    private String recipientValue;
    /**
     * recipient 详情
     * <p> 示例值：
     */
    private AuditRecipientDetail recipientDetail;

    /**
     * 接收者对象类型
     * <p> 示例值：
     *
     * @param recipientType
     * @return
     */
    public Builder recipientType(String recipientType) {
      this.recipientType = recipientType;
      return this;
    }


    /**
     * 接收者对象值，可能存在department_id、user_id等，需要进行lark_id的转换
     * <p> 示例值：
     *
     * @param recipientValue
     * @return
     */
    public Builder recipientValue(String recipientValue) {
      this.recipientValue = recipientValue;
      return this;
    }


    /**
     * recipient 详情
     * <p> 示例值：
     *
     * @param recipientDetail
     * @return
     */
    public Builder recipientDetail(AuditRecipientDetail recipientDetail) {
      this.recipientDetail = recipientDetail;
      return this;
    }


    public AuditRecipientEntity build() {
      return new AuditRecipientEntity(this);
    }
  }
}
