package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 入库数据详细Entity
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsInstockDetail extends DataEntity<EgsInstockDetail> {
	
	private static final long serialVersionUID = 1L;
	private String instockId;		// 入库ID
	private String potNo;		// 罐号
	private String goodsCode;		// 商品编号
	private String goodsName;		// 商品名称
	private String instockAmount;		// 入库量
	private String costPrice;		// 成本价
	
	public EgsInstockDetail() {
		super();
	}

	public EgsInstockDetail(String id){
		super(id);
	}

	@Length(min=0, max=64, message="入库ID长度必须介于 0 和 64 之间")
	public String getInstockId() {
		return instockId;
	}

	public void setInstockId(String instockId) {
		this.instockId = instockId;
	}
	
	@Length(min=0, max=11, message="罐号长度必须介于 0 和 11 之间")
	public String getPotNo() {
		return potNo;
	}

	public void setPotNo(String potNo) {
		this.potNo = potNo;
	}
	
	@Length(min=0, max=15, message="商品编号长度必须介于 0 和 15 之间")
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
	
	public String getInstockAmount() {
		return instockAmount;
	}

	public void setInstockAmount(String instockAmount) {
		this.instockAmount = instockAmount;
	}
	
	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	
}