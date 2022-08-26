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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppTableFieldProperty {

  /**
   * 单选、多选字段的选项信息
   * <p> 示例值：
   */
  @SerializedName("options")
  private AppTableFieldPropertyOption[] options;
  /**
   * 数字、公式字段的显示格式
   * <p> 示例值：0
   */
  @SerializedName("formatter")
  private String formatter;
  /**
   * 日期、创建时间、最后更新时间字段的显示格式
   * <p> 示例值：日期格式
   */
  @SerializedName("date_formatter")
  private String dateFormatter;
  /**
   * 日期字段中新纪录自动填写创建时间
   * <p> 示例值：false
   */
  @SerializedName("auto_fill")
  private Boolean autoFill;
  /**
   * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
   * <p> 示例值：false
   */
  @SerializedName("multiple")
  private Boolean multiple;
  /**
   * 单向关联、双向关联字段中关联的数据表的id
   * <p> 示例值：tblsRc9GRRXKqhvW
   */
  @SerializedName("table_id")
  private String tableId;
  /**
   * 单向关联、双向关联字段中关联的数据表的名字
   * <p> 示例值："table2"
   */
  @SerializedName("table_name")
  private String tableName;
  /**
   * 双向关联字段中关联的数据表中对应的双向关联字段的名字
   * <p> 示例值："table1-双向关联"
   */
  @SerializedName("back_field_name")
  private String backFieldName;
  /**
   * 自动编号类型
   * <p> 示例值：
   */
  @SerializedName("auto_serial")
  private AppFieldPropertyAutoSerial autoSerial;
  /**
   * 地理位置输入方式
   * <p> 示例值：
   */
  @SerializedName("location")
  private AppFieldPropertyLocation location;

  // builder 开始
  public AppTableFieldProperty() {
  }

  public AppTableFieldProperty(Builder builder) {
    /**
     * 单选、多选字段的选项信息
     * <p> 示例值：
     */
    this.options = builder.options;
    /**
     * 数字、公式字段的显示格式
     * <p> 示例值：0
     */
    this.formatter = builder.formatter;
    /**
     * 日期、创建时间、最后更新时间字段的显示格式
     * <p> 示例值：日期格式
     */
    this.dateFormatter = builder.dateFormatter;
    /**
     * 日期字段中新纪录自动填写创建时间
     * <p> 示例值：false
     */
    this.autoFill = builder.autoFill;
    /**
     * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
     * <p> 示例值：false
     */
    this.multiple = builder.multiple;
    /**
     * 单向关联、双向关联字段中关联的数据表的id
     * <p> 示例值：tblsRc9GRRXKqhvW
     */
    this.tableId = builder.tableId;
    /**
     * 单向关联、双向关联字段中关联的数据表的名字
     * <p> 示例值："table2"
     */
    this.tableName = builder.tableName;
    /**
     * 双向关联字段中关联的数据表中对应的双向关联字段的名字
     * <p> 示例值："table1-双向关联"
     */
    this.backFieldName = builder.backFieldName;
    /**
     * 自动编号类型
     * <p> 示例值：
     */
    this.autoSerial = builder.autoSerial;
    /**
     * 地理位置输入方式
     * <p> 示例值：
     */
    this.location = builder.location;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public AppTableFieldPropertyOption[] getOptions() {
    return this.options;
  }

  public void setOptions(AppTableFieldPropertyOption[] options) {
    this.options = options;
  }

  public String getFormatter() {
    return this.formatter;
  }

  public void setFormatter(String formatter) {
    this.formatter = formatter;
  }

  public String getDateFormatter() {
    return this.dateFormatter;
  }

  public void setDateFormatter(String dateFormatter) {
    this.dateFormatter = dateFormatter;
  }

  public Boolean getAutoFill() {
    return this.autoFill;
  }

  public void setAutoFill(Boolean autoFill) {
    this.autoFill = autoFill;
  }

  public Boolean getMultiple() {
    return this.multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }

  public String getTableId() {
    return this.tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getBackFieldName() {
    return this.backFieldName;
  }

  public void setBackFieldName(String backFieldName) {
    this.backFieldName = backFieldName;
  }

  public AppFieldPropertyAutoSerial getAutoSerial() {
    return this.autoSerial;
  }

  public void setAutoSerial(AppFieldPropertyAutoSerial autoSerial) {
    this.autoSerial = autoSerial;
  }

  public AppFieldPropertyLocation getLocation() {
    return this.location;
  }

  public void setLocation(AppFieldPropertyLocation location) {
    this.location = location;
  }

  public static class Builder {

    /**
     * 单选、多选字段的选项信息
     * <p> 示例值：
     */
    private AppTableFieldPropertyOption[] options;
    /**
     * 数字、公式字段的显示格式
     * <p> 示例值：0
     */
    private String formatter;
    /**
     * 日期、创建时间、最后更新时间字段的显示格式
     * <p> 示例值：日期格式
     */
    private String dateFormatter;
    /**
     * 日期字段中新纪录自动填写创建时间
     * <p> 示例值：false
     */
    private Boolean autoFill;
    /**
     * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
     * <p> 示例值：false
     */
    private Boolean multiple;
    /**
     * 单向关联、双向关联字段中关联的数据表的id
     * <p> 示例值：tblsRc9GRRXKqhvW
     */
    private String tableId;
    /**
     * 单向关联、双向关联字段中关联的数据表的名字
     * <p> 示例值："table2"
     */
    private String tableName;
    /**
     * 双向关联字段中关联的数据表中对应的双向关联字段的名字
     * <p> 示例值："table1-双向关联"
     */
    private String backFieldName;
    /**
     * 自动编号类型
     * <p> 示例值：
     */
    private AppFieldPropertyAutoSerial autoSerial;
    /**
     * 地理位置输入方式
     * <p> 示例值：
     */
    private AppFieldPropertyLocation location;

    /**
     * 单选、多选字段的选项信息
     * <p> 示例值：
     *
     * @param options
     * @return
     */
    public Builder options(AppTableFieldPropertyOption[] options) {
      this.options = options;
      return this;
    }


    /**
     * 数字、公式字段的显示格式
     * <p> 示例值：0
     *
     * @param formatter
     * @return
     */
    public Builder formatter(String formatter) {
      this.formatter = formatter;
      return this;
    }


    /**
     * 日期、创建时间、最后更新时间字段的显示格式
     * <p> 示例值：日期格式
     *
     * @param dateFormatter
     * @return
     */
    public Builder dateFormatter(String dateFormatter) {
      this.dateFormatter = dateFormatter;
      return this;
    }


    /**
     * 日期字段中新纪录自动填写创建时间
     * <p> 示例值：false
     *
     * @param autoFill
     * @return
     */
    public Builder autoFill(Boolean autoFill) {
      this.autoFill = autoFill;
      return this;
    }


    /**
     * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
     * <p> 示例值：false
     *
     * @param multiple
     * @return
     */
    public Builder multiple(Boolean multiple) {
      this.multiple = multiple;
      return this;
    }


    /**
     * 单向关联、双向关联字段中关联的数据表的id
     * <p> 示例值：tblsRc9GRRXKqhvW
     *
     * @param tableId
     * @return
     */
    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }


    /**
     * 单向关联、双向关联字段中关联的数据表的名字
     * <p> 示例值："table2"
     *
     * @param tableName
     * @return
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }


    /**
     * 双向关联字段中关联的数据表中对应的双向关联字段的名字
     * <p> 示例值："table1-双向关联"
     *
     * @param backFieldName
     * @return
     */
    public Builder backFieldName(String backFieldName) {
      this.backFieldName = backFieldName;
      return this;
    }


    /**
     * 自动编号类型
     * <p> 示例值：
     *
     * @param autoSerial
     * @return
     */
    public Builder autoSerial(AppFieldPropertyAutoSerial autoSerial) {
      this.autoSerial = autoSerial;
      return this;
    }


    /**
     * 地理位置输入方式
     * <p> 示例值：
     *
     * @param location
     * @return
     */
    public Builder location(AppFieldPropertyLocation location) {
      this.location = location;
      return this;
    }


    public AppTableFieldProperty build() {
      return new AppTableFieldProperty(this);
    }
  }
}
