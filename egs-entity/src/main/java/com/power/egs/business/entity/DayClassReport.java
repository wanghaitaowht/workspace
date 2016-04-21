package com.power.egs.business.entity;

import com.power.platform.common.persistence.DataEntity;

public class DayClassReport extends DataEntity<DayAccount> {

	private static final long serialVersionUID = 1L;
	private String dayAccountId;
	private String classReportId;
	
	public String getDayAccountId() {
		return dayAccountId;
	}
	public void setDayAccountId(String dayAccountId) {
		this.dayAccountId = dayAccountId;
	}
	public String getClassReportId() {
		return classReportId;
	}
	public void setClassReportId(String classReportId) {
		this.classReportId = classReportId;
	}
	
	
}
