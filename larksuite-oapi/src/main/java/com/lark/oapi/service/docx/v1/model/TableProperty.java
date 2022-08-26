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

public class TableProperty {

  /**
   * 行数
   * <p> 示例值：1
   */
  @SerializedName("row_size")
  private Integer rowSize;
  /**
   * 列数
   * <p> 示例值：1
   */
  @SerializedName("column_size")
  private Integer columnSize;
  /**
   * 列宽，单位px
   * <p> 示例值：100
   */
  @SerializedName("column_width")
  private Integer[] columnWidth;
  /**
   * 单元格合并信息
   * <p> 示例值：
   */
  @SerializedName("merge_info")
  private TableMergeInfo[] mergeInfo;

  // builder 开始
  public TableProperty() {
  }

  public TableProperty(Builder builder) {
    /**
     * 行数
     * <p> 示例值：1
     */
    this.rowSize = builder.rowSize;
    /**
     * 列数
     * <p> 示例值：1
     */
    this.columnSize = builder.columnSize;
    /**
     * 列宽，单位px
     * <p> 示例值：100
     */
    this.columnWidth = builder.columnWidth;
    /**
     * 单元格合并信息
     * <p> 示例值：
     */
    this.mergeInfo = builder.mergeInfo;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getRowSize() {
    return this.rowSize;
  }

  public void setRowSize(Integer rowSize) {
    this.rowSize = rowSize;
  }

  public Integer getColumnSize() {
    return this.columnSize;
  }

  public void setColumnSize(Integer columnSize) {
    this.columnSize = columnSize;
  }

  public Integer[] getColumnWidth() {
    return this.columnWidth;
  }

  public void setColumnWidth(Integer[] columnWidth) {
    this.columnWidth = columnWidth;
  }

  public TableMergeInfo[] getMergeInfo() {
    return this.mergeInfo;
  }

  public void setMergeInfo(TableMergeInfo[] mergeInfo) {
    this.mergeInfo = mergeInfo;
  }

  public static class Builder {

    /**
     * 行数
     * <p> 示例值：1
     */
    private Integer rowSize;
    /**
     * 列数
     * <p> 示例值：1
     */
    private Integer columnSize;
    /**
     * 列宽，单位px
     * <p> 示例值：100
     */
    private Integer[] columnWidth;
    /**
     * 单元格合并信息
     * <p> 示例值：
     */
    private TableMergeInfo[] mergeInfo;

    /**
     * 行数
     * <p> 示例值：1
     *
     * @param rowSize
     * @return
     */
    public Builder rowSize(Integer rowSize) {
      this.rowSize = rowSize;
      return this;
    }


    /**
     * 列数
     * <p> 示例值：1
     *
     * @param columnSize
     * @return
     */
    public Builder columnSize(Integer columnSize) {
      this.columnSize = columnSize;
      return this;
    }


    /**
     * 列宽，单位px
     * <p> 示例值：100
     *
     * @param columnWidth
     * @return
     */
    public Builder columnWidth(Integer[] columnWidth) {
      this.columnWidth = columnWidth;
      return this;
    }


    /**
     * 单元格合并信息
     * <p> 示例值：
     *
     * @param mergeInfo
     * @return
     */
    public Builder mergeInfo(TableMergeInfo[] mergeInfo) {
      this.mergeInfo = mergeInfo;
      return this;
    }


    public TableProperty build() {
      return new TableProperty(this);
    }
  }
}
