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

package com.lark.oapi.service.calendar.v4.enums;

/**
 * 对日历的访问权限
 */
public enum CalendarAclCalendarAccessRoleEnum {
  UNKONWN("unknown"), // 未知权限
  FREEBUSYREADER("free_busy_reader"), // 游客，只能看到忙碌/空闲信息
  READER("reader"), // 订阅者，查看所有日程详情
  WRITER("writer"), // 编辑者，创建及修改日程
  OWNER("owner"), // 管理员，管理日历及共享设置
  ;
  private String value;

  CalendarAclCalendarAccessRoleEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}