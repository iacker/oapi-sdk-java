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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class PatchTicketCustomizedFieldReq {

  /**
   * 工单自定义字段ID
   * <p> 示例值：6948728206392295444
   */
  @Path
  @SerializedName("ticket_customized_field_id")
  private String ticketCustomizedFieldId;
  @Body
  private TicketCustomizedField body;

  // builder 开始
  public PatchTicketCustomizedFieldReq() {
  }

  public PatchTicketCustomizedFieldReq(Builder builder) {
    /**
     * 工单自定义字段ID
     * <p> 示例值：6948728206392295444
     */
    this.ticketCustomizedFieldId = builder.ticketCustomizedFieldId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTicketCustomizedFieldId() {
    return this.ticketCustomizedFieldId;
  }

  public void setTicketCustomizedFieldId(String ticketCustomizedFieldId) {
    this.ticketCustomizedFieldId = ticketCustomizedFieldId;
  }

  public TicketCustomizedField getTicketCustomizedField() {
    return this.body;
  }

  public void setTicketCustomizedField(TicketCustomizedField body) {
    this.body = body;
  }

  public static class Builder {

    private String ticketCustomizedFieldId; // 工单自定义字段ID
    private TicketCustomizedField body;

    /**
     * 工单自定义字段ID
     * <p> 示例值：6948728206392295444
     *
     * @param ticketCustomizedFieldId
     * @return
     */
    public Builder ticketCustomizedFieldId(String ticketCustomizedFieldId) {
      this.ticketCustomizedFieldId = ticketCustomizedFieldId;
      return this;
    }

    public TicketCustomizedField getTicketCustomizedField() {
      return this.body;
    }

    /**
     * body
     *
     * @param body
     * @return
     */
    public Builder ticketCustomizedField(TicketCustomizedField body) {
      this.body = body;
      return this;
    }

    public PatchTicketCustomizedFieldReq build() {
      return new PatchTicketCustomizedFieldReq(this);
    }
  }
}
