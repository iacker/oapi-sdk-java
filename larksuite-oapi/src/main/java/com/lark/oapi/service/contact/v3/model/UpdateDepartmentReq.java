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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class UpdateDepartmentReq {

  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 此次调用中使用的部门ID的类型
   * <p> 示例值：open_department_id
   */
  @Query
  @SerializedName("department_id_type")
  private String departmentIdType;
  /**
   * 部门ID，需要与查询参数中传入的department_id_type类型保持一致。
   * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
   */
  @Path
  @SerializedName("department_id")
  private String departmentId;
  @Body
  private Department body;

  // builder 开始
  public UpdateDepartmentReq() {
  }

  public UpdateDepartmentReq(Builder builder) {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 此次调用中使用的部门ID的类型
     * <p> 示例值：open_department_id
     */
    this.departmentIdType = builder.departmentIdType;
    /**
     * 部门ID，需要与查询参数中传入的department_id_type类型保持一致。
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    this.departmentId = builder.departmentId;
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

  public String getDepartmentIdType() {
    return this.departmentIdType;
  }

  public void setDepartmentIdType(String departmentIdType) {
    this.departmentIdType = departmentIdType;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public Department getDepartment() {
    return this.body;
  }

  public void setDepartment(Department body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType; // 此次调用中使用的用户ID的类型
    private String departmentIdType; // 此次调用中使用的部门ID的类型
    private String departmentId; // 部门ID，需要与查询参数中传入的department_id_type类型保持一致。
    private Department body;

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
     * @param userIdType {@link com.lark.oapi.service.contact.v3.enums.UpdateDepartmentUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.contact.v3.enums.UpdateDepartmentUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 此次调用中使用的部门ID的类型
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
     * 此次调用中使用的部门ID的类型
     * <p> 示例值：open_department_id
     *
     * @param departmentIdType {@link com.lark.oapi.service.contact.v3.enums.UpdateDepartmentDepartmentIdTypeEnum}
     * @return
     */
    public Builder departmentIdType(
        com.lark.oapi.service.contact.v3.enums.UpdateDepartmentDepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }

    /**
     * 部门ID，需要与查询参数中传入的department_id_type类型保持一致。
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     *
     * @param departmentId
     * @return
     */
    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Department getDepartment() {
      return this.body;
    }

    /**
     * body
     *
     * @param body
     * @return
     */
    public Builder department(Department body) {
      this.body = body;
      return this;
    }

    public UpdateDepartmentReq build() {
      return new UpdateDepartmentReq(this);
    }
  }
}
