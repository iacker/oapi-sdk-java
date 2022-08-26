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

package com.lark.oapi.service.face_detection.v1.model;

import com.google.gson.annotations.SerializedName;

public class FacePose {

  /**
   * 脸部上下偏移 [-90, 90]
   * <p> 示例值：-31
   */
  @SerializedName("pitch")
  private Integer pitch;
  /**
   * 脸部左右偏移 [-90, 90]
   * <p> 示例值：22
   */
  @SerializedName("yaw")
  private Integer yaw;
  /**
   * 平面旋转 [-90, 90]
   * <p> 示例值：-32
   */
  @SerializedName("roll")
  private Integer roll;

  // builder 开始
  public FacePose() {
  }

  public FacePose(Builder builder) {
    /**
     * 脸部上下偏移 [-90, 90]
     * <p> 示例值：-31
     */
    this.pitch = builder.pitch;
    /**
     * 脸部左右偏移 [-90, 90]
     * <p> 示例值：22
     */
    this.yaw = builder.yaw;
    /**
     * 平面旋转 [-90, 90]
     * <p> 示例值：-32
     */
    this.roll = builder.roll;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getPitch() {
    return this.pitch;
  }

  public void setPitch(Integer pitch) {
    this.pitch = pitch;
  }

  public Integer getYaw() {
    return this.yaw;
  }

  public void setYaw(Integer yaw) {
    this.yaw = yaw;
  }

  public Integer getRoll() {
    return this.roll;
  }

  public void setRoll(Integer roll) {
    this.roll = roll;
  }

  public static class Builder {

    /**
     * 脸部上下偏移 [-90, 90]
     * <p> 示例值：-31
     */
    private Integer pitch;
    /**
     * 脸部左右偏移 [-90, 90]
     * <p> 示例值：22
     */
    private Integer yaw;
    /**
     * 平面旋转 [-90, 90]
     * <p> 示例值：-32
     */
    private Integer roll;

    /**
     * 脸部上下偏移 [-90, 90]
     * <p> 示例值：-31
     *
     * @param pitch
     * @return
     */
    public Builder pitch(Integer pitch) {
      this.pitch = pitch;
      return this;
    }


    /**
     * 脸部左右偏移 [-90, 90]
     * <p> 示例值：22
     *
     * @param yaw
     * @return
     */
    public Builder yaw(Integer yaw) {
      this.yaw = yaw;
      return this;
    }


    /**
     * 平面旋转 [-90, 90]
     * <p> 示例值：-32
     *
     * @param roll
     * @return
     */
    public Builder roll(Integer roll) {
      this.roll = roll;
      return this;
    }


    public FacePose build() {
      return new FacePose(this);
    }
  }
}
