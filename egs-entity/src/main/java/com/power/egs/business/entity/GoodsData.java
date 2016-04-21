package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * 
 * @author guojinlong
 * @version 2016-03-11
 */
public class GoodsData extends DataEntity<GoodsData> {

	private static final long serialVersionUID = 1L;
	private String classId; // 班报ID
	private String goodsCode; // 油品
	private String goodsName; // 商品名称
	private Double price; // 价格
	private Double payLiter; // 付油量
	private Double orderPayliter; // 订单付油量
	private Double account; // 帐存
	private Double prodTotailPay; // 商品付油金额
	private Double orderProdtotailpay; // 订单商品付油金额

	private ClassReport classReport;

	public GoodsData(ClassReport classReport) {
		this.classId = classReport.getId();
		this.classReport = classReport;
	}

	public ClassReport getClassReport() {
		return classReport;
	}

	public void setClassReport(ClassReport classReport) {
		this.classReport = classReport;
	}

	public GoodsData() {
		super();
	}

	public GoodsData(String id) {
		super(id);
	}

	@Length(min = 0, max = 64, message = "班报ID长度必须介于 0 和 64 之间")
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
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

}