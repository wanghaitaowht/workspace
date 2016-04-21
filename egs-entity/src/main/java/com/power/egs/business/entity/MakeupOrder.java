package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * 
 * @author guojinlong
 * @version 2016-03-11
 */
public class MakeupOrder extends DataEntity<MakeupOrder> {

	private static final long serialVersionUID = 1L;
	private String classId; // 班报ID
	private String stationId; // 站ID
	private String stationName; // 站名称
	private Integer gunNo; // 枪号
	private String goodsCode; // 油品编号
	private String goodsName; // 油品名称
	private String payWay; // 支付方式
	private Double amount; // 交易金额
	private Double outStorge; // 付油量

	private ClassReport classReport;

	public MakeupOrder(ClassReport classReport) {
		this.classId = classReport.getId();
		this.classReport = classReport;
	}

	public ClassReport getClassReport() {
		return classReport;
	}

	public void setClassReport(ClassReport classReport) {
		this.classReport = classReport;
	}

	public MakeupOrder() {
		super();
	}

	public MakeupOrder(String id) {
		super(id);
	}

	@Length(min = 0, max = 64, message = "班报ID长度必须介于 0 和 64 之间")
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	@Length(min = 0, max = 64, message = "站ID长度必须介于 0 和 64 之间")
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	@Length(min = 0, max = 32, message = "站名称长度必须介于 0 和 32 之间")
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Integer getGunNo() {
		return gunNo;
	}

	public void setGunNo(Integer gunNo) {
		this.gunNo = gunNo;
	}

	@Length(min = 0, max = 64, message = "油品编号长度必须介于 0 和 64 之间")
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	@Length(min = 0, max = 32, message = "油品名称长度必须介于 0 和 32 之间")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Length(min = 0, max = 1, message = "支付方式长度必须介于 0 和 1 之间")
	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getOutStorge() {
		return outStorge;
	}

	public void setOutStorge(Double outStorge) {
		this.outStorge = outStorge;
	}

}