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

public class TaskSearchItem {

  /**
   * 审批定义
   * <p> 示例值：
   */
  @SerializedName("approval")
  private InstanceSearchApproval approval;
  /**
   * 审批定义分组
   * <p> 示例值：
   */
  @SerializedName("group")
  private InstanceSearchGroup group;
  /**
   * 审批实例信息
   * <p> 示例值：
   */
  @SerializedName("instance")
  private InstanceSearchNode instance;
  /**
   * 审批任务
   * <p> 示例值：
   */
  @SerializedName("task")
  private TaskSearchNode task;

  // builder 开始
  public TaskSearchItem() {
  }

  public TaskSearchItem(Builder builder) {
    /**
     * 审批定义
     * <p> 示例值：
     */
    this.approval = builder.approval;
    /**
     * 审批定义分组
     * <p> 示例值：
     */
    this.group = builder.group;
    /**
     * 审批实例信息
     * <p> 示例值：
     */
    this.instance = builder.instance;
    /**
     * 审批任务
     * <p> 示例值：
     */
    this.task = builder.task;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public InstanceSearchApproval getApproval() {
    return this.approval;
  }

  public void setApproval(InstanceSearchApproval approval) {
    this.approval = approval;
  }

  public InstanceSearchGroup getGroup() {
    return this.group;
  }

  public void setGroup(InstanceSearchGroup group) {
    this.group = group;
  }

  public InstanceSearchNode getInstance() {
    return this.instance;
  }

  public void setInstance(InstanceSearchNode instance) {
    this.instance = instance;
  }

  public TaskSearchNode getTask() {
    return this.task;
  }

  public void setTask(TaskSearchNode task) {
    this.task = task;
  }

  public static class Builder {

    /**
     * 审批定义
     * <p> 示例值：
     */
    private InstanceSearchApproval approval;
    /**
     * 审批定义分组
     * <p> 示例值：
     */
    private InstanceSearchGroup group;
    /**
     * 审批实例信息
     * <p> 示例值：
     */
    private InstanceSearchNode instance;
    /**
     * 审批任务
     * <p> 示例值：
     */
    private TaskSearchNode task;

    /**
     * 审批定义
     * <p> 示例值：
     *
     * @param approval
     * @return
     */
    public Builder approval(InstanceSearchApproval approval) {
      this.approval = approval;
      return this;
    }


    /**
     * 审批定义分组
     * <p> 示例值：
     *
     * @param group
     * @return
     */
    public Builder group(InstanceSearchGroup group) {
      this.group = group;
      return this;
    }


    /**
     * 审批实例信息
     * <p> 示例值：
     *
     * @param instance
     * @return
     */
    public Builder instance(InstanceSearchNode instance) {
      this.instance = instance;
      return this;
    }


    /**
     * 审批任务
     * <p> 示例值：
     *
     * @param task
     * @return
     */
    public Builder task(TaskSearchNode task) {
      this.task = task;
      return this;
    }


    public TaskSearchItem build() {
      return new TaskSearchItem(this);
    }
  }
}
