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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class ListTaskCommentReq {

  /**
   * 分页大小
   * <p> 示例值：10
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token获取查询结果
   * <p> 示例值："MTYzMTg3ODUxNQ=="
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 评论排序标记，可按照评论时间从小到大查询，或者评论时间从大到小查询，不填默认按照从小到大
   * <p> 示例值：0
   */
  @Query
  @SerializedName("list_direction")
  private Integer listDirection;
  /**
   * 任务id
   * <p> 示例值："83912691-2e43-47fc-94a4-d512e03984fa"
   */
  @Path
  @SerializedName("task_id")
  private String taskId;

  // builder 开始
  public ListTaskCommentReq() {
  }

  public ListTaskCommentReq(Builder builder) {
    /**
     * 分页大小
     * <p> 示例值：10
     */
    this.pageSize = builder.pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token获取查询结果
     * <p> 示例值："MTYzMTg3ODUxNQ=="
     */
    this.pageToken = builder.pageToken;
    /**
     * 评论排序标记，可按照评论时间从小到大查询，或者评论时间从大到小查询，不填默认按照从小到大
     * <p> 示例值：0
     */
    this.listDirection = builder.listDirection;
    /**
     * 任务id
     * <p> 示例值："83912691-2e43-47fc-94a4-d512e03984fa"
     */
    this.taskId = builder.taskId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public String getPageToken() {
    return this.pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Integer getListDirection() {
    return this.listDirection;
  }

  public void setListDirection(Integer listDirection) {
    this.listDirection = listDirection;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public static class Builder {

    private Integer pageSize; // 分页大小
    private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token获取查询结果
    private Integer listDirection; // 评论排序标记，可按照评论时间从小到大查询，或者评论时间从大到小查询，不填默认按照从小到大
    private String taskId; // 任务id

    /**
     * 分页大小
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
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token获取查询结果
     * <p> 示例值："MTYzMTg3ODUxNQ=="
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * 评论排序标记，可按照评论时间从小到大查询，或者评论时间从大到小查询，不填默认按照从小到大
     * <p> 示例值：0
     *
     * @param listDirection
     * @return
     */
    public Builder listDirection(Integer listDirection) {
      this.listDirection = listDirection;
      return this;
    }

    /**
     * 评论排序标记，可按照评论时间从小到大查询，或者评论时间从大到小查询，不填默认按照从小到大
     * <p> 示例值：0
     *
     * @param listDirection {@link com.lark.oapi.service.task.v1.enums.ListTaskCommentListDirectionEnum}
     * @return
     */
    public Builder listDirection(
        com.lark.oapi.service.task.v1.enums.ListTaskCommentListDirectionEnum listDirection) {
      this.listDirection = listDirection.getValue();
      return this;
    }

    /**
     * 任务id
     * <p> 示例值："83912691-2e43-47fc-94a4-d512e03984fa"
     *
     * @param taskId
     * @return
     */
    public Builder taskId(String taskId) {
      this.taskId = taskId;
      return this;
    }

    public ListTaskCommentReq build() {
      return new ListTaskCommentReq(this);
    }
  }
}
