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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class ChildField {

  /**
   * 子字段编号
   * <p> 示例值：50121
   */
  @SerializedName("code")
  private String code;
  /**
   * 子字段名称
   * <p> 示例值：工号
   */
  @SerializedName("title")
  private String title;
  /**
   * 时间单位
   * <p> 示例值：
   */
  @SerializedName("time_unit")
  private String timeUnit;

  // builder 开始
  public ChildField() {
  }

  public ChildField(Builder builder) {
    /**
     * 子字段编号
     * <p> 示例值：50121
     */
    this.code = builder.code;
    /**
     * 子字段名称
     * <p> 示例值：工号
     */
    this.title = builder.title;
    /**
     * 时间单位
     * <p> 示例值：
     */
    this.timeUnit = builder.timeUnit;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTimeUnit() {
    return this.timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public static class Builder {

    /**
     * 子字段编号
     * <p> 示例值：50121
     */
    private String code;
    /**
     * 子字段名称
     * <p> 示例值：工号
     */
    private String title;
    /**
     * 时间单位
     * <p> 示例值：
     */
    private String timeUnit;

    /**
     * 子字段编号
     * <p> 示例值：50121
     *
     * @param code
     * @return
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }


    /**
     * 子字段名称
     * <p> 示例值：工号
     *
     * @param title
     * @return
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }


    /**
     * 时间单位
     * <p> 示例值：
     *
     * @param timeUnit
     * @return
     */
    public Builder timeUnit(String timeUnit) {
      this.timeUnit = timeUnit;
      return this;
    }


    public ChildField build() {
      return new ChildField(this);
    }
  }
}
