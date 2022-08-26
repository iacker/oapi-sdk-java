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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListCalendarEventAttendeeReq {

  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * <p> 示例值：780TRhwXXXXX
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
   * 日历ID。参见[日历ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
   * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
   */
  @Path
  @SerializedName("calendar_id")
  private String calendarId;
  /**
   * 日程ID。参见[日程ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
   * <p> 示例值：xxxxxxxxx_0
   */
  @Path
  @SerializedName("event_id")
  private String eventId;

  // builder 开始
  public ListCalendarEventAttendeeReq() {
  }

  public ListCalendarEventAttendeeReq(Builder builder) {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     *
     * <p> 示例值：780TRhwXXXXX
     */
    this.pageToken = builder.pageToken;
    /**
     *
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
    /**
     * 日历ID。参见[日历ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
     * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
     */
    this.calendarId = builder.calendarId;
    /**
     * 日程ID。参见[日程ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
     * <p> 示例值：xxxxxxxxx_0
     */
    this.eventId = builder.eventId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
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

  public String getCalendarId() {
    return this.calendarId;
  }

  public void setCalendarId(String calendarId) {
    this.calendarId = calendarId;
  }

  public String getEventId() {
    return this.eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public static class Builder {

    private String userIdType; // 此次调用中使用的用户ID的类型
    private String pageToken; //
    private Integer pageSize; //
    private String calendarId; // 日历ID。参见[日历ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
    private String eventId; // 日程ID。参见[日程ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)

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
     * @param userIdType {@link com.lark.oapi.service.calendar.v4.enums.ListCalendarEventAttendeeUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.calendar.v4.enums.ListCalendarEventAttendeeUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * <p> 示例值：780TRhwXXXXX
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
     * 日历ID。参见[日历ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar/introduction)
     * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
     *
     * @param calendarId
     * @return
     */
    public Builder calendarId(String calendarId) {
      this.calendarId = calendarId;
      return this;
    }


    /**
     * 日程ID。参见[日程ID说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event/introduction)
     * <p> 示例值：xxxxxxxxx_0
     *
     * @param eventId
     * @return
     */
    public Builder eventId(String eventId) {
      this.eventId = eventId;
      return this;
    }

    public ListCalendarEventAttendeeReq build() {
      return new ListCalendarEventAttendeeReq(this);
    }
  }
}
