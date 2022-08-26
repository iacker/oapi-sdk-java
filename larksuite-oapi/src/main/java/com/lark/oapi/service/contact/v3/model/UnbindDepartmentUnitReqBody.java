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

public class UnbindDepartmentUnitReqBody {

  /**
   * 单位ID
   * <p> 示例值：BU121
   */
  @SerializedName("unit_id")
  private String unitId;
  /**
   * 预解除关联的部门ID
   * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
   */
  @SerializedName("department_id")
  private String departmentId;
  /**
   * 此次调用中使用的部门ID的类型
   * <p> 示例值：open_department_id
   */
  @SerializedName("department_id_type")
  private String departmentIdType;

  // builder 开始
  public UnbindDepartmentUnitReqBody() {
  }

  public UnbindDepartmentUnitReqBody(Builder builder) {
    /**
     * 单位ID
     * <p> 示例值：BU121
     */
    this.unitId = builder.unitId;
    /**
     * 预解除关联的部门ID
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    this.departmentId = builder.departmentId;
    /**
     * 此次调用中使用的部门ID的类型
     * <p> 示例值：open_department_id
     */
    this.departmentIdType = builder.departmentIdType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUnitId() {
    return this.unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentIdType() {
    return this.departmentIdType;
  }

  public void setDepartmentIdType(String departmentIdType) {
    this.departmentIdType = departmentIdType;
  }

  public static class Builder {

    /**
     * 单位ID
     * <p> 示例值：BU121
     */
    private String unitId;
    /**
     * 预解除关联的部门ID
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    private String departmentId;
    /**
     * 此次调用中使用的部门ID的类型
     * <p> 示例值：open_department_id
     */
    private String departmentIdType;

    /**
     * 单位ID
     * <p> 示例值：BU121
     *
     * @param unitId
     * @return
     */
    public Builder unitId(String unitId) {
      this.unitId = unitId;
      return this;
    }


    /**
     * 预解除关联的部门ID
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     *
     * @param departmentId
     * @return
     */
    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
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
     * @param departmentIdType {@link com.lark.oapi.service.contact.v3.enums.UnbindDepartmentUnitDepartmentIdTypeEnum}
     * @return
     */
    public Builder departmentIdType(
        com.lark.oapi.service.contact.v3.enums.UnbindDepartmentUnitDepartmentIdTypeEnum departmentIdType) {
      this.departmentIdType = departmentIdType.getValue();
      return this;
    }


    public UnbindDepartmentUnitReqBody build() {
      return new UnbindDepartmentUnitReqBody(this);
    }
  }
}
