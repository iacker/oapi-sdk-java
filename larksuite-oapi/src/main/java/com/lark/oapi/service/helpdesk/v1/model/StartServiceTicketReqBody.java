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

public class StartServiceTicketReqBody {

  /**
   * 是否直接进入人工(若appointed_agents填写了，该值为必填)
   * <p> 示例值：false
   */
  @SerializedName("human_service")
  private Boolean humanService;
  /**
   * 客服 open ids (获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))，human_service需要为true
   * <p> 示例值：[ou_7dab8a3d3cdcc9da365777c7ad535d62]
   */
  @SerializedName("appointed_agents")
  private String[] appointedAgents;
  /**
   * 用户 open id,(获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))
   * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
   */
  @SerializedName("open_id")
  private String openId;
  /**
   * 工单来源自定义信息，长度限制1024字符，如设置，[获取工单详情](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)会返回此信息
   * <p> 示例值：测试自定义字段信息
   */
  @SerializedName("customized_info")
  private String customizedInfo;

  // builder 开始
  public StartServiceTicketReqBody() {
  }

  public StartServiceTicketReqBody(Builder builder) {
    /**
     * 是否直接进入人工(若appointed_agents填写了，该值为必填)
     * <p> 示例值：false
     */
    this.humanService = builder.humanService;
    /**
     * 客服 open ids (获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))，human_service需要为true
     * <p> 示例值：[ou_7dab8a3d3cdcc9da365777c7ad535d62]
     */
    this.appointedAgents = builder.appointedAgents;
    /**
     * 用户 open id,(获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    this.openId = builder.openId;
    /**
     * 工单来源自定义信息，长度限制1024字符，如设置，[获取工单详情](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)会返回此信息
     * <p> 示例值：测试自定义字段信息
     */
    this.customizedInfo = builder.customizedInfo;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Boolean getHumanService() {
    return this.humanService;
  }

  public void setHumanService(Boolean humanService) {
    this.humanService = humanService;
  }

  public String[] getAppointedAgents() {
    return this.appointedAgents;
  }

  public void setAppointedAgents(String[] appointedAgents) {
    this.appointedAgents = appointedAgents;
  }

  public String getOpenId() {
    return this.openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getCustomizedInfo() {
    return this.customizedInfo;
  }

  public void setCustomizedInfo(String customizedInfo) {
    this.customizedInfo = customizedInfo;
  }

  public static class Builder {

    /**
     * 是否直接进入人工(若appointed_agents填写了，该值为必填)
     * <p> 示例值：false
     */
    private Boolean humanService;
    /**
     * 客服 open ids (获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))，human_service需要为true
     * <p> 示例值：[ou_7dab8a3d3cdcc9da365777c7ad535d62]
     */
    private String[] appointedAgents;
    /**
     * 用户 open id,(获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    private String openId;
    /**
     * 工单来源自定义信息，长度限制1024字符，如设置，[获取工单详情](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)会返回此信息
     * <p> 示例值：测试自定义字段信息
     */
    private String customizedInfo;

    /**
     * 是否直接进入人工(若appointed_agents填写了，该值为必填)
     * <p> 示例值：false
     *
     * @param humanService
     * @return
     */
    public Builder humanService(Boolean humanService) {
      this.humanService = humanService;
      return this;
    }


    /**
     * 客服 open ids (获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))，human_service需要为true
     * <p> 示例值：[ou_7dab8a3d3cdcc9da365777c7ad535d62]
     *
     * @param appointedAgents
     * @return
     */
    public Builder appointedAgents(String[] appointedAgents) {
      this.appointedAgents = appointedAgents;
      return this;
    }


    /**
     * 用户 open id,(获取方式参考[获取单个用户信息](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/user/get))
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     *
     * @param openId
     * @return
     */
    public Builder openId(String openId) {
      this.openId = openId;
      return this;
    }


    /**
     * 工单来源自定义信息，长度限制1024字符，如设置，[获取工单详情](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/helpdesk-v1/ticket/get)会返回此信息
     * <p> 示例值：测试自定义字段信息
     *
     * @param customizedInfo
     * @return
     */
    public Builder customizedInfo(String customizedInfo) {
      this.customizedInfo = customizedInfo;
      return this;
    }


    public StartServiceTicketReqBody build() {
      return new StartServiceTicketReqBody(this);
    }
  }
}
