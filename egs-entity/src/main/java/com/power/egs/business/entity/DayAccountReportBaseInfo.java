package com.power.egs.business.entity;

import java.util.Date;

import com.power.platform.common.persistence.DataEntity;

public class DayAccountReportBaseInfo extends DataEntity<DayAccount> {

	private static final long serialVersionUID = 1L;
	private String stationShortName;		// 站点简称
	private String dayAccountDate;			// 日结日期
	private String britich;					//单位(容积 默认L升)
	private Date firshStartworkDate;		//最初接班时间
	private Date lastOverworkDate;			//最后交班时间
	private String stationLeader;			//站长
	private String classNos;				//包含班次
	
	public String getStationShortName() {
		return stationShortName;
	}
	public void setStationShortName(String stationShortName) {
		this.stationShortName = stationShortName;
	}
	public String getDayAccountDate() {
		return dayAccountDate;
	}
	public void setDayAccountDate(String dayAccountDate) {
		this.dayAccountDate = dayAccountDate;
	}
	public String getBritich() {
		return britich;
	}
	public void setBritich(String britich) {
		this.britich = britich;
	}
	public Date getFirshStartworkDate() {
		return firshStartworkDate;
	}
	public void setFirshStartworkDate(Date firshStartworkDate) {
		this.firshStartworkDate = firshStartworkDate;
	}
	public Date getLastOverworkDate() {
		return lastOverworkDate;
	}
	public void setLastOverworkDate(Date lastOverworkDate) {
		this.lastOverworkDate = lastOverworkDate;
	}
	public String getStationLeader() {
		return stationLeader;
	}
	public void setStationLeader(String stationLeader) {
		this.stationLeader = stationLeader;
	}
	public String getClassNos() {
		return classNos;
	}
	public void setClassNos(String classNos) {
		this.classNos = classNos;
	}
	
}
