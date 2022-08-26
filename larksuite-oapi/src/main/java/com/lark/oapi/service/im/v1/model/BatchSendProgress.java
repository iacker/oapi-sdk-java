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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class BatchSendProgress {

  /**
   * 发送成功的消息条数
   * <p> 示例值：
   */
  @SerializedName("send_count")
  private String sendCount;
  /**
   * 总的计划发送的消息条数
   * <p> 示例值：
   */
  @SerializedName("total_send_count")
  private String totalSendCount;

  // builder 开始
  public BatchSendProgress() {
  }

  public BatchSendProgress(Builder builder) {
    /**
     * 发送成功的消息条数
     * <p> 示例值：
     */
    this.sendCount = builder.sendCount;
    /**
     * 总的计划发送的消息条数
     * <p> 示例值：
     */
    this.totalSendCount = builder.totalSendCount;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getSendCount() {
    return this.sendCount;
  }

  public void setSendCount(String sendCount) {
    this.sendCount = sendCount;
  }

  public String getTotalSendCount() {
    return this.totalSendCount;
  }

  public void setTotalSendCount(String totalSendCount) {
    this.totalSendCount = totalSendCount;
  }

  public static class Builder {

    /**
     * 发送成功的消息条数
     * <p> 示例值：
     */
    private String sendCount;
    /**
     * 总的计划发送的消息条数
     * <p> 示例值：
     */
    private String totalSendCount;

    /**
     * 发送成功的消息条数
     * <p> 示例值：
     *
     * @param sendCount
     * @return
     */
    public Builder sendCount(String sendCount) {
      this.sendCount = sendCount;
      return this;
    }


    /**
     * 总的计划发送的消息条数
     * <p> 示例值：
     *
     * @param totalSendCount
     * @return
     */
    public Builder totalSendCount(String totalSendCount) {
      this.totalSendCount = totalSendCount;
      return this;
    }


    public BatchSendProgress build() {
      return new BatchSendProgress(this);
    }
  }
}
