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

public class Okr {

  /**
   * OKR ID
   * <p> 示例值："7076349900476448796"
   */
  @SerializedName("okr_id")
  private String okrId;
  /**
   * OKR Block 中的 objective ID 和 key result ID，此值为空时插入 okr 下所有的 objective 和 key result
   * <p> 示例值：
   */
  @SerializedName("objectives")
  private ObjectiveIdWithKrId[] objectives;
  /**
   * 周期的状态
   * <p> 示例值："default"
   */
  @SerializedName("period_display_status")
  private String periodDisplayStatus;
  /**
   * 周期名 - 中文
   * <p> 示例值："2022 年 4 月 - 6 月"
   */
  @SerializedName("period_name_zh")
  private String periodNameZh;
  /**
   * 周期名 - 英文
   * <p> 示例值："Apr - Jun 2022"
   */
  @SerializedName("period_name_en")
  private String periodNameEn;
  /**
   * OKR 所属的用户 ID
   * <p> 示例值："ou_3bbe8a09c20e89cce9bff989ed840674"
   */
  @SerializedName("user_id")
  private String userId;
  /**
   * 可见性设置
   * <p> 示例值：
   */
  @SerializedName("visible_setting")
  private OkrVisibleSetting visibleSetting;

  // builder 开始
  public Okr() {
  }

  public Okr(Builder builder) {
    /**
     * OKR ID
     * <p> 示例值："7076349900476448796"
     */
    this.okrId = builder.okrId;
    /**
     * OKR Block 中的 objective ID 和 key result ID，此值为空时插入 okr 下所有的 objective 和 key result
     * <p> 示例值：
     */
    this.objectives = builder.objectives;
    /**
     * 周期的状态
     * <p> 示例值："default"
     */
    this.periodDisplayStatus = builder.periodDisplayStatus;
    /**
     * 周期名 - 中文
     * <p> 示例值："2022 年 4 月 - 6 月"
     */
    this.periodNameZh = builder.periodNameZh;
    /**
     * 周期名 - 英文
     * <p> 示例值："Apr - Jun 2022"
     */
    this.periodNameEn = builder.periodNameEn;
    /**
     * OKR 所属的用户 ID
     * <p> 示例值："ou_3bbe8a09c20e89cce9bff989ed840674"
     */
    this.userId = builder.userId;
    /**
     * 可见性设置
     * <p> 示例值：
     */
    this.visibleSetting = builder.visibleSetting;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getOkrId() {
    return this.okrId;
  }

  public void setOkrId(String okrId) {
    this.okrId = okrId;
  }

  public ObjectiveIdWithKrId[] getObjectives() {
    return this.objectives;
  }

  public void setObjectives(ObjectiveIdWithKrId[] objectives) {
    this.objectives = objectives;
  }

  public String getPeriodDisplayStatus() {
    return this.periodDisplayStatus;
  }

  public void setPeriodDisplayStatus(String periodDisplayStatus) {
    this.periodDisplayStatus = periodDisplayStatus;
  }

  public String getPeriodNameZh() {
    return this.periodNameZh;
  }

  public void setPeriodNameZh(String periodNameZh) {
    this.periodNameZh = periodNameZh;
  }

  public String getPeriodNameEn() {
    return this.periodNameEn;
  }

  public void setPeriodNameEn(String periodNameEn) {
    this.periodNameEn = periodNameEn;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public OkrVisibleSetting getVisibleSetting() {
    return this.visibleSetting;
  }

  public void setVisibleSetting(OkrVisibleSetting visibleSetting) {
    this.visibleSetting = visibleSetting;
  }

  public static class Builder {

    /**
     * OKR ID
     * <p> 示例值："7076349900476448796"
     */
    private String okrId;
    /**
     * OKR Block 中的 objective ID 和 key result ID，此值为空时插入 okr 下所有的 objective 和 key result
     * <p> 示例值：
     */
    private ObjectiveIdWithKrId[] objectives;
    /**
     * 周期的状态
     * <p> 示例值："default"
     */
    private String periodDisplayStatus;
    /**
     * 周期名 - 中文
     * <p> 示例值："2022 年 4 月 - 6 月"
     */
    private String periodNameZh;
    /**
     * 周期名 - 英文
     * <p> 示例值："Apr - Jun 2022"
     */
    private String periodNameEn;
    /**
     * OKR 所属的用户 ID
     * <p> 示例值："ou_3bbe8a09c20e89cce9bff989ed840674"
     */
    private String userId;
    /**
     * 可见性设置
     * <p> 示例值：
     */
    private OkrVisibleSetting visibleSetting;

    /**
     * OKR ID
     * <p> 示例值："7076349900476448796"
     *
     * @param okrId
     * @return
     */
    public Builder okrId(String okrId) {
      this.okrId = okrId;
      return this;
    }


    /**
     * OKR Block 中的 objective ID 和 key result ID，此值为空时插入 okr 下所有的 objective 和 key result
     * <p> 示例值：
     *
     * @param objectives
     * @return
     */
    public Builder objectives(ObjectiveIdWithKrId[] objectives) {
      this.objectives = objectives;
      return this;
    }


    /**
     * 周期的状态
     * <p> 示例值："default"
     *
     * @param periodDisplayStatus
     * @return
     */
    public Builder periodDisplayStatus(String periodDisplayStatus) {
      this.periodDisplayStatus = periodDisplayStatus;
      return this;
    }

    /**
     * 周期的状态
     * <p> 示例值："default"
     *
     * @param periodDisplayStatus {@link com.lark.oapi.service.docx.v1.enums.OkrOkrPeriodDisplayStatusEnum}
     * @return
     */
    public Builder periodDisplayStatus(
        com.lark.oapi.service.docx.v1.enums.OkrOkrPeriodDisplayStatusEnum periodDisplayStatus) {
      this.periodDisplayStatus = periodDisplayStatus.getValue();
      return this;
    }


    /**
     * 周期名 - 中文
     * <p> 示例值："2022 年 4 月 - 6 月"
     *
     * @param periodNameZh
     * @return
     */
    public Builder periodNameZh(String periodNameZh) {
      this.periodNameZh = periodNameZh;
      return this;
    }


    /**
     * 周期名 - 英文
     * <p> 示例值："Apr - Jun 2022"
     *
     * @param periodNameEn
     * @return
     */
    public Builder periodNameEn(String periodNameEn) {
      this.periodNameEn = periodNameEn;
      return this;
    }


    /**
     * OKR 所属的用户 ID
     * <p> 示例值："ou_3bbe8a09c20e89cce9bff989ed840674"
     *
     * @param userId
     * @return
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }


    /**
     * 可见性设置
     * <p> 示例值：
     *
     * @param visibleSetting
     * @return
     */
    public Builder visibleSetting(OkrVisibleSetting visibleSetting) {
      this.visibleSetting = visibleSetting;
      return this;
    }


    public Okr build() {
      return new Okr(this);
    }
  }
}
