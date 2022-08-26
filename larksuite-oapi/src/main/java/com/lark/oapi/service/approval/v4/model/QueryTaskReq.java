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
import com.lark.oapi.core.annotation.Query;

public class QueryTaskReq {

  /**
   * 分页大小
   * <p> 示例值：100
   */
  @Query
  @SerializedName("page_size")
  private Integer pageSize;
  /**
   * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
   * <p> 示例值：1
   */
  @Query
  @SerializedName("page_token")
  private String pageToken;
  /**
   * 需要查询的 User ID
   * <p> 示例值：example_user_id
   */
  @Query
  @SerializedName("user_id")
  private String userId;
  /**
   * 需要查询的任务分组主题，如「待办」、「已办」等
   * <p> 示例值：1
   */
  @Query
  @SerializedName("topic")
  private String topic;
  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;

  // builder 开始
  public QueryTaskReq() {
  }

  public QueryTaskReq(Builder builder) {
    /**
     * 分页大小
     * <p> 示例值：100
     */
    this.pageSize = builder.pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：1
     */
    this.pageToken = builder.pageToken;
    /**
     * 需要查询的 User ID
     * <p> 示例值：example_user_id
     */
    this.userId = builder.userId;
    /**
     * 需要查询的任务分组主题，如「待办」、「已办」等
     * <p> 示例值：1
     */
    this.topic = builder.topic;
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
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

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTopic() {
    return this.topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public static class Builder {

    private Integer pageSize; // 分页大小
    private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
    private String userId; // 需要查询的 User ID
    private String topic; // 需要查询的任务分组主题，如「待办」、「已办」等
    private String userIdType; // 此次调用中使用的用户ID的类型


    /**
     * 分页大小
     * <p> 示例值：100
     *
     * @param pageSize
     * @return
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }


    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：1
     *
     * @param pageToken
     * @return
     */
    public Builder pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }


    /**
     * 需要查询的 User ID
     * <p> 示例值：example_user_id
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    /**
     * 需要查询的任务分组主题，如「待办」、「已办」等
     * <p> 示例值：1
     *
     * @param topic
     * @return
     */
    public Builder topic(String topic) {
      this.topic = topic;
      return this;
    }

    /**
     * 需要查询的任务分组主题，如「待办」、「已办」等
     * <p> 示例值：1
     *
     * @param topic {@link com.lark.oapi.service.approval.v4.enums.QueryTaskTopicEnum}
     * @return
     */
    public Builder topic(com.lark.oapi.service.approval.v4.enums.QueryTaskTopicEnum topic) {
      this.topic = topic.getValue();
      return this;
    }


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
     * @param userIdType {@link com.lark.oapi.service.approval.v4.enums.QueryTaskUserIdTypeEnum}
     * @return
     */
    public Builder userIdType(
        com.lark.oapi.service.approval.v4.enums.QueryTaskUserIdTypeEnum userIdType) {
      this.userIdType = userIdType.getValue();
      return this;
    }

    public QueryTaskReq build() {
      return new QueryTaskReq(this);
    }
  }
}
