package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * 
 * @author guojinlong
 * @version 2016-03-11
 */
public class GunData extends DataEntity<GunData> {

	private static final long serialVersionUID = 1L;
	private String classId; // 班报ID
	private Integer gunNo; // 枪号
	private Integer potNo; // 罐号
	private String goodsCode; // 油品
	private String goodsName; // 商品名称
	private Double offPump; // 上班泵码
	private Double onPump; // 下班泵码
	private Double changePump;
	private Double pumpTakeNum; // 泵码走字数
	private Double payLiter; // 付油升数
	private Double orderPayLiter; // 订单付油升数
	private Double prodTotailPay; // 付油金额
	private Double orderProdTotailPay; // 订单付油金额

	private ClassReport classReport;

	public GunData(ClassReport classReport) {
		this.classId = classReport.getId();
		this.classReport = classReport;
	}

	public ClassReport getClassReport() {
		return classReport;
	}

	public void setClassReport(ClassReport classReport) {
		this.classReport = classReport;
	}

	public GunData() {
		super();
	}

	public GunData(String id) {
		super(id);
	}

	@Length(min = 0, max = 64, message = "班报ID长度必须介于 0 和 64 之间")
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Integer getGunNo() {
		return gunNo;
	}

	public void setGunNo(Integer gunNo) {
		this.gunNo = gunNo;
	}

	public Integer getPotNo() {
		return potNo;
	}

	public void setPotNo(Integer potNo) {
		this.potNo = potNo;
	}

	@Length(min = 0, max = 15, message = "油品长度必须介于 0 和 15 之间")
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	@Length(min = 0, max = 32, message = "商品名称长度必须介于 0 和 32 之间")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Double getOffPump() {
		return offPump;
	}

	public void setOffPump(Double offPump) {
		this.offPump = offPump;
	}

	public Double getOnPump() {
		return onPump;
	}

	public void setOnPump(Double onPump) {
		this.onPump = onPump;
	}

	public Double getPumpTakeNum() {
		return pumpTakeNum;
	}

	public void setPumpTakeNum(Double pumpTakeNum) {
		this.pumpTakeNum = pumpTakeNum;
	}

	public Double getPayLiter() {
		return payLiter;
	}

	public void setPayLiter(Double payLiter) {
		this.payLiter = payLiter;
	}

	public Double getOrderPayLiter() {
		return orderPayLiter;
	}

	public void setOrderPayLiter(Double orderPayLiter) {
		this.orderPayLiter = orderPayLiter;
	}

	public Double getProdTotailPay() {
		return prodTotailPay;
	}

	public void setProdTotailPay(Double prodTotailPay) {
		this.prodTotailPay = prodTotailPay;
	}

	public Double getOrderProdTotailPay() {
		return orderProdTotailPay;
	}

	public void setOrderProdTotailPay(Double orderProdTotailPay) {
		this.orderProdTotailPay = orderProdTotailPay;
	}

	public Double getChangePump() {
		return changePump;
	}

	public void setChangePump(Double changePump) {
		this.changePump = changePump;
	}

}