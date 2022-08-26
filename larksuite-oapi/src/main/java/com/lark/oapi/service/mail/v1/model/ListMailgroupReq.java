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
import com.lark.oapi.core.annotation.Query;

public class ListMailgroupReq {

  /**
   * 邮件组管理员用户ID，用于获取该用户有管理权限的邮件组
   * <p> 示例值：ou_xxxxxx
   */
  @Query
  @SerializedName("manager_user_id")
  private String managerUserId;
  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * <p> 示例值：xxx
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * <p> 示例值：10
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;

  // builder 开始
  public ListMailgroupReq() {
  }

  public ListMailgroupReq(Builder builder) {
    /**
     * 邮件组管理员用户ID，用于获取该用户有管理权限的邮件组
     * <p> 示例值：ou_xxxxxx
     */
    this.managerUserId = builder.managerUserId;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     *
     * <p> 示例值：xxx
     */
    this.pageToken = builder.pageToken;
    /**
     *
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getManagerUserId() {
    return this.managerUserId;
  }

  public void setManagerUserId(String managerUserId) {
    this.managerUserId = managerUserId;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public static class Builder {

    private String managerUserId; // 邮件组管理员用户ID，用于获取该用户有管理权限的邮件组
    private String userIdType; // 此次调用中使用的用户ID的类型
    private String pageToken; //
    private Integer pageSize; //


    /**
     * 邮件组管理员用户ID，用于获取该用户有管理权限的邮件组
     * <p> 示例值：ou_xxxxxx
     *
     * @param managerUserId
     * @return
     */
    public Builder managerUserId(String managerUserId) {
      this.managerUserId = managerUserId;
      return this;
    }


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
     * @param userIdType {@link com.lark.oapi.service.mail.v1.enums.ListMailgroupUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.mail.v1.enums.ListMailgroupUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }


    /**
     * <p> 示例值：xxx
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }


    /**
     * <p> 示例值：10
     *
     * @param pageSize
     * @return
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public ListMailgroupReq build() {
      return new ListMailgroupReq(this);
    }
  }
}
