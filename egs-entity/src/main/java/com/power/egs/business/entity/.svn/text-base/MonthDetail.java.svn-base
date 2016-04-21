/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 月盘点明细Entity
 * @author wulp
 * @version 2016-01-11
 */
public class MonthDetail extends DataEntity<MonthDetail> {
	
	private static final long serialVersionUID = 1L;
	private MonthAccount monthAccount;		// month_account_id 父类
	private String goodsCode;		// 油品
	private Double preStock;		// 上期帐存
	private Double inStorage;		// 本期入库
	private Double oilingPay;		// 加油机付出
	private Double special;		// 非加油机付出
	private Double cancelLoss;		// 核销损耗
	private Double adjust;		// 调节
	private Double stock;		// 本期结存
	private Double realStorage;		// 实际盘点数量
	private Double loss;		// 损耗
	private String lossRat;		// 损耗率
	
	private String goodName;  //商品名称
	
	
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public MonthDetail() {
		super();
	}

	public MonthDetail(String id){
		super(id);
	}

	public MonthDetail(MonthAccount monthAccount){
		this.monthAccount = monthAccount;
	}

	@Length(min=0, max=64, message="month_account_id长度必须介于 0 和 64 之间")
	public MonthAccount getMonthAccount() {
		return monthAccount;
	}

	public void setMonthAccount(MonthAccount monthAccount) {
		this.monthAccount = monthAccount;
	}
	
	
	public Double getPreStock() {
		return preStock;
	}

	public void setPreStock(Double preStock) {
		this.preStock = preStock;
	}
	
	public Double getInStorage() {
		return inStorage;
	}

	public void setInStorage(Double inStorage) {
		this.inStorage = inStorage;
	}
	
	public Double getOilingPay() {
		return oilingPay;
	}

	public void setOilingPay(Double oilingPay) {
		this.oilingPay = oilingPay;
	}
	
	public Double getSpecial() {
		return special;
	}

	public void setSpecial(Double special) {
		this.special = special;
	}
	
	public Double getCancelLoss() {
		return cancelLoss;
	}

	public void setCancelLoss(Double cancelLoss) {
		this.cancelLoss = cancelLoss;
	}
	
	public Double getAdjust() {
		return adjust;
	}

	public void setAdjust(Double adjust) {
		this.adjust = adjust;
	}
	
	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}
	
	public Double getRealStorage() {
		return realStorage;
	}

	public void setRealStorage(Double realStorage) {
		this.realStorage = realStorage;
	}
	
	public Double getLoss() {
		return loss;
	}

	public void setLoss(Double loss) {
		this.loss = loss;
	}

	public String getLossRat() {
		return lossRat;
	}

	public void setLossRat(String lossRat) {
		this.lossRat = lossRat;
	}
	

	
}