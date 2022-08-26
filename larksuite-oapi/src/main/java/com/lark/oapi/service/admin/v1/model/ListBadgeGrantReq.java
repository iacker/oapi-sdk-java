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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListBadgeGrantReq {

  /**
   * 分页大小
   * <p> 示例值：10
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
   * <p> 示例值：om5fn1
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 用户 ID 类型
   * <p> 示例值：open_id
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 此次调用中使用的部门ID的类型。
   * <p> 示例值：open_department_id
   */
  @Query
  @SerializedName("department_id_type")
  private String departmentIdType;
  /**
   * 企业勋章的唯一ID
   * <p> 示例值：m_DjMzaK
   */
  @Path
  @SerializedName("badge_id")
  private String badgeId;

  // builder 开始
  public ListBadgeGrantReq() {
  }

  public ListBadgeGrantReq(Builder builder) {
    /**
     * 分页大小
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：om5fn1
     */
    this.pageToken = builder.pageToken;
    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     */
    this.userIdType = builder.userIdType;
    /**
     * 此次调用中使用的部门ID的类型。
     * <p> 示例值：open_department_id
     */
    this.departmentIdType = builder.departmentIdType;
    /**
     * 企业勋章的唯一ID
     * <p> 示例值：m_DjMzaK
     */
    this.badgeId = builder.badgeId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getDepartmentIdType() {
    return this.departmentIdType;
  }

  public void setDepartmentIdType(String departmentIdType) {
    this.departmentIdType = departmentIdType;
  }

  public String getBadgeId() {
    return this.badgeId;
  }

  public void setBadgeId(String badgeId) {
    this.badgeId = badgeId;
  }

  public static class Builder {

    private Integer pageSize; // 分页大小
    private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
    private String userIdType; // 用户 ID 类型
    private String departmentIdType; // 此次调用中使用的部门ID的类型。
    private String badgeId; // 企业勋章的唯一ID

    /**
     * 分页大小
     * <p> 示例值：10
     *
     * @param pageSize
     * @return
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：om5fn1
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    /**
     * 用户 ID 类型
     * <p> 示例值：open_id
     *
     * @param userIdType {@link com.lark.oapi.service.admin.v1.enums.ListBadgeGrantUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.admin.v1.enums.ListBadgeGrantUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 此次调用中使用的部门ID的类型。
     * <p> 示例值：open_department_id
     *
     * @param departmentIdType
     * @return
     */
    public Builder departmentIdType(String departmentIdType) {
      this.departmentIdType = departmentIdType;
      return this;
    }

    /**
     * 此次调用中使用的部门ID的类型。
     * <p> 示例值：open_department_id
     *
     * @param departmentIdType {@link com.lark.oapi.service.admin.v1.enums.ListBadgeGrantDepartmentIdTypeEnum}
     * @return
     */
    public Builder departmentIdType(
        com.lark.oapi.service.admin.v1.enums.ListBadgeGrantDepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }

    /**
     * 企业勋章的唯一ID
     * <p> 示例值：m_DjMzaK
     *
     * @param badgeId
     * @return
     */
    public Builder badgeId(String badgeId) {
      this.badgeId = badgeId;
      return this;
    }

    public ListBadgeGrantReq build() {
      return new ListBadgeGrantReq(this);
    }
  }
}
