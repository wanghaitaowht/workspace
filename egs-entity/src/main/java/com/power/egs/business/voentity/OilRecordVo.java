package com.power.egs.business.voentity;


import java.io.Serializable;

/**
 * 加油记录
 */
public class OilRecordVo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public String gunNo;
    public String goodsName;
    public String saleMoney;
    public String payWay;
    public String datetime;
    
	public String getGunNo() {
		return gunNo;
	}
	public void setGunNo(String gunNo) {
		this.gunNo = gunNo;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getSaleMoney() {
		return saleMoney;
	}
	public void setSaleMoney(String saleMoney) {
		this.saleMoney = saleMoney;
	}
	public String getPayWay() {
		return payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

    
}