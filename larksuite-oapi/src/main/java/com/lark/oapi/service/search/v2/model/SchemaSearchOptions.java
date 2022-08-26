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

public class SchemaSearchOptions {

  /**
   * 是否支持语义切词召回。默认不支持（推荐使用在长文本的场景）
   * <p> 示例值：true
   */
  @SerializedName("enable_semantic_match")
  private Boolean enableSemanticMatch;
  /**
   * 是否支持精确匹配。默认不支持（推荐使用在短文本、需要精确查找的场景）
   * <p> 示例值：false
   */
  @SerializedName("enable_exact_match")
  private Boolean enableExactMatch;
  /**
   * 是否支持前缀匹配（短文本的默认的分词/召回策略。前缀长度为 1-12）
   * <p> 示例值：false
   */
  @SerializedName("enable_prefix_match")
  private Boolean enablePrefixMatch;
  /**
   * 是否支持数据后缀匹配。默认不支持（推荐使用在短文本、有数字后缀查找的场景。后缀长度为3-12）
   * <p> 示例值：false
   */
  @SerializedName("enable_number_suffix_match")
  private Boolean enableNumberSuffixMatch;
  /**
   * 是否支持驼峰英文匹配。默认不支持（推荐使用在短文本，且包含驼峰形式英文的查找场景）
   * <p> 示例值：false
   */
  @SerializedName("enable_camel_match")
  private Boolean enableCamelMatch;

  // builder 开始
  public SchemaSearchOptions() {
  }

  public SchemaSearchOptions(Builder builder) {
    /**
     * 是否支持语义切词召回。默认不支持（推荐使用在长文本的场景）
     * <p> 示例值：true
     */
    this.enableSemanticMatch = builder.enableSemanticMatch;
    /**
     * 是否支持精确匹配。默认不支持（推荐使用在短文本、需要精确查找的场景）
     * <p> 示例值：false
     */
    this.enableExactMatch = builder.enableExactMatch;
    /**
     * 是否支持前缀匹配（短文本的默认的分词/召回策略。前缀长度为 1-12）
     * <p> 示例值：false
     */
    this.enablePrefixMatch = builder.enablePrefixMatch;
    /**
     * 是否支持数据后缀匹配。默认不支持（推荐使用在短文本、有数字后缀查找的场景。后缀长度为3-12）
     * <p> 示例值：false
     */
    this.enableNumberSuffixMatch = builder.enableNumberSuffixMatch;
    /**
     * 是否支持驼峰英文匹配。默认不支持（推荐使用在短文本，且包含驼峰形式英文的查找场景）
     * <p> 示例值：false
     */
    this.enableCamelMatch = builder.enableCamelMatch;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Boolean getEnableSemanticMatch() {
    return this.enableSemanticMatch;
  }

  public void setEnableSemanticMatch(Boolean enableSemanticMatch) {
    this.enableSemanticMatch = enableSemanticMatch;
  }

  public Boolean getEnableExactMatch() {
    return this.enableExactMatch;
  }

  public void setEnableExactMatch(Boolean enableExactMatch) {
    this.enableExactMatch = enableExactMatch;
  }

  public Boolean getEnablePrefixMatch() {
    return this.enablePrefixMatch;
  }

  public void setEnablePrefixMatch(Boolean enablePrefixMatch) {
    this.enablePrefixMatch = enablePrefixMatch;
  }

  public Boolean getEnableNumberSuffixMatch() {
    return this.enableNumberSuffixMatch;
  }

  public void setEnableNumberSuffixMatch(Boolean enableNumberSuffixMatch) {
    this.enableNumberSuffixMatch = enableNumberSuffixMatch;
  }

  public Boolean getEnableCamelMatch() {
    return this.enableCamelMatch;
  }

  public void setEnableCamelMatch(Boolean enableCamelMatch) {
    this.enableCamelMatch = enableCamelMatch;
  }

  public static class Builder {

    /**
     * 是否支持语义切词召回。默认不支持（推荐使用在长文本的场景）
     * <p> 示例值：true
     */
    private Boolean enableSemanticMatch;
    /**
     * 是否支持精确匹配。默认不支持（推荐使用在短文本、需要精确查找的场景）
     * <p> 示例值：false
     */
    private Boolean enableExactMatch;
    /**
     * 是否支持前缀匹配（短文本的默认的分词/召回策略。前缀长度为 1-12）
     * <p> 示例值：false
     */
    private Boolean enablePrefixMatch;
    /**
     * 是否支持数据后缀匹配。默认不支持（推荐使用在短文本、有数字后缀查找的场景。后缀长度为3-12）
     * <p> 示例值：false
     */
    private Boolean enableNumberSuffixMatch;
    /**
     * 是否支持驼峰英文匹配。默认不支持（推荐使用在短文本，且包含驼峰形式英文的查找场景）
     * <p> 示例值：false
     */
    private Boolean enableCamelMatch;

    /**
     * 是否支持语义切词召回。默认不支持（推荐使用在长文本的场景）
     * <p> 示例值：true
     *
     * @param enableSemanticMatch
     * @return
     */
    public Builder enableSemanticMatch(Boolean enableSemanticMatch) {
      this.enableSemanticMatch = enableSemanticMatch;
      return this;
    }


    /**
     * 是否支持精确匹配。默认不支持（推荐使用在短文本、需要精确查找的场景）
     * <p> 示例值：false
     *
     * @param enableExactMatch
     * @return
     */
    public Builder enableExactMatch(Boolean enableExactMatch) {
      this.enableExactMatch = enableExactMatch;
      return this;
    }


    /**
     * 是否支持前缀匹配（短文本的默认的分词/召回策略。前缀长度为 1-12）
     * <p> 示例值：false
     *
     * @param enablePrefixMatch
     * @return
     */
    public Builder enablePrefixMatch(Boolean enablePrefixMatch) {
      this.enablePrefixMatch = enablePrefixMatch;
      return this;
    }


    /**
     * 是否支持数据后缀匹配。默认不支持（推荐使用在短文本、有数字后缀查找的场景。后缀长度为3-12）
     * <p> 示例值：false
     *
     * @param enableNumberSuffixMatch
     * @return
     */
    public Builder enableNumberSuffixMatch(Boolean enableNumberSuffixMatch) {
      this.enableNumberSuffixMatch = enableNumberSuffixMatch;
      return this;
    }


    /**
     * 是否支持驼峰英文匹配。默认不支持（推荐使用在短文本，且包含驼峰形式英文的查找场景）
     * <p> 示例值：false
     *
     * @param enableCamelMatch
     * @return
     */
    public Builder enableCamelMatch(Boolean enableCamelMatch) {
      this.enableCamelMatch = enableCamelMatch;
      return this;
    }


    public SchemaSearchOptions build() {
      return new SchemaSearchOptions(this);
    }
  }
}
