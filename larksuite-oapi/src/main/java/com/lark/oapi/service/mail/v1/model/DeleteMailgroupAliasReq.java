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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteMailgroupAliasReq {

  /**
   * 邮件组id或邮件组邮箱地址
   * <p> 示例值：xxxxxx 或 test_group@xx.xxx
   */
  @Path
  @SerializedName("mailgroup_id")
  private String mailgroupId;
  /**
   * 邮件组别名邮箱地址
   * <p> 示例值：xxx@xx.xxx
   */
  @Path
  @SerializedName("alias_id")
  private String aliasId;

  // builder 开始
  public DeleteMailgroupAliasReq() {
  }

  public DeleteMailgroupAliasReq(Builder builder) {
    /**
     * 邮件组id或邮件组邮箱地址
     * <p> 示例值：xxxxxx 或 test_group@xx.xxx
     */
    this.mailgroupId = builder.mailgroupId;
    /**
     * 邮件组别名邮箱地址
     * <p> 示例值：xxx@xx.xxx
     */
    this.aliasId = builder.aliasId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMailgroupId() {
    return this.mailgroupId;
  }

  public void setMailgroupId(String mailgroupId) {
    this.mailgroupId = mailgroupId;
  }

  public String getAliasId() {
    return this.aliasId;
  }

  public void setAliasId(String aliasId) {
    this.aliasId = aliasId;
  }

  public static class Builder {

    private String mailgroupId; // 邮件组id或邮件组邮箱地址
    private String aliasId; // 邮件组别名邮箱地址

    /**
     * 邮件组id或邮件组邮箱地址
     * <p> 示例值：xxxxxx 或 test_group@xx.xxx
     *
     * @param mailgroupId
     * @return
     */
    public Builder mailgroupId(String mailgroupId) {
      this.mailgroupId = mailgroupId;
      return this;
    }


    /**
     * 邮件组别名邮箱地址
     * <p> 示例值：xxx@xx.xxx
     *
     * @param aliasId
     * @return
     */
    public Builder aliasId(String aliasId) {
      this.aliasId = aliasId;
      return this;
    }

    public DeleteMailgroupAliasReq build() {
      return new DeleteMailgroupAliasReq(this);
    }
  }
}
