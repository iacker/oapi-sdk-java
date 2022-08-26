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

package com.lark.oapi.service.task.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CreateTaskFollowerReq {

  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 任务 ID
   * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
   */
  @Path
  @SerializedName("task_id")
  private String taskId;
  @Body
  private Follower body;

  // builder 开始
  public CreateTaskFollowerReq() {
  }

  public CreateTaskFollowerReq(Builder builder) {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 任务 ID
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     */
    this.taskId = builder.taskId;
    this.body = builder.body;
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

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public Follower getFollower() {
    return this.body;
  }

  public void setFollower(Follower body) {
    this.body = body;
  }

  public static class Builder {

    private String userIdType; // 此次调用中使用的用户ID的类型
    private String taskId; // 任务 ID
    private Follower body;

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
     * @param userIdType {@link com.lark.oapi.service.task.v1.enums.CreateTaskFollowerUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.task.v1.enums.CreateTaskFollowerUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    /**
     * 任务 ID
     * <p> 示例值：83912691-2e43-47fc-94a4-d512e03984fa
     *
     * @param taskId
     * @return
     */
    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }

    public Follower getFollower() {
      return this.body;
    }

    /**
     * body
     *
     * @param body
     * @return
     */
    public Builder follower(Follower body) {
      this.body = body;
      return this;
    }

    public CreateTaskFollowerReq build() {
      return new CreateTaskFollowerReq(this);
    }
  }
}
