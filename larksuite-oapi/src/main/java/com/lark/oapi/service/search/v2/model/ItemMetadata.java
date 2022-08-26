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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class ItemMetadata {

  /**
   * 该条数据记录对应的标题
   * <p> 示例值：工单：无法创建文章
   */
  @SerializedName("title")
  private String title;
  /**
   * 该条数据记录对应的跳转url
   * <p> 示例值：http://www.abc.com.cn
   */
  @SerializedName("source_url")
  private String sourceUrl;
  /**
   * 数据项的创建时间。Unix 时间，单位为秒
   * <p> 示例值：1618831236
   */
  @SerializedName("create_time")
  private Integer createTime;
  /**
   * 数据项的更新时间。Unix 时间，单位为秒
   * <p> 示例值：1618831236
   */
  @SerializedName("update_time")
  private Integer updateTime;
  /**
   * 移动端搜索命中的跳转地址。如果您PC端和移动端有不同的跳转地址，可以在这里写入移动端专用的url，我们会在搜索时为您选择合适的地址
   * <p> 示例值：https://www.feishu.cn
   */
  @SerializedName("source_url_mobile")
  private String sourceUrlMobile;

  // builder 开始
  public ItemMetadata() {
  }

  public ItemMetadata(Builder builder) {
    /**
     * 该条数据记录对应的标题
     * <p> 示例值：工单：无法创建文章
     */
    this.title = builder.title;
    /**
     * 该条数据记录对应的跳转url
     * <p> 示例值：http://www.abc.com.cn
     */
    this.sourceUrl = builder.sourceUrl;
    /**
     * 数据项的创建时间。Unix 时间，单位为秒
     * <p> 示例值：1618831236
     */
    this.createTime = builder.createTime;
    /**
     * 数据项的更新时间。Unix 时间，单位为秒
     * <p> 示例值：1618831236
     */
    this.updateTime = builder.updateTime;
    /**
     * 移动端搜索命中的跳转地址。如果您PC端和移动端有不同的跳转地址，可以在这里写入移动端专用的url，我们会在搜索时为您选择合适的地址
     * <p> 示例值：https://www.feishu.cn
     */
    this.sourceUrlMobile = builder.sourceUrlMobile;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSourceUrl() {
    return this.sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public Integer getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Integer getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public String getSourceUrlMobile() {
    return this.sourceUrlMobile;
  }

  public void setSourceUrlMobile(String sourceUrlMobile) {
    this.sourceUrlMobile = sourceUrlMobile;
  }

  public static class Builder {

    /**
     * 该条数据记录对应的标题
     * <p> 示例值：工单：无法创建文章
     */
    private String title;
    /**
     * 该条数据记录对应的跳转url
     * <p> 示例值：http://www.abc.com.cn
     */
    private String sourceUrl;
    /**
     * 数据项的创建时间。Unix 时间，单位为秒
     * <p> 示例值：1618831236
     */
    private Integer createTime;
    /**
     * 数据项的更新时间。Unix 时间，单位为秒
     * <p> 示例值：1618831236
     */
    private Integer updateTime;
    /**
     * 移动端搜索命中的跳转地址。如果您PC端和移动端有不同的跳转地址，可以在这里写入移动端专用的url，我们会在搜索时为您选择合适的地址
     * <p> 示例值：https://www.feishu.cn
     */
    private String sourceUrlMobile;

    /**
     * 该条数据记录对应的标题
     * <p> 示例值：工单：无法创建文章
     *
     * @param title
     * @return
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }


    /**
     * 该条数据记录对应的跳转url
     * <p> 示例值：http://www.abc.com.cn
     *
     * @param sourceUrl
     * @return
     */
    public Builder sourceUrl(String sourceUrl) {
      this.sourceUrl = sourceUrl;
      return this;
    }


    /**
     * 数据项的创建时间。Unix 时间，单位为秒
     * <p> 示例值：1618831236
     *
     * @param createTime
     * @return
     */
    public Builder createTime(Integer createTime) {
      this.createTime = createTime;
      return this;
    }


    /**
     * 数据项的更新时间。Unix 时间，单位为秒
     * <p> 示例值：1618831236
     *
     * @param updateTime
     * @return
     */
    public Builder updateTime(Integer updateTime) {
      this.updateTime = updateTime;
      return this;
    }


    /**
     * 移动端搜索命中的跳转地址。如果您PC端和移动端有不同的跳转地址，可以在这里写入移动端专用的url，我们会在搜索时为您选择合适的地址
     * <p> 示例值：https://www.feishu.cn
     *
     * @param sourceUrlMobile
     * @return
     */
    public Builder sourceUrlMobile(String sourceUrlMobile) {
      this.sourceUrlMobile = sourceUrlMobile;
      return this;
    }


    public ItemMetadata build() {
      return new ItemMetadata(this);
    }
  }
}
