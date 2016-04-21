/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.power.egs.operate.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 站点信息Entity
 * @author wulp
 * @version 2016-01-11
 */
public class OilingMachine extends DataEntity<OilingMachine> {
	
	private static final long serialVersionUID = 1L;
	private StationInfo station;		// 所属站 父类
	private Integer machineNo;		// 加油机编号
	private Integer surfaces;		// 面数
	private Integer gunNum;		// 枪数
	private Integer hubNo;		// 集线器编号
	private Integer channel;		// 通道
	private Integer status;		// 状态
	
	public OilingMachine() {
		super();
	}

	public OilingMachine(String id){
		super(id);
	}

	public OilingMachine(StationInfo station){
		this.station = station;
	}

	@Length(min=0, max=64, message="所属站长度必须介于 0 和 64 之间")
	public StationInfo getStation() {
		return station;
	}

	public void setStation(StationInfo station) {
		this.station = station;
	}
	
	public Integer getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(Integer machineNo) {
		this.machineNo = machineNo;
	}

	public Integer getSurfaces() {
		return surfaces;
	}

	public void setSurfaces(Integer surfaces) {
		this.surfaces = surfaces;
	}
	
	public Integer getGunNum() {
		return gunNum;
	}

	public void setGunNum(Integer gunNum) {
		this.gunNum = gunNum;
	}
	
	public Integer getHubNo() {
		return hubNo;
	}

	public void setHubNo(Integer hubNo) {
		this.hubNo = hubNo;
	}
	
	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}