package com.power.egs.business.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * @author guojinlong
 * @version 2016-03-11
 */
public class OnoffDuty extends DataEntity<OnoffDuty> {
	
	private static final long serialVersionUID = 1L;
	private Integer onDutyNo;		// 开班流水
	private String classNo;		// 班次号
	private String stationId;		// 站ID
	private String stationName;		// 站名称
	private String onDutyUserId;		// 开班人ID
	private String onDutyUserName;		// 开班人名称
	private Date onDutyDate;		// 上班时间
	private Date offDutyDate;		// 下班时间
	private String status;		// 状态 0:未下班 ; 1：已下班;2已班结
	
	public List<EmployeeData> employeeDataList = Lists.newArrayList();	// 本班员工数据列表
//	public List<GunData> gunDataList = Lists.newArrayList();		// 枪数据列表
	public List<PotData> potDataList = Lists.newArrayList();		// 罐数据列表
//	public List<GoodsData> goodsDataList = Lists.newArrayList();	// 商品数据列表
	private Double crashPaytotal;		// 现金交易金额
	private Double bankcardPaytotal;		// 银行卡交易金额
	private Double iccardPaytotal;		// IC卡交易金额
	private Double onlinePaytotal;		// 在线支付交易金额
	private Double incomeTotal;		// 本班交易金额
	private Double totailPaynum;		// 本班付油量
	
	private ClassReport classReport;
	
	public OnoffDuty(ClassReport classReport) {
		this.classReport = classReport;
		this.classNo = classReport.getClassNo();
		this.stationId = classReport.getStationId();
	}
	
	public OnoffDuty() {
		super();
	}

	public OnoffDuty(String id){
		super(id);
	}

	public Integer getOnDutyNo() {
		return onDutyNo;
	}

	public void setOnDutyNo(Integer onDutyNo) {
		this.onDutyNo = onDutyNo;
	}
	
	@Length(min=0, max=10, message="班次号长度必须介于 0 和 10 之间")
	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	
	@Length(min=0, max=64, message="站ID长度必须介于 0 和 64 之间")
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	
	@Length(min=0, max=50, message="站名称长度必须介于 0 和 50 之间")
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	@Length(min=0, max=64, message="开班人ID长度必须介于 0 和 64 之间")
	public String getOnDutyUserId() {
		return onDutyUserId;
	}

	public void setOnDutyUserId(String onDutyUserId) {
		this.onDutyUserId = onDutyUserId;
	}
	
	@Length(min=0, max=32, message="开班人名称长度必须介于 0 和 32 之间")
	public String getOnDutyUserName() {
		return onDutyUserName;
	}

	public void setOnDutyUserName(String onDutyUserName) {
		this.onDutyUserName = onDutyUserName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOnDutyDate() {
		return onDutyDate;
	}

	public void setOnDutyDate(Date onDutyDate) {
		this.onDutyDate = onDutyDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOffDutyDate() {
		return offDutyDate;
	}

	public void setOffDutyDate(Date offDutyDate) {
		this.offDutyDate = offDutyDate;
	}
	
	@Length(min=0, max=1, message="状态 0:未下班 1：已下班长度必须介于 0 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ClassReport getClassReport() {
		return classReport;
	}

	public void setClassReport(ClassReport classReport) {
		this.classReport = classReport;
	}

	public List<EmployeeData> getEmployeeDataList() {
		return employeeDataList;
	}

	public void setEmployeeDataList(List<EmployeeData> employeeDataList) {
		this.employeeDataList = employeeDataList;
	}

	public Double getCrashPaytotal() {
		return crashPaytotal;
	}

	public void setCrashPaytotal(Double crashPaytotal) {
		this.crashPaytotal = crashPaytotal;
	}

	public Double getBankcardPaytotal() {
		return bankcardPaytotal;
	}

	public void setBankcardPaytotal(Double bankcardPaytotal) {
		this.bankcardPaytotal = bankcardPaytotal;
	}

	public Double getIccardPaytotal() {
		return iccardPaytotal;
	}

	public void setIccardPaytotal(Double iccardPaytotal) {
		this.iccardPaytotal = iccardPaytotal;
	}

	public Double getOnlinePaytotal() {
		return onlinePaytotal;
	}

	public void setOnlinePaytotal(Double onlinePaytotal) {
		this.onlinePaytotal = onlinePaytotal;
	}

	public Double getIncomeTotal() {
		return incomeTotal;
	}

	public void setIncomeTotal(Double incomeTotal) {
		this.incomeTotal = incomeTotal;
	}

	public Double getTotailPaynum() {
		return totailPaynum;
	}

	public void setTotailPaynum(Double totailPaynum) {
		this.totailPaynum = totailPaynum;
	}
	
	
}