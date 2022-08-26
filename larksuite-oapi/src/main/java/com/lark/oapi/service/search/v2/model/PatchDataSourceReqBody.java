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

public class PatchDataSourceReqBody {

  /**
   * 数据源的展示名称
   * <p> 示例值：客服工单
   */
  @SerializedName("name")
  private String name;
  /**
   * 数据源状态，0-已上线，1-未上线
   * <p> 示例值：0
   */
  @SerializedName("state")
  private Integer state;
  /**
   * 对于数据源的描述
   * <p> 示例值：搜索客服工单
   */
  @SerializedName("description")
  private String description;
  /**
   * 数据源在 search tab 上的展示图标路径
   * <p> 示例值：https://www.xxx.com/open.jpg
   */
  @SerializedName("icon_url")
  private String iconUrl;
  /**
   * 数据源名称多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"测试数据源", "en_us":"Test DataSource"}
   * <p> 示例值：
   */
  @SerializedName("i18n_name")
  private I18nMeta i18nName;
  /**
   * 数据源描述多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"搜索测试数据源相关数据", "en_us":"Search data from
   * Test DataSource"}
   * <p> 示例值：
   */
  @SerializedName("i18n_description")
  private I18nMeta i18nDescription;

  // builder 开始
  public PatchDataSourceReqBody() {
  }

  public PatchDataSourceReqBody(Builder builder) {
    /**
     * 数据源的展示名称
     * <p> 示例值：客服工单
     */
    this.name = builder.name;
    /**
     * 数据源状态，0-已上线，1-未上线
     * <p> 示例值：0
     */
    this.state = builder.state;
    /**
     * 对于数据源的描述
     * <p> 示例值：搜索客服工单
     */
    this.description = builder.description;
    /**
     * 数据源在 search tab 上的展示图标路径
     * <p> 示例值：https://www.xxx.com/open.jpg
     */
    this.iconUrl = builder.iconUrl;
    /**
     * 数据源名称多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"测试数据源", "en_us":"Test DataSource"}
     * <p> 示例值：
     */
    this.i18nName = builder.i18nName;
    /**
     * 数据源描述多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"搜索测试数据源相关数据", "en_us":"Search data from Test DataSource"}
     * <p> 示例值：
     */
    this.i18nDescription = builder.i18nDescription;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getState() {
    return this.state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getIconUrl() {
    return this.iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public I18nMeta getI18nName() {
    return this.i18nName;
  }

  public void setI18nName(I18nMeta i18nName) {
    this.i18nName = i18nName;
  }

  public I18nMeta getI18nDescription() {
    return this.i18nDescription;
  }

  public void setI18nDescription(I18nMeta i18nDescription) {
    this.i18nDescription = i18nDescription;
  }

  public static class Builder {

    /**
     * 数据源的展示名称
     * <p> 示例值：客服工单
     */
    private String name;
    /**
     * 数据源状态，0-已上线，1-未上线
     * <p> 示例值：0
     */
    private Integer state;
    /**
     * 对于数据源的描述
     * <p> 示例值：搜索客服工单
     */
    private String description;
    /**
     * 数据源在 search tab 上的展示图标路径
     * <p> 示例值：https://www.xxx.com/open.jpg
     */
    private String iconUrl;
    /**
     * 数据源名称多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"测试数据源", "en_us":"Test DataSource"}
     * <p> 示例值：
     */
    private I18nMeta i18nName;
    /**
     * 数据源描述多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"搜索测试数据源相关数据", "en_us":"Search data from
     * Test DataSource"}
     * <p> 示例值：
     */
    private I18nMeta i18nDescription;

    /**
     * 数据源的展示名称
     * <p> 示例值：客服工单
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 数据源状态，0-已上线，1-未上线
     * <p> 示例值：0
     *
     * @param state
     * @return
     */
    public Builder state(Integer state) {
      this.state = state;
      return this;
    }

    /**
     * 数据源状态，0-已上线，1-未上线
     * <p> 示例值：0
     *
     * @param state {@link com.lark.oapi.service.search.v2.enums.PatchDataSourceStateEnum}
     * @return
     */
    public Builder state(com.lark.oapi.service.search.v2.enums.PatchDataSourceStateEnum state) {
      this.state = state.getValue();
      return this;
    }


    /**
     * 对于数据源的描述
     * <p> 示例值：搜索客服工单
     *
     * @param description
     * @return
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }


    /**
     * 数据源在 search tab 上的展示图标路径
     * <p> 示例值：https://www.xxx.com/open.jpg
     *
     * @param iconUrl
     * @return
     */
    public Builder iconUrl(String iconUrl) {
      this.iconUrl = iconUrl;
      return this;
    }


    /**
     * 数据源名称多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"测试数据源", "en_us":"Test DataSource"}
     * <p> 示例值：
     *
     * @param i18nName
     * @return
     */
    public Builder i18nName(I18nMeta i18nName) {
      this.i18nName = i18nName;
      return this;
    }


    /**
     * 数据源描述多语言配置，json格式，key为语言locale，value为对应文案，例如{"zh_cn":"搜索测试数据源相关数据", "en_us":"Search data from
     * Test DataSource"}
     * <p> 示例值：
     *
     * @param i18nDescription
     * @return
     */
    public Builder i18nDescription(I18nMeta i18nDescription) {
      this.i18nDescription = i18nDescription;
      return this;
    }


    public PatchDataSourceReqBody build() {
      return new PatchDataSourceReqBody(this);
    }
  }
}
