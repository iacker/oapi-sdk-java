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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class UpdatePublicMailboxReq {

  /**
   * 公共邮箱唯一标识或公共邮箱地址
   * <p> 示例值：xxxxxxxxxxxxxxx 或 test_public_mailbox@xxx.xx
   */
  @Path
  @SerializedName("public_mailbox_id")
  private String publicMailboxId;
  @Body
  private PublicMailbox body;

  // builder 开始
  public UpdatePublicMailboxReq() {
  }

  public UpdatePublicMailboxReq(Builder builder) {
    /**
     * 公共邮箱唯一标识或公共邮箱地址
     * <p> 示例值：xxxxxxxxxxxxxxx 或 test_public_mailbox@xxx.xx
     */
    this.publicMailboxId = builder.publicMailboxId;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPublicMailboxId() {
    return this.publicMailboxId;
  }

  public void setPublicMailboxId(String publicMailboxId) {
    this.publicMailboxId = publicMailboxId;
  }

  public PublicMailbox getPublicMailbox() {
    return this.body;
  }

  public void setPublicMailbox(PublicMailbox body) {
    this.body = body;
  }

  public static class Builder {

    private String publicMailboxId; // 公共邮箱唯一标识或公共邮箱地址
    private PublicMailbox body;

    /**
     * 公共邮箱唯一标识或公共邮箱地址
     * <p> 示例值：xxxxxxxxxxxxxxx 或 test_public_mailbox@xxx.xx
     *
     * @param publicMailboxId
     * @return
     */
    public Builder publicMailboxId(String publicMailboxId) {
      this.publicMailboxId = publicMailboxId;
      return this;
    }

    public PublicMailbox getPublicMailbox() {
      return this.body;
    }

    /**
     * body
     *
     * @param body
     * @return
     */
    public Builder publicMailbox(PublicMailbox body) {
      this.body = body;
      return this;
    }

    public UpdatePublicMailboxReq build() {
      return new UpdatePublicMailboxReq(this);
    }
  }
}
