package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 冲销数据Entity
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsWriteoffData extends DataEntity<EgsWriteoffData> {
	
	private static final long serialVersionUID = 1L;
	private String stationId;		// 站ID
	private String stationName;		// 站名称
	private String classNo;		// 班次号
	private String totalWriteoff;		// 总冲销量
	private String reasonWriteoff;		// 冲销原因
	
	private String userName;  //用户姓名  用于页面显示
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public EgsWriteoffData() {
		super();
	}

	public EgsWriteoffData(String id){
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
	
	public String getTotalWriteoff() {
		return totalWriteoff;
	}

	public void setTotalWriteoff(String totalWriteoff) {
		this.totalWriteoff = totalWriteoff;
	}
	
	@Length(min=0, max=255, message="冲销原因长度必须介于 0 和 255 之间")
	public String getReasonWriteoff() {
		return reasonWriteoff;
	}

	public void setReasonWriteoff(String reasonWriteoff) {
		this.reasonWriteoff = reasonWriteoff;
	}
	
}