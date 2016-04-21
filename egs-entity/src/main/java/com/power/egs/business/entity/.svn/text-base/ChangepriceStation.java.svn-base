package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * @author guojinlong
 * @version 2016-04-07
 */
public class ChangepriceStation extends DataEntity<ChangepriceStation> {
	
	private static final long serialVersionUID = 1L;
	private String changepriceId;		// 变价编号
	private String stationId;		// 站编号
	private String stationName;		// 站名称
	private String companyId;		// 分公司编号
	private String companyName;		// 分公司名称
	private String goodsCode;		// 商品编号
	private String goodsName;		// 商品名称
	private Double beforePrice;		// 变价前价格
	private Double afterPrice;		// 变价后价格
	private String type;		// 所属类型
	
	public ChangepriceStation() {
		super();
	}

	public ChangepriceStation(String id){
		super(id);
	}

	@Length(min=0, max=64, message="变价编号长度必须介于 0 和 64 之间")
	public String getChangepriceId() {
		return changepriceId;
	}

	public void setChangepriceId(String changepriceId) {
		this.changepriceId = changepriceId;
	}
	
	@Length(min=0, max=64, message="站编号长度必须介于 0 和 64 之间")
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	
	@Length(min=0, max=32, message="站名称长度必须介于 0 和 32 之间")
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	@Length(min=0, max=64, message="分公司编号长度必须介于 0 和 64 之间")
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	@Length(min=0, max=32, message="分公司名称长度必须介于 0 和 32 之间")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	
	public Double getBeforePrice() {
		return beforePrice;
	}

	public void setBeforePrice(Double beforePrice) {
		this.beforePrice = beforePrice;
	}
	
	public Double getAfterPrice() {
		return afterPrice;
	}

	public void setAfterPrice(Double afterPrice) {
		this.afterPrice = afterPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}