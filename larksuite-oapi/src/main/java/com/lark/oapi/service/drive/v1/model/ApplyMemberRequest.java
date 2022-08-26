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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class ApplyMemberRequest {

  /**
   * 需要申请的权限，权限值："view"，"edit"
   * <p> 示例值：view
   */
  @SerializedName("perm")
  private String perm;
  /**
   * 申请权限备注
   * <p> 示例值：apply_remark
   */
  @SerializedName("remark")
  private String remark;

  // builder 开始
  public ApplyMemberRequest() {
  }

  public ApplyMemberRequest(Builder builder) {
    /**
     * 需要申请的权限，权限值："view"，"edit"
     * <p> 示例值：view
     */
    this.perm = builder.perm;
    /**
     * 申请权限备注
     * <p> 示例值：apply_remark
     */
    this.remark = builder.remark;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPerm() {
    return this.perm;
  }

  public void setPerm(String perm) {
    this.perm = perm;
  }

  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public static class Builder {

    /**
     * 需要申请的权限，权限值："view"，"edit"
     * <p> 示例值：view
     */
    private String perm;
    /**
     * 申请权限备注
     * <p> 示例值：apply_remark
     */
    private String remark;

    /**
     * 需要申请的权限，权限值："view"，"edit"
     * <p> 示例值：view
     *
     * @param perm
     * @return
     */
    public Builder perm(String perm) {
      this.perm = perm;
      return this;
    }

    /**
     * 需要申请的权限，权限值："view"，"edit"
     * <p> 示例值：view
     *
     * @param perm {@link com.lark.oapi.service.drive.v1.enums.ApplyMemberRequestPermEnum}
     * @return
     */
    public Builder perm(com.lark.oapi.service.drive.v1.enums.ApplyMemberRequestPermEnum perm) {
      this.perm = perm.getValue();
      return this;
    }


    /**
     * 申请权限备注
     * <p> 示例值：apply_remark
     *
     * @param remark
     * @return
     */
    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }


    public ApplyMemberRequest build() {
      return new ApplyMemberRequest(this);
    }
  }
}
