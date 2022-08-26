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

public class BotMessage {

  /**
   * 消息类型
   * <p> 示例值：post
   */
  @SerializedName("msg_type")
  private String msgType;
  /**
   * 消息内容，json格式结构序列化成string。格式说明参考: [发送消息content说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/im-v1/message/create_json)
   * <p> 示例值：{\"post\":{\"zh_cn\":{\"title\":\"some title\",\"content\":[[{\"tag\":\"text\",\"text\":\"some
   * content\"}]]}}}
   */
  @SerializedName("content")
  private String content;
  /**
   * 接收消息用户id
   * <p> 示例值：ou_7346484524
   */
  @SerializedName("receiver_id")
  private String receiverId;
  /**
   * 接收消息方式，chat(服务台专属服务群)或user(服务台机器人私聊)。若选择专属服务群，用户有正在处理的工单将会发送失败。默认以chat方式发送。
   * <p> 示例值：chat
   */
  @SerializedName("receive_type")
  private String receiveType;

  // builder 开始
  public BotMessage() {
  }

  public BotMessage(Builder builder) {
    /**
     * 消息类型
     * <p> 示例值：post
     */
    this.msgType = builder.msgType;
    /**
     * 消息内容，json格式结构序列化成string。格式说明参考: [发送消息content说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/im-v1/message/create_json)
     * <p> 示例值：{\"post\":{\"zh_cn\":{\"title\":\"some title\",\"content\":[[{\"tag\":\"text\",\"text\":\"some content\"}]]}}}
     */
    this.content = builder.content;
    /**
     * 接收消息用户id
     * <p> 示例值：ou_7346484524
     */
    this.receiverId = builder.receiverId;
    /**
     * 接收消息方式，chat(服务台专属服务群)或user(服务台机器人私聊)。若选择专属服务群，用户有正在处理的工单将会发送失败。默认以chat方式发送。
     * <p> 示例值：chat
     */
    this.receiveType = builder.receiveType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getMsgType() {
    return this.msgType;
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getReceiverId() {
    return this.receiverId;
  }

  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  public String getReceiveType() {
    return this.receiveType;
  }

  public void setReceiveType(String receiveType) {
    this.receiveType = receiveType;
  }

  public static class Builder {

    /**
     * 消息类型
     * <p> 示例值：post
     */
    private String msgType;
    /**
     * 消息内容，json格式结构序列化成string。格式说明参考: [发送消息content说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/im-v1/message/create_json)
     * <p> 示例值：{\"post\":{\"zh_cn\":{\"title\":\"some title\",\"content\":[[{\"tag\":\"text\",\"text\":\"some
     * content\"}]]}}}
     */
    private String content;
    /**
     * 接收消息用户id
     * <p> 示例值：ou_7346484524
     */
    private String receiverId;
    /**
     * 接收消息方式，chat(服务台专属服务群)或user(服务台机器人私聊)。若选择专属服务群，用户有正在处理的工单将会发送失败。默认以chat方式发送。
     * <p> 示例值：chat
     */
    private String receiveType;

    /**
     * 消息类型
     * <p> 示例值：post
     *
     * @param msgType
     * @return
     */
    public Builder msgType(String msgType) {
      this.msgType = msgType;
      return this;
    }

    /**
     * 消息类型
     * <p> 示例值：post
     *
     * @param msgType {@link com.lark.oapi.service.helpdesk.v1.enums.BotMessageMsgTypeEnum}
     * @return
     */
    public Builder msgType(com.lark.oapi.service.helpdesk.v1.enums.BotMessageMsgTypeEnum msgType) {
      this.msgType = msgType.getValue();
      return this;
    }


    /**
     * 消息内容，json格式结构序列化成string。格式说明参考: [发送消息content说明](/ssl:ttdoc/uAjLw4CM/ukTMukTMukTM/im-v1/message/create_json)
     * <p> 示例值：{\"post\":{\"zh_cn\":{\"title\":\"some title\",\"content\":[[{\"tag\":\"text\",\"text\":\"some
     * content\"}]]}}}
     *
     * @param content
     * @return
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }


    /**
     * 接收消息用户id
     * <p> 示例值：ou_7346484524
     *
     * @param receiverId
     * @return
     */
    public Builder receiverId(String receiverId) {
      this.receiverId = receiverId;
      return this;
    }


    /**
     * 接收消息方式，chat(服务台专属服务群)或user(服务台机器人私聊)。若选择专属服务群，用户有正在处理的工单将会发送失败。默认以chat方式发送。
     * <p> 示例值：chat
     *
     * @param receiveType
     * @return
     */
    public Builder receiveType(String receiveType) {
      this.receiveType = receiveType;
      return this;
    }

    /**
     * 接收消息方式，chat(服务台专属服务群)或user(服务台机器人私聊)。若选择专属服务群，用户有正在处理的工单将会发送失败。默认以chat方式发送。
     * <p> 示例值：chat
     *
     * @param receiveType {@link com.lark.oapi.service.helpdesk.v1.enums.BotMessageReceiveTypeEnum}
     * @return
     */
    public Builder receiveType(
        com.lark.oapi.service.helpdesk.v1.enums.BotMessageReceiveTypeEnum receiveType) {
      this.receiveType = receiveType.getValue();
      return this;
    }


    public BotMessage build() {
      return new BotMessage(this);
    }
  }
}
