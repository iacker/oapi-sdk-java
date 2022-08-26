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

public class TripGroupSchedule {

  /**
   * 开始时间
   * <p> 示例值：
   */
  @SerializedName("trip_start_time")
  private String tripStartTime;
  /**
   * 结束时间
   * <p> 示例值：
   */
  @SerializedName("trip_end_time")
  private String tripEndTime;
  /**
   * 周期
   * <p> 示例值：
   */
  @SerializedName("trip_interval")
  private String tripInterval;
  /**
   * 出发地
   * <p> 示例值：
   */
  @SerializedName("departure")
  private String departure;
  /**
   * 目的地
   * <p> 示例值：
   */
  @SerializedName("destination")
  private String destination;
  /**
   * 交通工具
   * <p> 示例值：
   */
  @SerializedName("transportation")
  private String transportation;
  /**
   * 出差类型
   * <p> 示例值：
   */
  @SerializedName("trip_type")
  private String tripType;
  /**
   * 备注
   * <p> 示例值：
   */
  @SerializedName("remark")
  private String remark;

  // builder 开始
  public TripGroupSchedule() {
  }

  public TripGroupSchedule(Builder builder) {
    /**
     * 开始时间
     * <p> 示例值：
     */
    this.tripStartTime = builder.tripStartTime;
    /**
     * 结束时间
     * <p> 示例值：
     */
    this.tripEndTime = builder.tripEndTime;
    /**
     * 周期
     * <p> 示例值：
     */
    this.tripInterval = builder.tripInterval;
    /**
     * 出发地
     * <p> 示例值：
     */
    this.departure = builder.departure;
    /**
     * 目的地
     * <p> 示例值：
     */
    this.destination = builder.destination;
    /**
     * 交通工具
     * <p> 示例值：
     */
    this.transportation = builder.transportation;
    /**
     * 出差类型
     * <p> 示例值：
     */
    this.tripType = builder.tripType;
    /**
     * 备注
     * <p> 示例值：
     */
    this.remark = builder.remark;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTripStartTime() {
    return this.tripStartTime;
  }

  public void setTripStartTime(String tripStartTime) {
    this.tripStartTime = tripStartTime;
  }

  public String getTripEndTime() {
    return this.tripEndTime;
  }

  public void setTripEndTime(String tripEndTime) {
    this.tripEndTime = tripEndTime;
  }

  public String getTripInterval() {
    return this.tripInterval;
  }

  public void setTripInterval(String tripInterval) {
    this.tripInterval = tripInterval;
  }

  public String getDeparture() {
    return this.departure;
  }

  public void setDeparture(String departure) {
    this.departure = departure;
  }

  public String getDestination() {
    return this.destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getTransportation() {
    return this.transportation;
  }

  public void setTransportation(String transportation) {
    this.transportation = transportation;
  }

  public String getTripType() {
    return this.tripType;
  }

  public void setTripType(String tripType) {
    this.tripType = tripType;
  }

  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public static class Builder {

    /**
     * 开始时间
     * <p> 示例值：
     */
    private String tripStartTime;
    /**
     * 结束时间
     * <p> 示例值：
     */
    private String tripEndTime;
    /**
     * 周期
     * <p> 示例值：
     */
    private String tripInterval;
    /**
     * 出发地
     * <p> 示例值：
     */
    private String departure;
    /**
     * 目的地
     * <p> 示例值：
     */
    private String destination;
    /**
     * 交通工具
     * <p> 示例值：
     */
    private String transportation;
    /**
     * 出差类型
     * <p> 示例值：
     */
    private String tripType;
    /**
     * 备注
     * <p> 示例值：
     */
    private String remark;

    /**
     * 开始时间
     * <p> 示例值：
     *
     * @param tripStartTime
     * @return
     */
    public Builder tripStartTime(String tripStartTime) {
      this.tripStartTime = tripStartTime;
      return this;
    }


    /**
     * 结束时间
     * <p> 示例值：
     *
     * @param tripEndTime
     * @return
     */
    public Builder tripEndTime(String tripEndTime) {
      this.tripEndTime = tripEndTime;
      return this;
    }


    /**
     * 周期
     * <p> 示例值：
     *
     * @param tripInterval
     * @return
     */
    public Builder tripInterval(String tripInterval) {
      this.tripInterval = tripInterval;
      return this;
    }


    /**
     * 出发地
     * <p> 示例值：
     *
     * @param departure
     * @return
     */
    public Builder departure(String departure) {
      this.departure = departure;
      return this;
    }


    /**
     * 目的地
     * <p> 示例值：
     *
     * @param destination
     * @return
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }


    /**
     * 交通工具
     * <p> 示例值：
     *
     * @param transportation
     * @return
     */
    public Builder transportation(String transportation) {
      this.transportation = transportation;
      return this;
    }


    /**
     * 出差类型
     * <p> 示例值：
     *
     * @param tripType
     * @return
     */
    public Builder tripType(String tripType) {
      this.tripType = tripType;
      return this;
    }


    /**
     * 备注
     * <p> 示例值：
     *
     * @param remark
     * @return
     */
    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }


    public TripGroupSchedule build() {
      return new TripGroupSchedule(this);
    }
  }
}
