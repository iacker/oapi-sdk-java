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

public class ImportTaskMountPoint {

  /**
   * 挂载类型
   * <p> 示例值：1
   */
  @SerializedName("mount_type")
  private Integer mountType;
  /**
   * 挂载位置,对于mount_type=1, 云空间目录token，空表示根目录
   * <p> 示例值：fldxxxxxxxx
   */
  @SerializedName("mount_key")
  private String mountKey;

  // builder 开始
  public ImportTaskMountPoint() {
  }

  public ImportTaskMountPoint(Builder builder) {
    /**
     * 挂载类型
     * <p> 示例值：1
     */
    this.mountType = builder.mountType;
    /**
     * 挂载位置,对于mount_type=1, 云空间目录token，空表示根目录
     * <p> 示例值：fldxxxxxxxx
     */
    this.mountKey = builder.mountKey;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getMountType() {
    return this.mountType;
  }

  public void setMountType(Integer mountType) {
    this.mountType = mountType;
  }

  public String getMountKey() {
    return this.mountKey;
  }

  public void setMountKey(String mountKey) {
    this.mountKey = mountKey;
  }

  public static class Builder {

    /**
     * 挂载类型
     * <p> 示例值：1
     */
    private Integer mountType;
    /**
     * 挂载位置,对于mount_type=1, 云空间目录token，空表示根目录
     * <p> 示例值：fldxxxxxxxx
     */
    private String mountKey;

    /**
     * 挂载类型
     * <p> 示例值：1
     *
     * @param mountType
     * @return
     */
    public Builder mountType(Integer mountType) {
      this.mountType = mountType;
      return this;
    }

    /**
     * 挂载类型
     * <p> 示例值：1
     *
     * @param mountType {@link com.lark.oapi.service.drive.v1.enums.ImportTaskMountPointMountTypeEnum}
     * @return
     */
    public Builder mountType(
        com.lark.oapi.service.drive.v1.enums.ImportTaskMountPointMountTypeEnum mountType) {
      this.mountType = mountType.getValue();
      return this;
    }


    /**
     * 挂载位置,对于mount_type=1, 云空间目录token，空表示根目录
     * <p> 示例值：fldxxxxxxxx
     *
     * @param mountKey
     * @return
     */
    public Builder mountKey(String mountKey) {
      this.mountKey = mountKey;
      return this;
    }


    public ImportTaskMountPoint build() {
      return new ImportTaskMountPoint(this);
    }
  }
}
