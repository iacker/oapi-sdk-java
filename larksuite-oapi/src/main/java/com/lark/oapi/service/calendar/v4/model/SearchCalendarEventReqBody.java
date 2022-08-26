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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class SearchCalendarEventReqBody {

  /**
   * 搜索关键字
   * <p> 示例值：query words
   */
  @SerializedName("query")
  private String query;
  /**
   * 搜索过滤器
   * <p> 示例值：
   */
  @SerializedName("filter")
  private EventSearchFilter filter;

  // builder 开始
  public SearchCalendarEventReqBody() {
  }

  public SearchCalendarEventReqBody(Builder builder) {
    /**
     * 搜索关键字
     * <p> 示例值：query words
     */
    this.query = builder.query;
    /**
     * 搜索过滤器
     * <p> 示例值：
     */
    this.filter = builder.filter;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getQuery() {
    return this.query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public EventSearchFilter getFilter() {
    return this.filter;
  }

  public void setFilter(EventSearchFilter filter) {
    this.filter = filter;
  }

  public static class Builder {

    /**
     * 搜索关键字
     * <p> 示例值：query words
     */
    private String query;
    /**
     * 搜索过滤器
     * <p> 示例值：
     */
    private EventSearchFilter filter;

    /**
     * 搜索关键字
     * <p> 示例值：query words
     *
     * @param query
     * @return
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }


    /**
     * 搜索过滤器
     * <p> 示例值：
     *
     * @param filter
     * @return
     */
    public Builder filter(EventSearchFilter filter) {
      this.filter = filter;
      return this;
    }


    public SearchCalendarEventReqBody build() {
      return new SearchCalendarEventReqBody(this);
    }
  }
}
