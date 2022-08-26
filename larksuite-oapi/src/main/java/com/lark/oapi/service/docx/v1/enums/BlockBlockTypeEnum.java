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

package com.lark.oapi.service.docx.v1.enums;

/**
 * block 类型
 */
public enum BlockBlockTypeEnum {
  PAGE(1), // 页面 Block
  TEXT(2), // 文本 Block
  HEADING1(3), // 标题 1 Block
  HEADING2(4), // 标题 2 Block
  HEADING3(5), // 标题 3 Block
  HEADING4(6), // 标题 4 Block
  HEADING5(7), // 标题 5 Block
  HEADING6(8), // 标题 6 Block
  HEADING7(9), // 标题 7 Block
  HEADING8(10), // 标题 8 Block
  HEADING9(11), // 标题 9 Block
  BULLET(12), // 无序列表 Block
  ORDERED(13), // 有序列表 Block
  CODE(14), // 代码块 Block
  QUOTE(15), // 引用 Block
  TODO(17), // 待办事项 Block
  BITABLE(18), // 多维表格 Block
  CALLOUT(19), // 高亮块 Block
  CHATCARD(20), // 会话卡片 Block
  DIAGRAM(21), // 流程图 & UML Block
  DIVIDER(22), // 分割线 Block
  FILE(23), // 文件 Block
  GRID(24), // 分栏 Block
  GRIDCOLUMN(25), // 分栏列 Block
  IFRAME(26), // 内嵌 Block Block
  IMAGE(27), // 图片 Block
  ISV(28), // 开放平台小组件 Block
  MINDNOTE(29), // 思维笔记 Block
  SHEET(30), // 电子表格 Block
  TABLE(31), // 表格 Block
  TABLECELL(32), // 表格单元格 Block
  VIEW(33), // 视图 Block
  QUOTECONTAINER(34), // 引用容器 Block
  TASK(35), // 任务 Block
  OKR(36), // OKR Block
  OKROBJECTIVE(37), // OKR Objective
  OKRKEYRESULT(38), // OKR Key Result
  OKRPROGRESS(39), // OKR 进展
  UNDEFINED(999), // 未支持 Block
  ;
  private Integer value;

  BlockBlockTypeEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return this.value;
  }
}