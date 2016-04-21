package com.power.egs.business.voentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.power.egs.business.entity.EgsPotMonth;

/**
 *月盘点Vo
 * @author haitao
 *
 */
public class MonthAccountVo implements  Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String stationId;
	private String month;
	private Date startTime;
	private Date endTime;
	private String stationName;
	private String userId;
	private String userName;
	private Date createDate;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	List<EgsPotMonth> potdatalist=new ArrayList<EgsPotMonth>();  //月盘点油罐数据

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public List<EgsPotMonth> getPotdatalist() {
		return potdatalist;
	}

	public void setPotdatalist(List<EgsPotMonth> potdatalist) {
		this.potdatalist = potdatalist;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
}

