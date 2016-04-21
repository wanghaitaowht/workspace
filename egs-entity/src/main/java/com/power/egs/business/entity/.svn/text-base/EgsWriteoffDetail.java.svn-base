package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 冲销数据详细Entity
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsWriteoffDetail extends DataEntity<EgsWriteoffDetail> {
	
	private static final long serialVersionUID = 1L;
	private String writeoffId;		// 冲销ID
	private String potId;		// 罐号
	private String goodsCode;		// 商品编号
	private String goodsName;		// 商品名称
	private String writeAmount;		// 冲销量
	
	public EgsWriteoffDetail() {
		super();
	}

	public EgsWriteoffDetail(String id){
		super(id);
	}

	@Length(min=0, max=64, message="冲销ID长度必须介于 0 和 64 之间")
	public String getWriteoffId() {
		return writeoffId;
	}

	public void setWriteoffId(String writeoffId) {
		this.writeoffId = writeoffId;
	}
	
	@Length(min=0, max=11, message="罐号长度必须介于 0 和 11 之间")
	public String getPotId() {
		return potId;
	}

	public void setPotId(String potId) {
		this.potId = potId;
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
	
	public String getWriteAmount() {
		return writeAmount;
	}

	public void setWriteAmount(String writeAmount) {
		this.writeAmount = writeAmount;
	}
	
}