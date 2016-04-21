package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 入库数据Entity
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsInstockDate extends DataEntity<EgsInstockDate> {
	
	private static final long serialVersionUID = 1L;
	private String stationId;		// 站ID
	private String stationName;		// 站名称
	private String classNo;		// 班次号
	private String totalInstock;		// 总入库量
	
	private String userName;  //用户姓名
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public EgsInstockDate() {
		super();
	}

	public EgsInstockDate(String id){
		super(id);
	}

	@Length(min=0, max=64, message="站ID长度必须介于 0 和 64 之间")
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	
	@Length(min=0, max=32, message="站名称长度必须介于 0 和 32 之间")
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	@Length(min=0, max=10, message="班次号长度必须介于 0 和 10 之间")
	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	
	public String getTotalInstock() {
		return totalInstock;
	}

	public void setTotalInstock(String totalInstock) {
		this.totalInstock = totalInstock;
	}
	
}