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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListScopeReq {

  /**
   * 返回值的用户ID的类型
   * <p> 示例值：user_id
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 返回值的部门ID的类型
   * <p> 示例值：department_id
   */
  @Query
  @SerializedName("department_id_type")
  private String departmentIdType;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
   * <p> 示例值：AQD9/Rn9eij9Pm39ED40/dk53s4Ebp882DYfFaPFbz00L4CMZJrqGdzNyc8BcZtDbwVUvRmQTvyMYicnGWrde9X56TgdBuS+JKiSIkdexPw=
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 分页大小，控制返回值所有列表长度之和
   * <p> 示例值：50
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;

  // builder 开始
  public ListScopeReq() {
  }

  public ListScopeReq(Builder builder) {
    /**
     * 返回值的用户ID的类型
     * <p> 示例值：user_id
     */
    this.userIdType = builder.userIdType;
    /**
     * 返回值的部门ID的类型
     * <p> 示例值：department_id
     */
    this.departmentIdType = builder.departmentIdType;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：AQD9/Rn9eij9Pm39ED40/dk53s4Ebp882DYfFaPFbz00L4CMZJrqGdzNyc8BcZtDbwVUvRmQTvyMYicnGWrde9X56TgdBuS+JKiSIkdexPw=
     */
    this.pageToken = builder.pageToken;
    /**
     * 分页大小，控制返回值所有列表长度之和
     * <p> 示例值：50
     */
    this.pageSize = builder.pageSize;
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

  public String getDepartmentIdType() {
    return this.departmentIdType;
  }

  public void setDepartmentIdType(String departmentIdType) {
    this.departmentIdType = departmentIdType;
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

    private String userIdType; // 返回值的用户ID的类型
    private String departmentIdType; // 返回值的部门ID的类型
    private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
    private Integer pageSize; // 分页大小，控制返回值所有列表长度之和


    /**
     * 返回值的用户ID的类型
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
     * 返回值的用户ID的类型
     * <p> 示例值：user_id
     *
     * @param userIdType {@link com.lark.oapi.service.contact.v3.enums.ListScopeUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.contact.v3.enums.ListScopeUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }


    /**
     * 返回值的部门ID的类型
     * <p> 示例值：department_id
     *
     * @param departmentIdType
     * @return
     */
    public Builder departmentIdType(String departmentIdType) {
      this.departmentIdType = departmentIdType;
      return this;
    }

    /**
     * 返回值的部门ID的类型
     * <p> 示例值：department_id
     *
     * @param departmentIdType {@link com.lark.oapi.service.contact.v3.enums.ListScopeDepartmentIdTypeEnum}
     * @return
     */
    public Builder departmentIdType(
        com.lark.oapi.service.contact.v3.enums.ListScopeDepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }


    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：AQD9/Rn9eij9Pm39ED40/dk53s4Ebp882DYfFaPFbz00L4CMZJrqGdzNyc8BcZtDbwVUvRmQTvyMYicnGWrde9X56TgdBuS+JKiSIkdexPw=
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }


    /**
     * 分页大小，控制返回值所有列表长度之和
     * <p> 示例值：50
     *
     * @param pageSize
     * @return
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public ListScopeReq build() {
      return new ListScopeReq(this);
    }
  }
}
