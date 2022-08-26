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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class Schema {

  /**
   * UI名称。取值范围如下： ;- ForwardIcon: 日程转发按钮 ;- MeetingChatIcon: 会议群聊按钮 ;- MeetingMinutesIcon: 会议纪要按钮 ;-
   * MeetingVideo: 视频会议区域 ;- RSVP: 接受/拒绝/待定区域 ;- Attendee: 参与者区域 ;- OrganizerOrCreator: 组织者/创建者区域
   * <p> 示例值：ForwardIcon
   */
  @SerializedName("ui_name")
  private String uiName;
  /**
   * UI项自定义状态。**目前只支持hide**
   * <p> 示例值：hide
   */
  @SerializedName("ui_status")
  private String uiStatus;
  /**
   * 按钮点击后跳转的链接; **该字段暂不支持传入。**
   * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
   */
  @SerializedName("app_link")
  private String appLink;

  // builder 开始
  public Schema() {
  }

  public Schema(Builder builder) {
    /**
     * UI名称。取值范围如下： ;- ForwardIcon: 日程转发按钮 ;- MeetingChatIcon: 会议群聊按钮 ;- MeetingMinutesIcon: 会议纪要按钮 ;- MeetingVideo: 视频会议区域 ;- RSVP: 接受/拒绝/待定区域 ;- Attendee: 参与者区域 ;- OrganizerOrCreator: 组织者/创建者区域
     * <p> 示例值：ForwardIcon
     */
    this.uiName = builder.uiName;
    /**
     * UI项自定义状态。**目前只支持hide**
     * <p> 示例值：hide
     */
    this.uiStatus = builder.uiStatus;
    /**
     * 按钮点击后跳转的链接; **该字段暂不支持传入。**
     * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
     */
    this.appLink = builder.appLink;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUiName() {
    return this.uiName;
  }

  public void setUiName(String uiName) {
    this.uiName = uiName;
  }

  public String getUiStatus() {
    return this.uiStatus;
  }

  public void setUiStatus(String uiStatus) {
    this.uiStatus = uiStatus;
  }

  public String getAppLink() {
    return this.appLink;
  }

  public void setAppLink(String appLink) {
    this.appLink = appLink;
  }

  public static class Builder {

    /**
     * UI名称。取值范围如下： ;- ForwardIcon: 日程转发按钮 ;- MeetingChatIcon: 会议群聊按钮 ;- MeetingMinutesIcon: 会议纪要按钮
     * ;- MeetingVideo: 视频会议区域 ;- RSVP: 接受/拒绝/待定区域 ;- Attendee: 参与者区域 ;- OrganizerOrCreator:
     * 组织者/创建者区域
     * <p> 示例值：ForwardIcon
     */
    private String uiName;
    /**
     * UI项自定义状态。**目前只支持hide**
     * <p> 示例值：hide
     */
    private String uiStatus;
    /**
     * 按钮点击后跳转的链接; **该字段暂不支持传入。**
     * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
     */
    private String appLink;

    /**
     * UI名称。取值范围如下： ;- ForwardIcon: 日程转发按钮 ;- MeetingChatIcon: 会议群聊按钮 ;- MeetingMinutesIcon: 会议纪要按钮
     * ;- MeetingVideo: 视频会议区域 ;- RSVP: 接受/拒绝/待定区域 ;- Attendee: 参与者区域 ;- OrganizerOrCreator:
     * 组织者/创建者区域
     * <p> 示例值：ForwardIcon
     *
     * @param uiName
     * @return
     */
    public Builder uiName(String uiName) {
      this.uiName = uiName;
      return this;
    }


    /**
     * UI项自定义状态。**目前只支持hide**
     * <p> 示例值：hide
     *
     * @param uiStatus
     * @return
     */
    public Builder uiStatus(String uiStatus) {
      this.uiStatus = uiStatus;
      return this;
    }

    /**
     * UI项自定义状态。**目前只支持hide**
     * <p> 示例值：hide
     *
     * @param uiStatus {@link com.lark.oapi.service.calendar.v4.enums.SchemaSchemaUiStatusEnum}
     * @return
     */
    public Builder uiStatus(
        com.lark.oapi.service.calendar.v4.enums.SchemaSchemaUiStatusEnum uiStatus) {
      this.uiStatus = uiStatus.getValue();
      return this;
    }


    /**
     * 按钮点击后跳转的链接; **该字段暂不支持传入。**
     * <p> 示例值：https://applink.feishu.cn/client/calendar/event/detail?calendarId=xxxxxx&key=xxxxxx&originalTime=xxxxxx&startTime=xxxxxx
     *
     * @param appLink
     * @return
     */
    public Builder appLink(String appLink) {
      this.appLink = appLink;
      return this;
    }


    public Schema build() {
      return new Schema(this);
    }
  }
}
