package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;
import com.power.platform.sys.entity.User;

/**
 * 首页消息Entity
 * 
 * @author guojinlong
 * @version 2016-03-11
 */
public class EmployeeData extends DataEntity<EmployeeData> {

	private static final long serialVersionUID = 1L;
	private String classId; // 班报ID
	private String user; // 员工ID
	private String userName; // 员工名称
	private Double outStorge; // 付油量
	private Double cash; // 现金款

	private ClassReport classReport;

	public EmployeeData(ClassReport classReport) {
		this.classId = classReport.getId();
		this.classReport = classReport;
	}

	public EmployeeData() {
		super();
	}

	public EmployeeData(String id) {
		super(id);
	}

	@Length(min=0, max=64, message="班报ID长度必须介于 0 和 64 之间")
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	@Length(min=0, max=32, message="员工名称长度必须介于 0 和 32 之间")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getOutStorge() {
		return outStorge;
	}

	public void setOutStorge(Double outStorge) {
		this.outStorge = outStorge;
	}

	public Double getCash() {
		return cash;
	}

	public void setCash(Double cash) {
		this.cash = cash;
	}
	public ClassReport getClassReport() {
		return classReport;
	}

	public void setClassReport(ClassReport classReport) {
		this.classReport = classReport;
	}
}