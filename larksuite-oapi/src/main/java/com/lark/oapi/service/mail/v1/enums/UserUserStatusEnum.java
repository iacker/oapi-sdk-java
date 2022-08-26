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

package com.lark.oapi.service.mail.v1.enums;

/**
 * 邮箱地址状态
 */
public enum UserUserStatusEnum {
  INVALID(1), // 邮箱地址格式错误
  DOMAINNOTEXIST(2), // 邮箱地址域名不存在
  ADDRESSNOTEXIST(3), // 邮箱地址不存在
  ONBOARD(4), // 启用
  DELETED(5), // 已删除（邮箱回收站中）
  FORBIDDEN(6), // 禁用
  ;
  private Integer value;

  UserUserStatusEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}