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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class P2ApplicationFeedbackCreatedV6Data {

  /**
   * 用户 ID
   * <p> 示例值：
   */
  @SerializedName("user_id")
  private UserId userId;
  /**
   * 被反馈应用 ID
   * <p> 示例值：cli_9b445f5258795107
   */
  @SerializedName("app_id")
  private String appId;
  /**
   * 反馈提交时间，格式为yyyy-mm-dd hh:mm:ss
   * <p> 示例值：2022-01-30 11:30:12
   */
  @SerializedName("feedback_time")
  private String feedbackTime;
  /**
   * 反馈用户的租户名
   * <p> 示例值：字节跳动
   */
  @SerializedName("tenant_name")
  private String tenantName;
  /**
   * 反馈类型（枚举值，1：故障反馈，2：产品建议）
   * <p> 示例值：1
   */
  @SerializedName("feedback_type")
  private Integer feedbackType;
  /**
   * 故障类型列表：1: 黑屏 2: 白屏 3: 无法打开小程序  4: 卡顿 5: 小程序闪退 6: 页面加载慢 7: 死机 8: 其他异常
   * <p> 示例值：
   */
  @SerializedName("fault_type")
  private Integer[] faultType;
  /**
   * 故障时间，格式为yyyy-mm-dd hh:mm:ss
   * <p> 示例值：2022-01-30 11:30:12
   */
  @SerializedName("fault_time")
  private String faultTime;
  /**
   * 反馈来源：1： 小程序 2：网页应用 3：机器人 4：webSDK
   * <p> 示例值：1
   */
  @SerializedName("source")
  private Integer source;
  /**
   * 用户填写的联系方式
   * <p> 示例值：wang@bytedance.com
   */
  @SerializedName("contact")
  private String contact;
  /**
   * 反馈详情
   * <p> 示例值：反馈的详细信息
   */
  @SerializedName("description")
  private String description;
  /**
   * 反馈图片url列表，url 过期时间三天
   * <p> 示例值：
   */
  @SerializedName("images")
  private String[] images;
  /**
   * 应用反馈 ID，应用反馈记录唯一标识
   * <p> 示例值：7057888018203574291
   */
  @SerializedName("feedback_id")
  private String feedbackId;
  /**
   * 反馈页面路径
   * <p> 示例值：page/index
   */
  @SerializedName("feedback_path")
  private String feedbackPath;

  public UserId getUserId() {
    return this.userId;
  }

  public void setUserId(UserId userId) {
    this.userId = userId;
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getFeedbackTime() {
    return this.feedbackTime;
  }

  public void setFeedbackTime(String feedbackTime) {
    this.feedbackTime = feedbackTime;
  }

  public String getTenantName() {
    return this.tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public Integer getFeedbackType() {
    return this.feedbackType;
  }

  public void setFeedbackType(Integer feedbackType) {
    this.feedbackType = feedbackType;
  }

  public Integer[] getFaultType() {
    return this.faultType;
  }

  public void setFaultType(Integer[] faultType) {
    this.faultType = faultType;
  }

  public String getFaultTime() {
    return this.faultTime;
  }

  public void setFaultTime(String faultTime) {
    this.faultTime = faultTime;
  }

  public Integer getSource() {
    return this.source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public String getContact() {
    return this.contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String[] getImages() {
    return this.images;
  }

  public void setImages(String[] images) {
    this.images = images;
  }

  public String getFeedbackId() {
    return this.feedbackId;
  }

  public void setFeedbackId(String feedbackId) {
    this.feedbackId = feedbackId;
  }

  public String getFeedbackPath() {
    return this.feedbackPath;
  }

  public void setFeedbackPath(String feedbackPath) {
    this.feedbackPath = feedbackPath;
  }

}
