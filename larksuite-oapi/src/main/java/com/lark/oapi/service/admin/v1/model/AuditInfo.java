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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditInfo {

  /**
   * 事件id
   * <p> 示例值：
   */
  @SerializedName("event_id")
  private String eventId;
  /**
   * 唯一id
   * <p> 示例值：
   */
  @SerializedName("unique_id")
  private String uniqueId;
  /**
   * 事件名称
   * <p> 示例值：
   */
  @SerializedName("event_name")
  private String eventName;
  /**
   * 用户所属部门的ID列表
   * <p> 示例值：
   */
  @SerializedName("department_ids")
  private String[] departmentIds;
  /**
   * 模块
   * <p> 示例值：
   */
  @SerializedName("event_module")
  private Integer eventModule;
  /**
   * 操作人类型
   * <p> 示例值：
   */
  @SerializedName("operator_type")
  private Integer operatorType;
  /**
   * 操作人id
   * <p> 示例值：
   */
  @SerializedName("operator_value")
  private String operatorValue;
  /**
   * 操作对象列表
   * <p> 示例值：
   */
  @SerializedName("objects")
  private AuditObjectEntity[] objects;
  /**
   * 接收者对象列表
   * <p> 示例值：
   */
  @SerializedName("recipients")
  private AuditRecipientEntity[] recipients;
  /**
   * 事件时间
   * <p> 示例值：
   */
  @SerializedName("event_time")
  private Integer eventTime;
  /**
   * ip信息
   * <p> 示例值：
   */
  @SerializedName("ip")
  private String ip;
  /**
   * 第三方isvID
   * <p> 示例值：
   */
  @SerializedName("operator_app")
  private String operatorApp;
  /**
   * 环境信息
   * <p> 示例值：
   */
  @SerializedName("audit_context")
  private AuditContext auditContext;
  /**
   * 事件级别的扩展
   * <p> 示例值：
   */
  @SerializedName("extend")
  private AuditEventExtend extend;
  /**
   * 第三方isv名称
   * <p> 示例值：
   */
  @SerializedName("operator_app_name")
  private String operatorAppName;
  /**
   * 扩展字段信息
   * <p> 示例值：
   */
  @SerializedName("common_drawers")
  private ApiAuditCommonDrawers commonDrawers;

  // builder 开始
  public AuditInfo() {
  }

  public AuditInfo(Builder builder) {
    /**
     * 事件id
     * <p> 示例值：
     */
    this.eventId = builder.eventId;
    /**
     * 唯一id
     * <p> 示例值：
     */
    this.uniqueId = builder.uniqueId;
    /**
     * 事件名称
     * <p> 示例值：
     */
    this.eventName = builder.eventName;
    /**
     * 用户所属部门的ID列表
     * <p> 示例值：
     */
    this.departmentIds = builder.departmentIds;
    /**
     * 模块
     * <p> 示例值：
     */
    this.eventModule = builder.eventModule;
    /**
     * 操作人类型
     * <p> 示例值：
     */
    this.operatorType = builder.operatorType;
    /**
     * 操作人id
     * <p> 示例值：
     */
    this.operatorValue = builder.operatorValue;
    /**
     * 操作对象列表
     * <p> 示例值：
     */
    this.objects = builder.objects;
    /**
     * 接收者对象列表
     * <p> 示例值：
     */
    this.recipients = builder.recipients;
    /**
     * 事件时间
     * <p> 示例值：
     */
    this.eventTime = builder.eventTime;
    /**
     * ip信息
     * <p> 示例值：
     */
    this.ip = builder.ip;
    /**
     * 第三方isvID
     * <p> 示例值：
     */
    this.operatorApp = builder.operatorApp;
    /**
     * 环境信息
     * <p> 示例值：
     */
    this.auditContext = builder.auditContext;
    /**
     * 事件级别的扩展
     * <p> 示例值：
     */
    this.extend = builder.extend;
    /**
     * 第三方isv名称
     * <p> 示例值：
     */
    this.operatorAppName = builder.operatorAppName;
    /**
     * 扩展字段信息
     * <p> 示例值：
     */
    this.commonDrawers = builder.commonDrawers;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getEventId() {
    return this.eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getUniqueId() {
    return this.uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getEventName() {
    return this.eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String[] getDepartmentIds() {
    return this.departmentIds;
  }

  public void setDepartmentIds(String[] departmentIds) {
    this.departmentIds = departmentIds;
  }

  public Integer getEventModule() {
    return this.eventModule;
  }

  public void setEventModule(Integer eventModule) {
    this.eventModule = eventModule;
  }

  public Integer getOperatorType() {
    return this.operatorType;
  }

  public void setOperatorType(Integer operatorType) {
    this.operatorType = operatorType;
  }

  public String getOperatorValue() {
    return this.operatorValue;
  }

  public void setOperatorValue(String operatorValue) {
    this.operatorValue = operatorValue;
  }

  public AuditObjectEntity[] getObjects() {
    return this.objects;
  }

  public void setObjects(AuditObjectEntity[] objects) {
    this.objects = objects;
  }

  public AuditRecipientEntity[] getRecipients() {
    return this.recipients;
  }

  public void setRecipients(AuditRecipientEntity[] recipients) {
    this.recipients = recipients;
  }

  public Integer getEventTime() {
    return this.eventTime;
  }

  public void setEventTime(Integer eventTime) {
    this.eventTime = eventTime;
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getOperatorApp() {
    return this.operatorApp;
  }

  public void setOperatorApp(String operatorApp) {
    this.operatorApp = operatorApp;
  }

  public AuditContext getAuditContext() {
    return this.auditContext;
  }

  public void setAuditContext(AuditContext auditContext) {
    this.auditContext = auditContext;
  }

  public AuditEventExtend getExtend() {
    return this.extend;
  }

  public void setExtend(AuditEventExtend extend) {
    this.extend = extend;
  }

  public String getOperatorAppName() {
    return this.operatorAppName;
  }

  public void setOperatorAppName(String operatorAppName) {
    this.operatorAppName = operatorAppName;
  }

  public ApiAuditCommonDrawers getCommonDrawers() {
    return this.commonDrawers;
  }

  public void setCommonDrawers(ApiAuditCommonDrawers commonDrawers) {
    this.commonDrawers = commonDrawers;
  }

  public static class Builder {

    /**
     * 事件id
     * <p> 示例值：
     */
    private String eventId;
    /**
     * 唯一id
     * <p> 示例值：
     */
    private String uniqueId;
    /**
     * 事件名称
     * <p> 示例值：
     */
    private String eventName;
    /**
     * 用户所属部门的ID列表
     * <p> 示例值：
     */
    private String[] departmentIds;
    /**
     * 模块
     * <p> 示例值：
     */
    private Integer eventModule;
    /**
     * 操作人类型
     * <p> 示例值：
     */
    private Integer operatorType;
    /**
     * 操作人id
     * <p> 示例值：
     */
    private String operatorValue;
    /**
     * 操作对象列表
     * <p> 示例值：
     */
    private AuditObjectEntity[] objects;
    /**
     * 接收者对象列表
     * <p> 示例值：
     */
    private AuditRecipientEntity[] recipients;
    /**
     * 事件时间
     * <p> 示例值：
     */
    private Integer eventTime;
    /**
     * ip信息
     * <p> 示例值：
     */
    private String ip;
    /**
     * 第三方isvID
     * <p> 示例值：
     */
    private String operatorApp;
    /**
     * 环境信息
     * <p> 示例值：
     */
    private AuditContext auditContext;
    /**
     * 事件级别的扩展
     * <p> 示例值：
     */
    private AuditEventExtend extend;
    /**
     * 第三方isv名称
     * <p> 示例值：
     */
    private String operatorAppName;
    /**
     * 扩展字段信息
     * <p> 示例值：
     */
    private ApiAuditCommonDrawers commonDrawers;

    /**
     * 事件id
     * <p> 示例值：
     *
     * @param eventId
     * @return
     */
    public Builder eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }


    /**
     * 唯一id
     * <p> 示例值：
     *
     * @param uniqueId
     * @return
     */
    public Builder uniqueId(String uniqueId) {
      this.uniqueId = uniqueId;
      return this;
    }


    /**
     * 事件名称
     * <p> 示例值：
     *
     * @param eventName
     * @return
     */
    public Builder eventName(String eventName) {
      this.eventName = eventName;
      return this;
    }


    /**
     * 用户所属部门的ID列表
     * <p> 示例值：
     *
     * @param departmentIds
     * @return
     */
    public Builder departmentIds(String[] departmentIds) {
      this.departmentIds = departmentIds;
      return this;
    }


    /**
     * 模块
     * <p> 示例值：
     *
     * @param eventModule
     * @return
     */
    public Builder eventModule(Integer eventModule) {
      this.eventModule = eventModule;
      return this;
    }


    /**
     * 操作人类型
     * <p> 示例值：
     *
     * @param operatorType
     * @return
     */
    public Builder operatorType(Integer operatorType) {
      this.operatorType = operatorType;
      return this;
    }

    /**
     * 操作人类型
     * <p> 示例值：
     *
     * @param operatorType {@link com.lark.oapi.service.admin.v1.enums.AuditInfoOperatorTypeEnum}
     * @return
     */
    public Builder operatorType(
        com.lark.oapi.service.admin.v1.enums.AuditInfoOperatorTypeEnum operatorType) {
      this.operatorType = operatorType.getValue();
      return this;
    }


    /**
     * 操作人id
     * <p> 示例值：
     *
     * @param operatorValue
     * @return
     */
    public Builder operatorValue(String operatorValue) {
      this.operatorValue = operatorValue;
      return this;
    }


    /**
     * 操作对象列表
     * <p> 示例值：
     *
     * @param objects
     * @return
     */
    public Builder objects(AuditObjectEntity[] objects) {
      this.objects = objects;
      return this;
    }


    /**
     * 接收者对象列表
     * <p> 示例值：
     *
     * @param recipients
     * @return
     */
    public Builder recipients(AuditRecipientEntity[] recipients) {
      this.recipients = recipients;
      return this;
    }


    /**
     * 事件时间
     * <p> 示例值：
     *
     * @param eventTime
     * @return
     */
    public Builder eventTime(Integer eventTime) {
      this.eventTime = eventTime;
      return this;
    }


    /**
     * ip信息
     * <p> 示例值：
     *
     * @param ip
     * @return
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }


    /**
     * 第三方isvID
     * <p> 示例值：
     *
     * @param operatorApp
     * @return
     */
    public Builder operatorApp(String operatorApp) {
      this.operatorApp = operatorApp;
      return this;
    }


    /**
     * 环境信息
     * <p> 示例值：
     *
     * @param auditContext
     * @return
     */
    public Builder auditContext(AuditContext auditContext) {
      this.auditContext = auditContext;
      return this;
    }


    /**
     * 事件级别的扩展
     * <p> 示例值：
     *
     * @param extend
     * @return
     */
    public Builder extend(AuditEventExtend extend) {
      this.extend = extend;
      return this;
    }


    /**
     * 第三方isv名称
     * <p> 示例值：
     *
     * @param operatorAppName
     * @return
     */
    public Builder operatorAppName(String operatorAppName) {
      this.operatorAppName = operatorAppName;
      return this;
    }


    /**
     * 扩展字段信息
     * <p> 示例值：
     *
     * @param commonDrawers
     * @return
     */
    public Builder commonDrawers(ApiAuditCommonDrawers commonDrawers) {
      this.commonDrawers = commonDrawers;
      return this;
    }


    public AuditInfo build() {
      return new AuditInfo(this);
    }
  }
}
