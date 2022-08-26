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
import java.util.Map;

public class AppTableRecord {

  /**
   * 记录 id，更新多条记录时必填
   * <p> 示例值：recqwIwhc6
   */
  @SerializedName("record_id")
  private String recordId;
  /**
   * 创建人
   * <p> 示例值：
   */
  @SerializedName("created_by")
  private Person createdBy;
  /**
   * 创建时间
   * <p> 示例值：1610281603
   */
  @SerializedName("created_time")
  private Integer createdTime;
  /**
   * 修改人
   * <p> 示例值：
   */
  @SerializedName("last_modified_by")
  private Person lastModifiedBy;
  /**
   * 最近更新时间
   * <p> 示例值：1610281603
   */
  @SerializedName("last_modified_time")
  private Integer lastModifiedTime;
  /**
   * 记录字段;;关于支持新增的字段类型，请参考[接入指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/bitable/notification)
   * <p> 示例值：
   */
  @SerializedName("fields")
  private Map<String, Object> fields;

  // builder 开始
  public AppTableRecord() {
  }

  public AppTableRecord(Builder builder) {
    /**
     * 记录 id，更新多条记录时必填
     * <p> 示例值：recqwIwhc6
     */
    this.recordId = builder.recordId;
    /**
     * 创建人
     * <p> 示例值：
     */
    this.createdBy = builder.createdBy;
    /**
     * 创建时间
     * <p> 示例值：1610281603
     */
    this.createdTime = builder.createdTime;
    /**
     * 修改人
     * <p> 示例值：
     */
    this.lastModifiedBy = builder.lastModifiedBy;
    /**
     * 最近更新时间
     * <p> 示例值：1610281603
     */
    this.lastModifiedTime = builder.lastModifiedTime;
    /**
     * 记录字段;;关于支持新增的字段类型，请参考[接入指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/bitable/notification)
     * <p> 示例值：
     */
    this.fields = builder.fields;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getRecordId() {
    return this.recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public Person getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(Person createdBy) {
    this.createdBy = createdBy;
  }

  public Integer getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public Person getLastModifiedBy() {
    return this.lastModifiedBy;
  }

  public void setLastModifiedBy(Person lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public Integer getLastModifiedTime() {
    return this.lastModifiedTime;
  }

  public void setLastModifiedTime(Integer lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Map<String, Object> getFields() {
    return this.fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public static class Builder {

    /**
     * 记录 id，更新多条记录时必填
     * <p> 示例值：recqwIwhc6
     */
    private String recordId;
    /**
     * 创建人
     * <p> 示例值：
     */
    private Person createdBy;
    /**
     * 创建时间
     * <p> 示例值：1610281603
     */
    private Integer createdTime;
    /**
     * 修改人
     * <p> 示例值：
     */
    private Person lastModifiedBy;
    /**
     * 最近更新时间
     * <p> 示例值：1610281603
     */
    private Integer lastModifiedTime;
    /**
     * 记录字段;;关于支持新增的字段类型，请参考[接入指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/bitable/notification)
     * <p> 示例值：
     */
    private Map<String, Object> fields;

    /**
     * 记录 id，更新多条记录时必填
     * <p> 示例值：recqwIwhc6
     *
     * @param recordId
     * @return
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }


    /**
     * 创建人
     * <p> 示例值：
     *
     * @param createdBy
     * @return
     */
    public Builder createdBy(Person createdBy) {
      this.createdBy = createdBy;
      return this;
    }


    /**
     * 创建时间
     * <p> 示例值：1610281603
     *
     * @param createdTime
     * @return
     */
    public Builder createdTime(Integer createdTime) {
      this.createdTime = createdTime;
      return this;
    }


    /**
     * 修改人
     * <p> 示例值：
     *
     * @param lastModifiedBy
     * @return
     */
    public Builder lastModifiedBy(Person lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
    }


    /**
     * 最近更新时间
     * <p> 示例值：1610281603
     *
     * @param lastModifiedTime
     * @return
     */
    public Builder lastModifiedTime(Integer lastModifiedTime) {
      this.lastModifiedTime = lastModifiedTime;
      return this;
    }


    /**
     * 记录字段;;关于支持新增的字段类型，请参考[接入指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/bitable/notification)
     * <p> 示例值：
     *
     * @param fields
     * @return
     */
    public Builder fields(Map<String, Object> fields) {
      this.fields = fields;
      return this;
    }


    public AppTableRecord build() {
      return new AppTableRecord(this);
    }
  }
}
