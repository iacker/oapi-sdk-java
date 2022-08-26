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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListAppTableRecordReq {

  /**
   * 视图 id;;注意：如 filter 或 sort 有值，view_id 会被忽略。
   * <p> 示例值：vewqhz51lk
   */
  @Query
  @SerializedName("view_id")
  private String viewId;
  /**
   * 筛选参数;;注意：;;1.筛选记录的表达式不超过2000个字符。;;2.不支持对“人员”以及“关联字段”的属性进行过滤筛选，如人员的
   * OpenID。;;3.仅支持字段在页面展示字符值进行筛选。;;详细请参考[记录筛选开发指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/filter)
   * <p> 示例值：示例表达式：;;AND(CurrentValue.[身高]>180, CurrentValue.[体重]>150)
   */
  @Query
  @SerializedName("filter")
  private String filter;
  /**
   * 排序参数;;注意：;;1.表达式需要不超过1000字符。;;2.不支持对带“公式”和“关联字段”的表的使用。
   * <p> 示例值：["字段1 DESC","字段2 ASC"];;注意：使用引号将字段名称和顺序逆序连接起来。
   */
  @Query
  @SerializedName("sort")
  private String sort;
  /**
   * 字段名称
   * <p> 示例值：["字段1"]
   */
  @Query
  @SerializedName("field_names")
  private String fieldNames;
  /**
   * 控制多行文本字段数据的返回格式，true 表示以数组形式返回。;;注意：;;1.多行文本中如果有超链接部分，则会返回链接的 URL。;;2.目前可以返回多行文本中 URL
   * 类型为多维表格链接、飞书 doc、飞书 sheet的URL类型以及@人员的数据结构。
   * <p> 示例值：true
   */
  @Query
  @SerializedName("text_field_as_array")
  private Boolean textFieldAsArray;
  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 控制公式、查找引用是否显示完整的原样返回结果
   * <p> 示例值：true
   */
  @Query
  @SerializedName("display_formula_ref")
  private Boolean displayFormulaRef;
  /**
   * 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
   * <p> 示例值：true
   */
  @Query
  @SerializedName("automatic_fields")
  private Boolean automaticFields;
  /**
   * <p> 示例值：recn0hoyXL
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * <p> 示例值：10
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  /**
   * bitable app token
   * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
   */
  @Path
  @SerializedName("app_token")
  private String appToken;
  /**
   * table id
   * <p> 示例值：tblxI2tWaxP5dG7p
   */
  @Path
  @SerializedName("table_id")
  private String tableId;

  // builder 开始
  public ListAppTableRecordReq() {
  }

  public ListAppTableRecordReq(Builder builder) {
    /**
     * 视图 id;;注意：如 filter 或 sort 有值，view_id 会被忽略。
     * <p> 示例值：vewqhz51lk
     */
    this.viewId = builder.viewId;
    /**
     * 筛选参数;;注意：;;1.筛选记录的表达式不超过2000个字符。;;2.不支持对“人员”以及“关联字段”的属性进行过滤筛选，如人员的 OpenID。;;3.仅支持字段在页面展示字符值进行筛选。;;详细请参考[记录筛选开发指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/filter)
     * <p> 示例值：示例表达式：;;AND(CurrentValue.[身高]>180, CurrentValue.[体重]>150)
     */
    this.filter = builder.filter;
    /**
     * 排序参数;;注意：;;1.表达式需要不超过1000字符。;;2.不支持对带“公式”和“关联字段”的表的使用。
     * <p> 示例值：["字段1 DESC","字段2 ASC"];;注意：使用引号将字段名称和顺序逆序连接起来。
     */
    this.sort = builder.sort;
    /**
     * 字段名称
     * <p> 示例值：["字段1"]
     */
    this.fieldNames = builder.fieldNames;
    /**
     * 控制多行文本字段数据的返回格式，true 表示以数组形式返回。;;注意：;;1.多行文本中如果有超链接部分，则会返回链接的 URL。;;2.目前可以返回多行文本中 URL 类型为多维表格链接、飞书 doc、飞书 sheet的URL类型以及@人员的数据结构。
     * <p> 示例值：true
     */
    this.textFieldAsArray = builder.textFieldAsArray;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 控制公式、查找引用是否显示完整的原样返回结果
     * <p> 示例值：true
     */
    this.displayFormulaRef = builder.displayFormulaRef;
    /**
     * 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
     * <p> 示例值：true
     */
    this.automaticFields = builder.automaticFields;
    /**
     *
     * <p> 示例值：recn0hoyXL
     */
    this.pageToken = builder.pageToken;
    /**
     *
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
    /**
     * bitable app token
     * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
     */
    this.appToken = builder.appToken;
    /**
     * table id
     * <p> 示例值：tblxI2tWaxP5dG7p
     */
    this.tableId = builder.tableId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getViewId() {
    return this.viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
  }

  public String getFilter() {
    return this.filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public String getSort() {
    return this.sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getFieldNames() {
    return this.fieldNames;
  }

  public void setFieldNames(String fieldNames) {
    this.fieldNames = fieldNames;
  }

  public Boolean getTextFieldAsArray() {
    return this.textFieldAsArray;
  }

  public void setTextFieldAsArray(Boolean textFieldAsArray) {
    this.textFieldAsArray = textFieldAsArray;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public Boolean getDisplayFormulaRef() {
    return this.displayFormulaRef;
  }

  public void setDisplayFormulaRef(Boolean displayFormulaRef) {
    this.displayFormulaRef = displayFormulaRef;
  }

  public Boolean getAutomaticFields() {
    return this.automaticFields;
  }

  public void setAutomaticFields(Boolean automaticFields) {
    this.automaticFields = automaticFields;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getTableId() {
    return this.tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  public static class Builder {

    private String viewId; // 视图 id;;注意：如 filter 或 sort 有值，view_id 会被忽略。
    private String filter; // 筛选参数;;注意：;;1.筛选记录的表达式不超过2000个字符。;;2.不支持对“人员”以及“关联字段”的属性进行过滤筛选，如人员的 OpenID。;;3.仅支持字段在页面展示字符值进行筛选。;;详细请参考[记录筛选开发指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/filter)
    private String sort; // 排序参数;;注意：;;1.表达式需要不超过1000字符。;;2.不支持对带“公式”和“关联字段”的表的使用。
    private String fieldNames; // 字段名称
    private Boolean textFieldAsArray; // 控制多行文本字段数据的返回格式，true 表示以数组形式返回。;;注意：;;1.多行文本中如果有超链接部分，则会返回链接的 URL。;;2.目前可以返回多行文本中 URL 类型为多维表格链接、飞书 doc、飞书 sheet的URL类型以及@人员的数据结构。
    private String userIdType; // 此次调用中使用的用户ID的类型
    private Boolean displayFormulaRef; // 控制公式、查找引用是否显示完整的原样返回结果
    private Boolean automaticFields; // 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true 表示返回
    private String pageToken; //
    private Integer pageSize; //
    private String appToken; // bitable app token
    private String tableId; // table id

    /**
     * 视图 id;;注意：如 filter 或 sort 有值，view_id 会被忽略。
     * <p> 示例值：vewqhz51lk
     *
     * @param viewId
     * @return
     */
    public Builder viewId(String viewId) {
      this.viewId = viewId;
      return this;
    }

    /**
     * 筛选参数;;注意：;;1.筛选记录的表达式不超过2000个字符。;;2.不支持对“人员”以及“关联字段”的属性进行过滤筛选，如人员的
     * OpenID。;;3.仅支持字段在页面展示字符值进行筛选。;;详细请参考[记录筛选开发指南](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/filter)
     * <p> 示例值：示例表达式：;;AND(CurrentValue.[身高]>180, CurrentValue.[体重]>150)
     *
     * @param filter
     * @return
     */
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * 排序参数;;注意：;;1.表达式需要不超过1000字符。;;2.不支持对带“公式”和“关联字段”的表的使用。
     * <p> 示例值：["字段1 DESC","字段2 ASC"];;注意：使用引号将字段名称和顺序逆序连接起来。
     *
     * @param sort
     * @return
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * 字段名称
     * <p> 示例值：["字段1"]
     *
     * @param fieldNames
     * @return
     */
    public Builder fieldNames(String fieldNames) {
      this.fieldNames = fieldNames;
      return this;
    }

    /**
     * 控制多行文本字段数据的返回格式，true 表示以数组形式返回。;;注意：;;1.多行文本中如果有超链接部分，则会返回链接的 URL。;;2.目前可以返回多行文本中 URL
     * 类型为多维表格链接、飞书 doc、飞书 sheet的URL类型以及@人员的数据结构。
     * <p> 示例值：true
     *
     * @param textFieldAsArray
     * @return
     */
    public Builder textFieldAsArray(Boolean textFieldAsArray) {
      this.textFieldAsArray = textFieldAsArray;
      return this;
    }

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType {@link com.lark.oapi.service.bitable.v1.enums.ListAppTableRecordUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.bitable.v1.enums.ListAppTableRecordUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 控制公式、查找引用是否显示完整的原样返回结果
     * <p> 示例值：true
     *
     * @param displayFormulaRef
     * @return
     */
    public Builder displayFormulaRef(Boolean displayFormulaRef) {
      this.displayFormulaRef = displayFormulaRef;
      return this;
    }

    /**
     * 控制是否返回自动计算的字段，例如 `created_by`/`created_time`/`last_modified_by`/`last_modified_time`，true
     * 表示返回
     * <p> 示例值：true
     *
     * @param automaticFields
     * @return
     */
    public Builder automaticFields(Boolean automaticFields) {
      this.automaticFields = automaticFields;
      return this;
    }

    /**
     * <p> 示例值：recn0hoyXL
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * <p> 示例值：10
     *
     * @param pageSize
     * @return
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * bitable app token
     * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
     *
     * @param appToken
     * @return
     */
    public Builder appToken(String appToken) {
      this.appToken = appToken;
      return this;
    }


    /**
     * table id
     * <p> 示例值：tblxI2tWaxP5dG7p
     *
     * @param tableId
     * @return
     */
    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    public ListAppTableRecordReq build() {
      return new ListAppTableRecordReq(this);
    }
  }
}
