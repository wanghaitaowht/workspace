/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.power.egs.operate.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.power.egs.business.entity.ClassReport;
import com.power.egs.business.entity.DayAccount;
import com.power.platform.common.persistence.DataEntity;
import com.power.platform.sys.entity.Office;
import com.power.platform.sys.entity.User;

/**
 * 站点信息Entity
 * @author wulp
 * @version 2016-01-11
 */
public class StationInfo extends DataEntity<StationInfo> {
	
	private static final long serialVersionUID = 1L;
	private Office office;		// 所属组织   上级组织
	private String name;		// 站点名称
	private String shortName;		// 站点简称
	private String code;		// 站点编码
	private Double longitude;		// 经度
	private Double latitude;		// 纬度
	private String phone;		// 电话
	private User leader;		// 主管领导
	private String address;		// 地址
	private Integer status;		// 状态  0表示未开站  1表示开站  2表示停站
	private List<ClassReport> classReportList = Lists.newArrayList();		// 子表列表
	private List<DayAccount> dayAccountList = Lists.newArrayList();		// 子表列表
	private List<Goods> goodsList = Lists.newArrayList();		// 子表列表
	private List<GunInfo> gunInfoList = Lists.newArrayList();		// 子表列表
	private List<HubInfo> hubInfoList = Lists.newArrayList();		// 子表列表
	//private List<MonthAccount> monthAccountList = Lists.newArrayList();		// 子表列表
	private List<OilingMachine> oilingMachineList = Lists.newArrayList();		// 子表列表
	private List<PotInfo> potInfoList = Lists.newArrayList();		// 子表列表
	
	private String month; //月盘点时间

	private Office ownOffice;//自己的组织
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	public StationInfo() {
		super();
	}

	public StationInfo(String id){
		super(id);
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
	
	@Length(min=0, max=100, message="站点名称长度必须介于 0 和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=50, message="站点简称长度必须介于 0 和 50 之间")
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	@Length(min=0, max=15, message="站点编码长度必须介于 0 和 15 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	@Length(min=0, max=15, message="电话长度必须介于 0 和 15 之间")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	public User getLeader() {
		return leader;
	}

	public void setLeader(User leader) {
		this.leader = leader;
	}

	@Length(min=0, max=255, message="地址长度必须介于 0 和 255 之间")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public List<ClassReport> getClassReportList() {
		return classReportList;
	}

	public void setClassReportList(List<ClassReport> classReportList) {
		this.classReportList = classReportList;
	}
	public List<DayAccount> getDayAccountList() {
		return dayAccountList;
	}

	public void setDayAccountList(List<DayAccount> dayAccountList) {
		this.dayAccountList = dayAccountList;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	public List<GunInfo> getGunInfoList() {
		return gunInfoList;
	}

	public void setGunInfoList(List<GunInfo> gunInfoList) {
		this.gunInfoList = gunInfoList;
	}
	public List<HubInfo> getHubInfoList() {
		return hubInfoList;
	}

	public void setHubInfoList(List<HubInfo> hubInfoList) {
		this.hubInfoList = hubInfoList;
	}
	/*public List<MonthAccount> getMonthAccountList() {
		return monthAccountList;
	}

	public void setMonthAccountList(List<MonthAccount> monthAccountList) {
		this.monthAccountList = monthAccountList;
	}*/
	public List<OilingMachine> getOilingMachineList() {
		return oilingMachineList;
	}

	public void setOilingMachineList(List<OilingMachine> oilingMachineList) {
		this.oilingMachineList = oilingMachineList;
	}
	public List<PotInfo> getPotInfoList() {
		return potInfoList;
	}

	public void setPotInfoList(List<PotInfo> potInfoList) {
		this.potInfoList = potInfoList;
	}

	public Office getOwnOffice() {
		return ownOffice;
	}

	public void setOwnOffice(Office ownOffice) {
		this.ownOffice = ownOffice;
	}
	
	
}