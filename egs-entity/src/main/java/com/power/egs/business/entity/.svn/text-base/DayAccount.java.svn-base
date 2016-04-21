package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import com.power.platform.common.persistence.DataEntity;


/**
 * 上下班Entity
 * @author guojinlong
 * @version 2016-03-21
 */
public class DayAccount extends DataEntity<DayAccount> {
	
	private static final long serialVersionUID = 1L;
	private String stationId;		// 站点ID
	private String stationName;		// 站名称
	private Date accountDate;		// 日结时间
	private Double incomeTotal;		// 总销售金额
	private Double payTotal;		// 总销售量
	private Double crashPaytotal;		// 现金交易金额
	private Double bankcardPaytotal;		// 银行卡交易金额
	private Double iccardPaytotal;		// IC卡交易金额
	private Double onlinePaytotal;		// 在线支付交易金额
	private Double loss;		// 损益
	private Integer status;		// 状态 1.保存 2.提交 3.已结算（对账）
	private String createName;		// 创建名称
	private String createId;		// 创建名称
	
	
	private List<ClassReport> classReportList = Lists.newArrayList();		// 班结列表
	private List<PotDay> potDayList = Lists.newArrayList();		// 日结罐列表
	private List<GoodsDay> goodsDayList = Lists.newArrayList();		// 商品列表
	private List<DayClassReport> dayClassReport = Lists.newArrayList();//班报日结关联表
	
	public DayAccount() {
		super();
	}

	public DayAccount(String id){
		super(id);
	}

	@Length(min=0, max=64, message="站点ID长度必须介于 0 和 64 之间")
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
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	
	public Double getIncomeTotal() {
		return incomeTotal;
	}

	public void setIncomeTotal(Double incomeTotal) {
		this.incomeTotal = incomeTotal;
	}
	
	public Double getPayTotal() {
		return payTotal;
	}

	public void setPayTotal(Double payTotal) {
		this.payTotal = payTotal;
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
	
	public Double getLoss() {
		return loss;
	}

	public void setLoss(Double loss) {
		this.loss = loss;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@Length(min=0, max=32, message="创建名称长度必须介于 0 和 32 之间")
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public List<ClassReport> getClassReportList() {
		return classReportList;
	}

	public void setClassReportList(List<ClassReport> classReportList) {
		this.classReportList = classReportList;
	}

	public List<PotDay> getPotDayList() {
		return potDayList;
	}

	public void setPotDayList(List<PotDay> potDayList) {
		this.potDayList = potDayList;
	}

	public List<GoodsDay> getGoodsDayList() {
		return goodsDayList;
	}

	public void setGoodsDayList(List<GoodsDay> goodsDayList) {
		this.goodsDayList = goodsDayList;
	}

	public List<DayClassReport> getDayClassReport() {
		return dayClassReport;
	}

	public void setDayClassReport(List<DayClassReport> dayClassReport) {
		this.dayClassReport = dayClassReport;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}
	
	
}