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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class ReserveActionPermission {

  /**
   * 权限项
   * <p> 示例值：1
   */
  @SerializedName("permission")
  private Integer permission;
  /**
   * 权限检查器列表，权限检查器之间为"逻辑或"的关系（即 有一个为true则拥有该权限）
   * <p> 示例值：
   */
  @SerializedName("permission_checkers")
  private ReservePermissionChecker[] permissionCheckers;

  // builder 开始
  public ReserveActionPermission() {
  }

  public ReserveActionPermission(Builder builder) {
    /**
     * 权限项
     * <p> 示例值：1
     */
    this.permission = builder.permission;
    /**
     * 权限检查器列表，权限检查器之间为"逻辑或"的关系（即 有一个为true则拥有该权限）
     * <p> 示例值：
     */
    this.permissionCheckers = builder.permissionCheckers;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getPermission() {
    return this.permission;
  }

  public void setPermission(Integer permission) {
    this.permission = permission;
  }

  public ReservePermissionChecker[] getPermissionCheckers() {
    return this.permissionCheckers;
  }

  public void setPermissionCheckers(ReservePermissionChecker[] permissionCheckers) {
    this.permissionCheckers = permissionCheckers;
  }

  public static class Builder {

    /**
     * 权限项
     * <p> 示例值：1
     */
    private Integer permission;
    /**
     * 权限检查器列表，权限检查器之间为"逻辑或"的关系（即 有一个为true则拥有该权限）
     * <p> 示例值：
     */
    private ReservePermissionChecker[] permissionCheckers;

    /**
     * 权限项
     * <p> 示例值：1
     *
     * @param permission
     * @return
     */
    public Builder permission(Integer permission) {
      this.permission = permission;
      return this;
    }

    /**
     * 权限项
     * <p> 示例值：1
     *
     * @param permission {@link com.lark.oapi.service.vc.v1.enums.ReserveActionPermissionMeetingPermEnum}
     * @return
     */
    public Builder permission(
        com.lark.oapi.service.vc.v1.enums.ReserveActionPermissionMeetingPermEnum permission) {
      this.permission = permission.getValue();
      return this;
    }


    /**
     * 权限检查器列表，权限检查器之间为"逻辑或"的关系（即 有一个为true则拥有该权限）
     * <p> 示例值：
     *
     * @param permissionCheckers
     * @return
     */
    public Builder permissionCheckers(ReservePermissionChecker[] permissionCheckers) {
      this.permissionCheckers = permissionCheckers;
      return this;
    }


    public ReserveActionPermission build() {
      return new ReserveActionPermission(this);
    }
  }
}
