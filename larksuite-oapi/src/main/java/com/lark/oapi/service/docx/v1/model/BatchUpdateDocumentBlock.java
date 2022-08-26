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

public class BatchUpdateDocumentBlock {

  /**
   * 批量更新的 Block
   * <p> 示例值：
   */
  @SerializedName("blocks")
  private Block[] blocks;
  /**
   * 当前更新成功后文档的版本号
   * <p> 示例值：1
   */
  @SerializedName("document_revision_id")
  private Integer documentRevisionId;
  /**
   * 操作的唯一标识，更新请求中使用此值表示幂等的进行此次更新
   * <p> 示例值：8aac2291-bc9e-4b12-a162-b3cf15bb06bd
   */
  @SerializedName("client_token")
  private String clientToken;

  public Block[] getBlocks() {
    return this.blocks;
  }

  public void setBlocks(Block[] blocks) {
    this.blocks = blocks;
  }

  public Integer getDocumentRevisionId() {
    return this.documentRevisionId;
  }

  public void setDocumentRevisionId(Integer documentRevisionId) {
    this.documentRevisionId = documentRevisionId;
  }

  public String getClientToken() {
    return this.clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

}
