package com.power.egs.business.entity;


import com.power.platform.common.persistence.DataEntity;

public class DayAccountReportPotInfo extends DataEntity<DayAccount> {

	private static final long serialVersionUID = 1L;
	private String potNo;		//罐编号
	private String goodsName;	//油品
	private Double preAccount;	//上班账存L
	private Double payLiter;	//本日付油
	private Double special;		//本日非加油机付油
	private Double inStorage;	//本日进油入库
	private Double account;		//本日日结账存
	
	public String getPotNo() {
		return potNo;
	}
	public void setPotNo(String potNo) {
		this.potNo = potNo;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getPreAccount() {
		return preAccount;
	}
	public void setPreAccount(Double preAccount) {
		this.preAccount = preAccount;
	}
	public Double getPayLiter() {
		return payLiter;
	}
	public void setPayLiter(Double payLiter) {
		this.payLiter = payLiter;
	}
	public Double getSpecial() {
		return special;
	}
	public void setSpecial(Double special) {
		this.special = special;
	}
	public Double getIn_storage() {
		return inStorage;
	}
	public void setIn_storage(Double in_storage) {
		this.inStorage = in_storage;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}
	
	
}
