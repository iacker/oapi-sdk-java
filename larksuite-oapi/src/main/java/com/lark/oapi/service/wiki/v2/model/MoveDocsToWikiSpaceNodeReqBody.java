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

package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;

public class MoveDocsToWikiSpaceNodeReqBody {

  /**
   * 节点的父亲token
   * <p> 示例值：wikbcOHIFxB0PJS2UTd2kF2SP6c
   */
  @SerializedName("parent_wiki_token")
  private String parentWikiToken;
  /**
   * 文档类型
   * <p> 示例值：doc
   */
  @SerializedName("obj_type")
  private String objType;
  /**
   * 文档token
   * <p> 示例值：docbc6e1qBqt1O5mCBVA1QUKVEg
   */
  @SerializedName("obj_token")
  private String objToken;
  /**
   * 没有权限时，是否申请迁入文档
   * <p> 示例值：true
   */
  @SerializedName("apply")
  private Boolean apply;

  // builder 开始
  public MoveDocsToWikiSpaceNodeReqBody() {
  }

  public MoveDocsToWikiSpaceNodeReqBody(Builder builder) {
    /**
     * 节点的父亲token
     * <p> 示例值：wikbcOHIFxB0PJS2UTd2kF2SP6c
     */
    this.parentWikiToken = builder.parentWikiToken;
    /**
     * 文档类型
     * <p> 示例值：doc
     */
    this.objType = builder.objType;
    /**
     * 文档token
     * <p> 示例值：docbc6e1qBqt1O5mCBVA1QUKVEg
     */
    this.objToken = builder.objToken;
    /**
     * 没有权限时，是否申请迁入文档
     * <p> 示例值：true
     */
    this.apply = builder.apply;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getParentWikiToken() {
    return this.parentWikiToken;
  }

  public void setParentWikiToken(String parentWikiToken) {
    this.parentWikiToken = parentWikiToken;
  }

  public String getObjType() {
    return this.objType;
  }

  public void setObjType(String objType) {
    this.objType = objType;
  }

  public String getObjToken() {
    return this.objToken;
  }

  public void setObjToken(String objToken) {
    this.objToken = objToken;
  }

  public Boolean getApply() {
    return this.apply;
  }

  public void setApply(Boolean apply) {
    this.apply = apply;
  }

  public static class Builder {

    /**
     * 节点的父亲token
     * <p> 示例值：wikbcOHIFxB0PJS2UTd2kF2SP6c
     */
    private String parentWikiToken;
    /**
     * 文档类型
     * <p> 示例值：doc
     */
    private String objType;
    /**
     * 文档token
     * <p> 示例值：docbc6e1qBqt1O5mCBVA1QUKVEg
     */
    private String objToken;
    /**
     * 没有权限时，是否申请迁入文档
     * <p> 示例值：true
     */
    private Boolean apply;

    /**
     * 节点的父亲token
     * <p> 示例值：wikbcOHIFxB0PJS2UTd2kF2SP6c
     *
     * @param parentWikiToken
     * @return
     */
    public Builder parentWikiToken(String parentWikiToken) {
      this.parentWikiToken = parentWikiToken;
      return this;
    }


    /**
     * 文档类型
     * <p> 示例值：doc
     *
     * @param objType
     * @return
     */
    public Builder objType(String objType) {
      this.objType = objType;
      return this;
    }

    /**
     * 文档类型
     * <p> 示例值：doc
     *
     * @param objType {@link com.lark.oapi.service.wiki.v2.enums.MoveDocsToWikiSpaceNodeMoveDocsToWikiObjTypeEnum}
     * @return
     */
    public Builder objType(
        com.lark.oapi.service.wiki.v2.enums.MoveDocsToWikiSpaceNodeMoveDocsToWikiObjTypeEnum objType) {
      this.objType = objType.getValue();
      return this;
    }


    /**
     * 文档token
     * <p> 示例值：docbc6e1qBqt1O5mCBVA1QUKVEg
     *
     * @param objToken
     * @return
     */
    public Builder objToken(String objToken) {
      this.objToken = objToken;
      return this;
    }


    /**
     * 没有权限时，是否申请迁入文档
     * <p> 示例值：true
     *
     * @param apply
     * @return
     */
    public Builder apply(Boolean apply) {
      this.apply = apply;
      return this;
    }


    public MoveDocsToWikiSpaceNodeReqBody build() {
      return new MoveDocsToWikiSpaceNodeReqBody(this);
    }
  }
}
