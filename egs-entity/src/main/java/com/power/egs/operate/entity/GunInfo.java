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
public class GunInfo extends DataEntity<GunInfo> {
	
	private static final long serialVersionUID = 1L;
	private StationInfo station;		// 所属站 父类
	private Integer logicNo;		// 逻辑枪号
	private Integer potNo;		// 罐号
	private Integer machineNo;		// 油机编号
	private Integer surface;		// 油机面号
	private Integer realNo;		// 物理枪号
	
	private Goods goods;//商品
	public GunInfo() {
		super();
	}

	public GunInfo(String id){
		super(id);
	}

	public GunInfo(StationInfo station){
		this.station = station;
	}

	@Length(min=0, max=64, message="所属站长度必须介于 0 和 64 之间")
	public StationInfo getStation() {
		return station;
	}

	public void setStation(StationInfo station) {
		this.station = station;
	}
	
	public Integer getLogicNo() {
		return logicNo;
	}

	public void setLogicNo(Integer logicNo) {
		this.logicNo = logicNo;
	}
	
	public Integer getPotNo() {
		return potNo;
	}

	public void setPotNo(Integer potNo) {
		this.potNo = potNo;
	}
	
	public Integer getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(Integer machineNo) {
		this.machineNo = machineNo;
	}
	
	public Integer getSurface() {
		return surface;
	}

	public void setSurface(Integer surface) {
		this.surface = surface;
	}
	
	public Integer getRealNo() {
		return realNo;
	}

	public void setRealNo(Integer realNo) {
		this.realNo = realNo;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
}