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

public class ExteranlInstanceCheckResponse {

  /**
   * 审批实例 id
   * <p> 示例值：1234234234242423
   */
  @SerializedName("instance_id")
  private String instanceId;
  /**
   * 任务最近更新时间
   * <p> 示例值：1591603040000
   */
  @SerializedName("update_time")
  private String updateTime;
  /**
   * 任务信息
   * <p> 示例值：
   */
  @SerializedName("tasks")
  private ExternalInstanceTask[] tasks;

  // builder 开始
  public ExteranlInstanceCheckResponse() {
  }

  public ExteranlInstanceCheckResponse(Builder builder) {
    /**
     * 审批实例 id
     * <p> 示例值：1234234234242423
     */
    this.instanceId = builder.instanceId;
    /**
     * 任务最近更新时间
     * <p> 示例值：1591603040000
     */
    this.updateTime = builder.updateTime;
    /**
     * 任务信息
     * <p> 示例值：
     */
    this.tasks = builder.tasks;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getInstanceId() {
    return this.instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public ExternalInstanceTask[] getTasks() {
    return this.tasks;
  }

  public void setTasks(ExternalInstanceTask[] tasks) {
    this.tasks = tasks;
  }

  public static class Builder {

    /**
     * 审批实例 id
     * <p> 示例值：1234234234242423
     */
    private String instanceId;
    /**
     * 任务最近更新时间
     * <p> 示例值：1591603040000
     */
    private String updateTime;
    /**
     * 任务信息
     * <p> 示例值：
     */
    private ExternalInstanceTask[] tasks;

    /**
     * 审批实例 id
     * <p> 示例值：1234234234242423
     *
     * @param instanceId
     * @return
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }


    /**
     * 任务最近更新时间
     * <p> 示例值：1591603040000
     *
     * @param updateTime
     * @return
     */
    public Builder updateTime(String updateTime) {
      this.updateTime = updateTime;
      return this;
    }


    /**
     * 任务信息
     * <p> 示例值：
     *
     * @param tasks
     * @return
     */
    public Builder tasks(ExternalInstanceTask[] tasks) {
      this.tasks = tasks;
      return this;
    }


    public ExteranlInstanceCheckResponse build() {
      return new ExteranlInstanceCheckResponse(this);
    }
  }
}
