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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class GridColumn {

  /**
   * 当前分栏列占整个分栏的比例
   * <p> 示例值：50
   */
  @SerializedName("width_ratio")
  private Integer widthRatio;

  // builder 开始
  public GridColumn() {
  }

  public GridColumn(Builder builder) {
    /**
     * 当前分栏列占整个分栏的比例
     * <p> 示例值：50
     */
    this.widthRatio = builder.widthRatio;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getWidthRatio() {
    return this.widthRatio;
  }

  public void setWidthRatio(Integer widthRatio) {
    this.widthRatio = widthRatio;
  }

  public static class Builder {

    /**
     * 当前分栏列占整个分栏的比例
     * <p> 示例值：50
     */
    private Integer widthRatio;

    /**
     * 当前分栏列占整个分栏的比例
     * <p> 示例值：50
     *
     * @param widthRatio
     * @return
     */
    public Builder widthRatio(Integer widthRatio) {
      this.widthRatio = widthRatio;
      return this;
    }


    public GridColumn build() {
      return new GridColumn(this);
    }
  }
}
