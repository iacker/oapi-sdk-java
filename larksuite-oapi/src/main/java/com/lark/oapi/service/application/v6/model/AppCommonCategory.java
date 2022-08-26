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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class AppCommonCategory {

  /**
   * 国际化语言的 key
   * <p> 示例值：zh_cn
   */
  @SerializedName("i18n_key")
  private String i18nKey;
  /**
   * 应用分类
   * <p> 示例值：分析工具
   */
  @SerializedName("category")
  private String category;

  // builder 开始
  public AppCommonCategory() {
  }

  public AppCommonCategory(Builder builder) {
    /**
     * 国际化语言的 key
     * <p> 示例值：zh_cn
     */
    this.i18nKey = builder.i18nKey;
    /**
     * 应用分类
     * <p> 示例值：分析工具
     */
    this.category = builder.category;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getI18nKey() {
    return this.i18nKey;
  }

  public void setI18nKey(String i18nKey) {
    this.i18nKey = i18nKey;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public static class Builder {

    /**
     * 国际化语言的 key
     * <p> 示例值：zh_cn
     */
    private String i18nKey;
    /**
     * 应用分类
     * <p> 示例值：分析工具
     */
    private String category;

    /**
     * 国际化语言的 key
     * <p> 示例值：zh_cn
     *
     * @param i18nKey
     * @return
     */
    public Builder i18nKey(String i18nKey) {
      this.i18nKey = i18nKey;
      return this;
    }

    /**
     * 国际化语言的 key
     * <p> 示例值：zh_cn
     *
     * @param i18nKey {@link com.lark.oapi.service.application.v6.enums.AppCommonCategoryI18nKeyEnum}
     * @return
     */
    public Builder i18nKey(
        com.lark.oapi.service.application.v6.enums.AppCommonCategoryI18nKeyEnum i18nKey) {
      this.i18nKey = i18nKey.getValue();
      return this;
    }


    /**
     * 应用分类
     * <p> 示例值：分析工具
     *
     * @param category
     * @return
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }


    public AppCommonCategory build() {
      return new AppCommonCategory(this);
    }
  }
}
