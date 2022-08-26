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

public class ApprovalConfig {

  /**
   * 允许用户修改可见范围
   * <p> 示例值：false
   */
  @SerializedName("can_update_viewer")
  private Boolean canUpdateViewer;
  /**
   * 允许用户更新表单
   * <p> 示例值：false
   */
  @SerializedName("can_update_form")
  private Boolean canUpdateForm;
  /**
   * 允许用户更新流程定义
   * <p> 示例值：false
   */
  @SerializedName("can_update_process")
  private Boolean canUpdateProcess;
  /**
   * 允许用户更新撤回设置
   * <p> 示例值：false
   */
  @SerializedName("can_update_revert")
  private Boolean canUpdateRevert;
  /**
   * 帮助文档链接
   * <p> 示例值：https://www.baidu.com
   */
  @SerializedName("help_url")
  private String helpUrl;

  // builder 开始
  public ApprovalConfig() {
  }

  public ApprovalConfig(Builder builder) {
    /**
     * 允许用户修改可见范围
     * <p> 示例值：false
     */
    this.canUpdateViewer = builder.canUpdateViewer;
    /**
     * 允许用户更新表单
     * <p> 示例值：false
     */
    this.canUpdateForm = builder.canUpdateForm;
    /**
     * 允许用户更新流程定义
     * <p> 示例值：false
     */
    this.canUpdateProcess = builder.canUpdateProcess;
    /**
     * 允许用户更新撤回设置
     * <p> 示例值：false
     */
    this.canUpdateRevert = builder.canUpdateRevert;
    /**
     * 帮助文档链接
     * <p> 示例值：https://www.baidu.com
     */
    this.helpUrl = builder.helpUrl;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Boolean getCanUpdateViewer() {
    return this.canUpdateViewer;
  }

  public void setCanUpdateViewer(Boolean canUpdateViewer) {
    this.canUpdateViewer = canUpdateViewer;
  }

  public Boolean getCanUpdateForm() {
    return this.canUpdateForm;
  }

  public void setCanUpdateForm(Boolean canUpdateForm) {
    this.canUpdateForm = canUpdateForm;
  }

  public Boolean getCanUpdateProcess() {
    return this.canUpdateProcess;
  }

  public void setCanUpdateProcess(Boolean canUpdateProcess) {
    this.canUpdateProcess = canUpdateProcess;
  }

  public Boolean getCanUpdateRevert() {
    return this.canUpdateRevert;
  }

  public void setCanUpdateRevert(Boolean canUpdateRevert) {
    this.canUpdateRevert = canUpdateRevert;
  }

  public String getHelpUrl() {
    return this.helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }

  public static class Builder {

    /**
     * 允许用户修改可见范围
     * <p> 示例值：false
     */
    private Boolean canUpdateViewer;
    /**
     * 允许用户更新表单
     * <p> 示例值：false
     */
    private Boolean canUpdateForm;
    /**
     * 允许用户更新流程定义
     * <p> 示例值：false
     */
    private Boolean canUpdateProcess;
    /**
     * 允许用户更新撤回设置
     * <p> 示例值：false
     */
    private Boolean canUpdateRevert;
    /**
     * 帮助文档链接
     * <p> 示例值：https://www.baidu.com
     */
    private String helpUrl;

    /**
     * 允许用户修改可见范围
     * <p> 示例值：false
     *
     * @param canUpdateViewer
     * @return
     */
    public Builder canUpdateViewer(Boolean canUpdateViewer) {
      this.canUpdateViewer = canUpdateViewer;
      return this;
    }


    /**
     * 允许用户更新表单
     * <p> 示例值：false
     *
     * @param canUpdateForm
     * @return
     */
    public Builder canUpdateForm(Boolean canUpdateForm) {
      this.canUpdateForm = canUpdateForm;
      return this;
    }


    /**
     * 允许用户更新流程定义
     * <p> 示例值：false
     *
     * @param canUpdateProcess
     * @return
     */
    public Builder canUpdateProcess(Boolean canUpdateProcess) {
      this.canUpdateProcess = canUpdateProcess;
      return this;
    }


    /**
     * 允许用户更新撤回设置
     * <p> 示例值：false
     *
     * @param canUpdateRevert
     * @return
     */
    public Builder canUpdateRevert(Boolean canUpdateRevert) {
      this.canUpdateRevert = canUpdateRevert;
      return this;
    }


    /**
     * 帮助文档链接
     * <p> 示例值：https://www.baidu.com
     *
     * @param helpUrl
     * @return
     */
    public Builder helpUrl(String helpUrl) {
      this.helpUrl = helpUrl;
      return this;
    }


    public ApprovalConfig build() {
      return new ApprovalConfig(this);
    }
  }
}
