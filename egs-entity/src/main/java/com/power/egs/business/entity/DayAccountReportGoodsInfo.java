package com.power.egs.business.entity;


import com.power.platform.common.persistence.DataEntity;

public class DayAccountReportGoodsInfo extends DataEntity<DayAccount> {

	private static final long serialVersionUID = 1L;
	private String goodsName; // 油品名称
	private Double pumpTakeNum;//走字总数
	private Double sumPayLister; //付油量合计
	private Double sumProdTotailPay; //付油量合计
	private Double cashPayLiter; //付油量(现金)
	private Double cashProdTotailPay; //付油金额(现金)
	private Double ICPayLiter; //付油量(IC卡)
	private Double ICProdTotailPay; //付油金额(IC卡)
	private Double cardPayLiter; //付油量(银行卡)
	private Double cardProdTotailPay; //付油金额(银行卡)
	private Double otherPayLiter; //付油量(其它)
	private Double otherProdTotailPay; //付油金额(其它)
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getPumpTakeNum() {
		return pumpTakeNum;
	}
	public void setPumpTakeNum(Double pumpTakeNum) {
		this.pumpTakeNum = pumpTakeNum;
	}
	public Double getSumPayLister() {
		return sumPayLister;
	}
	public void setSumPayLister(Double sumPayLister) {
		this.sumPayLister = sumPayLister;
	}
	public Double getSumProdTotailPay() {
		return sumProdTotailPay;
	}
	public void setSumProdTotailPay(Double sumProdTotailPay) {
		this.sumProdTotailPay = sumProdTotailPay;
	}
	public Double getCashPayLiter() {
		return cashPayLiter;
	}
	public void setCashPayLiter(Double cashPayLiter) {
		this.cashPayLiter = cashPayLiter;
	}
	public Double getCashProdTotailPay() {
		return cashProdTotailPay;
	}
	public void setCashProdTotailPay(Double cashProdTotailPay) {
		this.cashProdTotailPay = cashProdTotailPay;
	}
	public Double getICPayLiter() {
		return ICPayLiter;
	}
	public void setICPayLiter(Double iCPayLiter) {
		ICPayLiter = iCPayLiter;
	}
	public Double getICProdTotailPay() {
		return ICProdTotailPay;
	}
	public void setICProdTotailPay(Double iCProdTotailPay) {
		ICProdTotailPay = iCProdTotailPay;
	}
	public Double getCardPayLiter() {
		return cardPayLiter;
	}
	public void setCardPayLiter(Double cardPayLiter) {
		this.cardPayLiter = cardPayLiter;
	}
	public Double getCardProdTotailPay() {
		return cardProdTotailPay;
	}
	public void setCardProdTotailPay(Double cardProdTotailPay) {
		this.cardProdTotailPay = cardProdTotailPay;
	}
	public Double getOtherPayLiter() {
		return otherPayLiter;
	}
	public void setOtherPayLiter(Double otherPayLiter) {
		this.otherPayLiter = otherPayLiter;
	}
	public Double getOtherProdTotailPay() {
		return otherProdTotailPay;
	}
	public void setOtherProdTotailPay(Double otherProdTotailPay) {
		this.otherProdTotailPay = otherProdTotailPay;
	}
	
	
	
}
