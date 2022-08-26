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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class TextElementStyle {

  /**
   * 加粗
   * <p> 示例值：true
   */
  @SerializedName("bold")
  private Boolean bold;
  /**
   * 斜体
   * <p> 示例值：true
   */
  @SerializedName("italic")
  private Boolean italic;
  /**
   * 删除线
   * <p> 示例值：true
   */
  @SerializedName("strikethrough")
  private Boolean strikethrough;
  /**
   * 下划线
   * <p> 示例值：true
   */
  @SerializedName("underline")
  private Boolean underline;
  /**
   * inline 代码
   * <p> 示例值：true
   */
  @SerializedName("inline_code")
  private Boolean inlineCode;
  /**
   * 背景色
   * <p> 示例值：1
   */
  @SerializedName("background_color")
  private Integer backgroundColor;
  /**
   * 字体颜色
   * <p> 示例值：1
   */
  @SerializedName("text_color")
  private Integer textColor;
  /**
   * 链接
   * <p> 示例值：
   */
  @SerializedName("link")
  private Link link;

  // builder 开始
  public TextElementStyle() {
  }

  public TextElementStyle(Builder builder) {
    /**
     * 加粗
     * <p> 示例值：true
     */
    this.bold = builder.bold;
    /**
     * 斜体
     * <p> 示例值：true
     */
    this.italic = builder.italic;
    /**
     * 删除线
     * <p> 示例值：true
     */
    this.strikethrough = builder.strikethrough;
    /**
     * 下划线
     * <p> 示例值：true
     */
    this.underline = builder.underline;
    /**
     * inline 代码
     * <p> 示例值：true
     */
    this.inlineCode = builder.inlineCode;
    /**
     * 背景色
     * <p> 示例值：1
     */
    this.backgroundColor = builder.backgroundColor;
    /**
     * 字体颜色
     * <p> 示例值：1
     */
    this.textColor = builder.textColor;
    /**
     * 链接
     * <p> 示例值：
     */
    this.link = builder.link;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Boolean getBold() {
    return this.bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public Boolean getItalic() {
    return this.italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public Boolean getStrikethrough() {
    return this.strikethrough;
  }

  public void setStrikethrough(Boolean strikethrough) {
    this.strikethrough = strikethrough;
  }

  public Boolean getUnderline() {
    return this.underline;
  }

  public void setUnderline(Boolean underline) {
    this.underline = underline;
  }

  public Boolean getInlineCode() {
    return this.inlineCode;
  }

  public void setInlineCode(Boolean inlineCode) {
    this.inlineCode = inlineCode;
  }

  public Integer getBackgroundColor() {
    return this.backgroundColor;
  }

  public void setBackgroundColor(Integer backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Integer getTextColor() {
    return this.textColor;
  }

  public void setTextColor(Integer textColor) {
    this.textColor = textColor;
  }

  public Link getLink() {
    return this.link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public static class Builder {

    /**
     * 加粗
     * <p> 示例值：true
     */
    private Boolean bold;
    /**
     * 斜体
     * <p> 示例值：true
     */
    private Boolean italic;
    /**
     * 删除线
     * <p> 示例值：true
     */
    private Boolean strikethrough;
    /**
     * 下划线
     * <p> 示例值：true
     */
    private Boolean underline;
    /**
     * inline 代码
     * <p> 示例值：true
     */
    private Boolean inlineCode;
    /**
     * 背景色
     * <p> 示例值：1
     */
    private Integer backgroundColor;
    /**
     * 字体颜色
     * <p> 示例值：1
     */
    private Integer textColor;
    /**
     * 链接
     * <p> 示例值：
     */
    private Link link;

    /**
     * 加粗
     * <p> 示例值：true
     *
     * @param bold
     * @return
     */
    public Builder bold(Boolean bold) {
      this.bold = bold;
      return this;
    }


    /**
     * 斜体
     * <p> 示例值：true
     *
     * @param italic
     * @return
     */
    public Builder italic(Boolean italic) {
      this.italic = italic;
      return this;
    }


    /**
     * 删除线
     * <p> 示例值：true
     *
     * @param strikethrough
     * @return
     */
    public Builder strikethrough(Boolean strikethrough) {
      this.strikethrough = strikethrough;
      return this;
    }


    /**
     * 下划线
     * <p> 示例值：true
     *
     * @param underline
     * @return
     */
    public Builder underline(Boolean underline) {
      this.underline = underline;
      return this;
    }


    /**
     * inline 代码
     * <p> 示例值：true
     *
     * @param inlineCode
     * @return
     */
    public Builder inlineCode(Boolean inlineCode) {
      this.inlineCode = inlineCode;
      return this;
    }


    /**
     * 背景色
     * <p> 示例值：1
     *
     * @param backgroundColor
     * @return
     */
    public Builder backgroundColor(Integer backgroundColor) {
      this.backgroundColor = backgroundColor;
      return this;
    }

    /**
     * 背景色
     * <p> 示例值：1
     *
     * @param backgroundColor {@link com.lark.oapi.service.docx.v1.enums.TextElementStyleFontBackgroundColorEnum}
     * @return
     */
    public Builder backgroundColor(
        com.lark.oapi.service.docx.v1.enums.TextElementStyleFontBackgroundColorEnum backgroundColor) {
      this.backgroundColor = backgroundColor.getValue();
      return this;
    }


    /**
     * 字体颜色
     * <p> 示例值：1
     *
     * @param textColor
     * @return
     */
    public Builder textColor(Integer textColor) {
      this.textColor = textColor;
      return this;
    }

    /**
     * 字体颜色
     * <p> 示例值：1
     *
     * @param textColor {@link com.lark.oapi.service.docx.v1.enums.TextElementStyleFontColorEnum}
     * @return
     */
    public Builder textColor(
        com.lark.oapi.service.docx.v1.enums.TextElementStyleFontColorEnum textColor) {
      this.textColor = textColor.getValue();
      return this;
    }


    /**
     * 链接
     * <p> 示例值：
     *
     * @param link
     * @return
     */
    public Builder link(Link link) {
      this.link = link;
      return this;
    }


    public TextElementStyle build() {
      return new TextElementStyle(this);
    }
  }
}
