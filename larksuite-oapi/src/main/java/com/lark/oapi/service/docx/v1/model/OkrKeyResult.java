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

public class OkrKeyResult {

  /**
   * key result 的 ID
   * <p> 示例值："7109022573011894300"
   */
  @SerializedName("kr_id")
  private String krId;
  /**
   * 是否设置过私密权限
   * <p> 示例值：false
   */
  @SerializedName("confidential")
  private Boolean confidential;
  /**
   * key result 的位置编号，对应 Block 中 KR1、KR2 的 1、2。
   * <p> 示例值：1
   */
  @SerializedName("position")
  private Integer position;
  /**
   * 打分信息
   * <p> 示例值：0
   */
  @SerializedName("score")
  private Integer score;
  /**
   * OKR Block 中此 key result 是否可见
   * <p> 示例值：true
   */
  @SerializedName("visible")
  private Boolean visible;
  /**
   * key result 的权重
   * <p> 示例值：0.5
   */
  @SerializedName("weight")
  private Double weight;
  /**
   * 进展信息
   * <p> 示例值：
   */
  @SerializedName("progress_rate")
  private OkrProgressRate progressRate;
  /**
   * key result 的文本内容
   * <p> 示例值：
   */
  @SerializedName("content")
  private Text content;

  // builder 开始
  public OkrKeyResult() {
  }

  public OkrKeyResult(Builder builder) {
    /**
     * key result 的 ID
     * <p> 示例值："7109022573011894300"
     */
    this.krId = builder.krId;
    /**
     * 是否设置过私密权限
     * <p> 示例值：false
     */
    this.confidential = builder.confidential;
    /**
     * key result 的位置编号，对应 Block 中 KR1、KR2 的 1、2。
     * <p> 示例值：1
     */
    this.position = builder.position;
    /**
     * 打分信息
     * <p> 示例值：0
     */
    this.score = builder.score;
    /**
     * OKR Block 中此 key result 是否可见
     * <p> 示例值：true
     */
    this.visible = builder.visible;
    /**
     * key result 的权重
     * <p> 示例值：0.5
     */
    this.weight = builder.weight;
    /**
     * 进展信息
     * <p> 示例值：
     */
    this.progressRate = builder.progressRate;
    /**
     * key result 的文本内容
     * <p> 示例值：
     */
    this.content = builder.content;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getKrId() {
    return this.krId;
  }

  public void setKrId(String krId) {
    this.krId = krId;
  }

  public Boolean getConfidential() {
    return this.confidential;
  }

  public void setConfidential(Boolean confidential) {
    this.confidential = confidential;
  }

  public Integer getPosition() {
    return this.position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Integer getScore() {
    return this.score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Boolean getVisible() {
    return this.visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public Double getWeight() {
    return this.weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public OkrProgressRate getProgressRate() {
    return this.progressRate;
  }

  public void setProgressRate(OkrProgressRate progressRate) {
    this.progressRate = progressRate;
  }

  public Text getContent() {
    return this.content;
  }

  public void setContent(Text content) {
    this.content = content;
  }

  public static class Builder {

    /**
     * key result 的 ID
     * <p> 示例值："7109022573011894300"
     */
    private String krId;
    /**
     * 是否设置过私密权限
     * <p> 示例值：false
     */
    private Boolean confidential;
    /**
     * key result 的位置编号，对应 Block 中 KR1、KR2 的 1、2。
     * <p> 示例值：1
     */
    private Integer position;
    /**
     * 打分信息
     * <p> 示例值：0
     */
    private Integer score;
    /**
     * OKR Block 中此 key result 是否可见
     * <p> 示例值：true
     */
    private Boolean visible;
    /**
     * key result 的权重
     * <p> 示例值：0.5
     */
    private Double weight;
    /**
     * 进展信息
     * <p> 示例值：
     */
    private OkrProgressRate progressRate;
    /**
     * key result 的文本内容
     * <p> 示例值：
     */
    private Text content;

    /**
     * key result 的 ID
     * <p> 示例值："7109022573011894300"
     *
     * @param krId
     * @return
     */
    public Builder krId(String krId) {
      this.krId = krId;
      return this;
    }


    /**
     * 是否设置过私密权限
     * <p> 示例值：false
     *
     * @param confidential
     * @return
     */
    public Builder confidential(Boolean confidential) {
      this.confidential = confidential;
      return this;
    }


    /**
     * key result 的位置编号，对应 Block 中 KR1、KR2 的 1、2。
     * <p> 示例值：1
     *
     * @param position
     * @return
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }


    /**
     * 打分信息
     * <p> 示例值：0
     *
     * @param score
     * @return
     */
    public Builder score(Integer score) {
      this.score = score;
      return this;
    }


    /**
     * OKR Block 中此 key result 是否可见
     * <p> 示例值：true
     *
     * @param visible
     * @return
     */
    public Builder visible(Boolean visible) {
      this.visible = visible;
      return this;
    }


    /**
     * key result 的权重
     * <p> 示例值：0.5
     *
     * @param weight
     * @return
     */
    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }


    /**
     * 进展信息
     * <p> 示例值：
     *
     * @param progressRate
     * @return
     */
    public Builder progressRate(OkrProgressRate progressRate) {
      this.progressRate = progressRate;
      return this;
    }


    /**
     * key result 的文本内容
     * <p> 示例值：
     *
     * @param content
     * @return
     */
    public Builder content(Text content) {
      this.content = content;
      return this;
    }


    public OkrKeyResult build() {
      return new OkrKeyResult(this);
    }
  }
}
