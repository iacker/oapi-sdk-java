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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class CcSearchNode {

  /**
   * 审批抄送发起人 id
   * <p> 示例值：lwiu098wj
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * 审批抄送开始时间
   * <p> 示例值：1547654251506
   */
  @SerializedName("create_time")
  private String createTime;
  /**
   * 审批抄送状态
   * <p> 示例值：read
   */
  @SerializedName("read_status")
  private String readStatus;
  /**
   * 审批抄送名称（只有第三方审批有）
   * <p> 示例值：test
   */
  @SerializedName("title")
  private String title;
  /**
   * 审批抄送扩展字段，string型json
   * <p> 示例值：{}
   */
  @SerializedName("extra")
  private String extra;
  /**
   * 审批抄送链接（只有第三方审批有）
   * <p> 示例值：
   */
  @SerializedName("link")
  private InstanceSearchLink link;

  // builder 开始
  public CcSearchNode() {
  }

  public CcSearchNode(Builder builder) {
    /**
     * 审批抄送发起人 id
     * <p> 示例值：lwiu098wj
     */
    this.userId = builder.userId;
    /**
     * 审批抄送开始时间
     * <p> 示例值：1547654251506
     */
    this.createTime = builder.createTime;
    /**
     * 审批抄送状态
     * <p> 示例值：read
     */
    this.readStatus = builder.readStatus;
    /**
     * 审批抄送名称（只有第三方审批有）
     * <p> 示例值：test
     */
    this.title = builder.title;
    /**
     * 审批抄送扩展字段，string型json
     * <p> 示例值：{}
     */
    this.extra = builder.extra;
    /**
     * 审批抄送链接（只有第三方审批有）
     * <p> 示例值：
     */
    this.link = builder.link;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getReadStatus() {
    return this.readStatus;
  }

  public void setReadStatus(String readStatus) {
    this.readStatus = readStatus;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getExtra() {
    return this.extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public InstanceSearchLink getLink() {
    return this.link;
  }

  public void setLink(InstanceSearchLink link) {
    this.link = link;
  }

  public static class Builder {

    /**
     * 审批抄送发起人 id
     * <p> 示例值：lwiu098wj
     */
    private String userId;
    /**
     * 审批抄送开始时间
     * <p> 示例值：1547654251506
     */
    private String createTime;
    /**
     * 审批抄送状态
     * <p> 示例值：read
     */
    private String readStatus;
    /**
     * 审批抄送名称（只有第三方审批有）
     * <p> 示例值：test
     */
    private String title;
    /**
     * 审批抄送扩展字段，string型json
     * <p> 示例值：{}
     */
    private String extra;
    /**
     * 审批抄送链接（只有第三方审批有）
     * <p> 示例值：
     */
    private InstanceSearchLink link;

    /**
     * 审批抄送发起人 id
     * <p> 示例值：lwiu098wj
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    /**
     * 审批抄送开始时间
     * <p> 示例值：1547654251506
     *
     * @param createTime
     * @return
     */
    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }


    /**
     * 审批抄送状态
     * <p> 示例值：read
     *
     * @param readStatus
     * @return
     */
    public Builder readStatus(String readStatus) {
      this.readStatus = readStatus;
      return this;
    }

    /**
     * 审批抄送状态
     * <p> 示例值：read
     *
     * @param readStatus {@link com.lark.oapi.service.approval.v4.enums.CcSearchNodeReadStatusEnum}
     * @return
     */
    public Builder readStatus(
        com.lark.oapi.service.approval.v4.enums.CcSearchNodeReadStatusEnum readStatus) {
      this.readStatus = readStatus.getValue();
      return this;
    }


    /**
     * 审批抄送名称（只有第三方审批有）
     * <p> 示例值：test
     *
     * @param title
     * @return
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }


    /**
     * 审批抄送扩展字段，string型json
     * <p> 示例值：{}
     *
     * @param extra
     * @return
     */
    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }


    /**
     * 审批抄送链接（只有第三方审批有）
     * <p> 示例值：
     *
     * @param link
     * @return
     */
    public Builder link(InstanceSearchLink link) {
      this.link = link;
      return this;
    }


    public CcSearchNode build() {
      return new CcSearchNode(this);
    }
  }
}
