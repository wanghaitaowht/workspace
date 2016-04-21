package com.power.egs.business.entity;

import java.util.List;
import org.hibernate.validator.constraints.Length;

import com.google.common.collect.Lists;
import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * @author guojinlong
 * @version 2016-03-11
 */
public class ClassReport extends DataEntity<ClassReport> {
	
	private static final long serialVersionUID = 1L;
	private String stationId;		// 所属站
	private String stationName;		// 站名称
	private String classNo;		// 班次号            自动生成,规则:yyyymmdd+两位数字,最大到99
	private Double crashPaytotal;		// 现金交易金额
	private Double bankcardPaytotal;		// 银行卡交易金额
	private Double iccardPaytotal;		// IC卡交易金额
	private Double onlinePaytotal;		// 在线支付交易金额
	private Double incomeTotal;		// 本班交易金额
	private Double orderIncomeTotal;		// 订单本班交易金额
	private Integer mode;		// 采集方式            1.手动录入            2.自动采集
	private Double totailPaynum;		// 付油量合计
	private Double orderTotailPaynum;		// 订单付油量合计
	private Double totailAccount;		// 商品帐存合计
	private String status;		// 状态           0：未班结  1.已班结，未日结            2.已日结
	
	private String UserName;
	
	
	public List<GunData> gunDataList = Lists.newArrayList();		// 枪数据列表
	public List<PotData> potDataList = Lists.newArrayList();		// 罐数据列表
	public List<GoodsData> goodsDataList = Lists.newArrayList();	// 商品数据列表
	public List<EmployeeData> employeeDataList = Lists.newArrayList();	// 本班员工数据列表
	public OnoffDuty onoffDuty = new OnoffDuty();	// 上下班列表
	public List<MakeupOrder> makeupOrderList = Lists.newArrayList();	// 补录交易列表
	
	public ClassReport() {
		super();
	}

	public ClassReport(String id){
		super(id);
	}

	@Length(min=0, max=64, message="所属站长度必须介于 0 和 64 之间")
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
	
	@Length(min=0, max=10, message="班次号            自动生成,规则:yyyymmdd+两位数字,最大到99长度必须介于 0 和 10 之间")
	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
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
	
	public Double getOrderIncomeTotal() {
		return orderIncomeTotal;
	}

	public void setOrderIncomeTotal(Double orderIncomeTotal) {
		this.orderIncomeTotal = orderIncomeTotal;
	}
	
	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}
	
	public Double getTotailPaynum() {
		return totailPaynum;
	}

	public void setTotailPaynum(Double totailPaynum) {
		this.totailPaynum = totailPaynum;
	}
	
	public Double getOrderTotailPaynum() {
		return orderTotailPaynum;
	}

	public void setOrderTotailPaynum(Double orderTotailPaynum) {
		this.orderTotailPaynum = orderTotailPaynum;
	}
	
	public Double getTotailAccount() {
		return totailAccount;
	}

	public void setTotailAccount(Double totailAccount) {
		this.totailAccount = totailAccount;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<GunData> getGunDataList() {
		return gunDataList;
	}

	public void setGunDataList(List<GunData> gunDataList) {
		this.gunDataList = gunDataList;
	}

	public List<PotData> getPotDataList() {
		return potDataList;
	}

	public void setPotDataList(List<PotData> potDataList) {
		this.potDataList = potDataList;
	}

	public List<GoodsData> getGoodsDataList() {
		return goodsDataList;
	}

	public void setGoodsDataList(List<GoodsData> goodsDataList) {
		this.goodsDataList = goodsDataList;
	}

	public List<EmployeeData> getEmployeeDataList() {
		return employeeDataList;
	}

	public void setEmployeeDataList(List<EmployeeData> employeeDataList) {
		this.employeeDataList = employeeDataList;
	}

	public OnoffDuty getOnoffDuty() {
		return onoffDuty;
	}

	public void setOnoffDuty(OnoffDuty onoffDuty) {
		this.onoffDuty = onoffDuty;
	}

	public List<MakeupOrder> getMakeupOrderList() {
		return makeupOrderList;
	}

	public void setMakeupOrderList(List<MakeupOrder> makeupOrderList) {
		this.makeupOrderList = makeupOrderList;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	
	
}