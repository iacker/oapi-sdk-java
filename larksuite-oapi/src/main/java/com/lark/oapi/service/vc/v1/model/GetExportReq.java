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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class GetExportReq {

  /**
   * 任务id
   * <p> 示例值：7108646852144136212
   */
  @Path
  @SerializedName("task_id")
  private String taskId;

  // builder 开始
  public GetExportReq() {
  }

  public GetExportReq(Builder builder) {
    /**
     * 任务id
     * <p> 示例值：7108646852144136212
     */
    this.taskId = builder.taskId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public static class Builder {

    private String taskId; // 任务id

    /**
     * 任务id
     * <p> 示例值：7108646852144136212
     *
     * @param taskId
     * @return
     */
    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }

    public GetExportReq build() {
      return new GetExportReq(this);
    }
  }
}
