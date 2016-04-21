package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 上下班Entity
 * @author guojinlong
 * @version 2016-03-21
 */
public class GoodsDay extends DataEntity<GoodsDay> {
	
	private static final long serialVersionUID = 1L;
	private String dayId;		// 日结ID
	private String goodsCode;		// 油品
	private String goodsName;		// 商品名称
	private Double payLiter;		// 付油量
	private Double orderPayliter;		// 订单付油量
	private Double prodTotailPay;		// 商品付油金额
	private Double orderProdtotailpay;		// 订单商品付油金额
	
	private DayAccount dayAccount;
	
	public GoodsDay() {
		super();
	}

	public GoodsDay(DayAccount dayAccount) {
		this.dayId = dayAccount.getId();
		this.dayAccount = dayAccount;
	}
	
	public GoodsDay(String id){
		super(id);
	}

	@Length(min=0, max=64, message="日结ID长度必须介于 0 和 64 之间")
	public String getDayId() {
		return dayId;
	}

	public void setDayId(String dayId) {
		this.dayId = dayId;
	}
	
	@Length(min=0, max=15, message="油品长度必须介于 0 和 15 之间")
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	
	@Length(min=0, max=32, message="商品名称长度必须介于 0 和 32 之间")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public Double getPayLiter() {
		return payLiter;
	}

	public void setPayLiter(Double payLiter) {
		this.payLiter = payLiter;
	}
	
	public Double getOrderPayliter() {
		return orderPayliter;
	}

	public void setOrderPayliter(Double orderPayliter) {
		this.orderPayliter = orderPayliter;
	}
	
	public Double getProdTotailPay() {
		return prodTotailPay;
	}

	public void setProdTotailPay(Double prodTotailPay) {
		this.prodTotailPay = prodTotailPay;
	}
	
	public Double getOrderProdtotailpay() {
		return orderProdtotailpay;
	}

	public void setOrderProdtotailpay(Double orderProdtotailpay) {
		this.orderProdtotailpay = orderProdtotailpay;
	}

	public DayAccount getDayAccount() {
		return dayAccount;
	}

	public void setDayAccount(DayAccount dayAccount) {
		this.dayAccount = dayAccount;
	}
	
}