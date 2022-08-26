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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class UpdateDimensionProperties {

  /**
   * 需要更新的行列信息
   * <p> 示例值：
   */
  @SerializedName("dimension_range")
  private Dimension dimensionRange;
  /**
   * 更新的属性
   * <p> 示例值：
   */
  @SerializedName("properties")
  private DimensionProperties properties;

  // builder 开始
  public UpdateDimensionProperties() {
  }

  public UpdateDimensionProperties(Builder builder) {
    /**
     * 需要更新的行列信息
     * <p> 示例值：
     */
    this.dimensionRange = builder.dimensionRange;
    /**
     * 更新的属性
     * <p> 示例值：
     */
    this.properties = builder.properties;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Dimension getDimensionRange() {
    return this.dimensionRange;
  }

  public void setDimensionRange(Dimension dimensionRange) {
    this.dimensionRange = dimensionRange;
  }

  public DimensionProperties getProperties() {
    return this.properties;
  }

  public void setProperties(DimensionProperties properties) {
    this.properties = properties;
  }

  public static class Builder {

    /**
     * 需要更新的行列信息
     * <p> 示例值：
     */
    private Dimension dimensionRange;
    /**
     * 更新的属性
     * <p> 示例值：
     */
    private DimensionProperties properties;

    /**
     * 需要更新的行列信息
     * <p> 示例值：
     *
     * @param dimensionRange
     * @return
     */
    public Builder dimensionRange(Dimension dimensionRange) {
      this.dimensionRange = dimensionRange;
      return this;
    }


    /**
     * 更新的属性
     * <p> 示例值：
     *
     * @param properties
     * @return
     */
    public Builder properties(DimensionProperties properties) {
      this.properties = properties;
      return this;
    }


    public UpdateDimensionProperties build() {
      return new UpdateDimensionProperties(this);
    }
  }
}
