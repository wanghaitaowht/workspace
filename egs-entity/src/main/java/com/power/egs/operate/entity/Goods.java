/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.power.egs.operate.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;
import com.power.platform.sys.entity.Dict;

/**
 * 站点信息Entity
 * @author wulp
 * @version 2016-01-11
 */
public class Goods extends DataEntity<Goods> {
	
	private static final long serialVersionUID = 1L;
	private StationInfo station;		// 所属站 父类
	private String type;		// 所属类型
	private String code;		// 商品编码
	private String name;		// 商品名称
	private String unit;		// 标准单位
	private Double price;		// 价格
	private String dictId;
	private Double costPrice;//成本价
	
	
	private EgsGoodInfo goodInfo;//商品关联
	
	public EgsGoodInfo getGoodInfo() {
		return goodInfo;
	}

	public void setGoodInfo(EgsGoodInfo goodInfo) {
		this.goodInfo = goodInfo;
	}

	public Goods() {
		super();
	}

	public Goods(String id){
		super(id);
	}

	public Goods(StationInfo station){
		this.station = station;
	}

	@Length(min=0, max=64, message="所属站长度必须介于 0 和 64 之间")
	public StationInfo getStation() {
		return station;
	}

	public void setStation(StationInfo station) {
		this.station = station;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDictId() {
		return dictId;
	}

	public void setDictId(String dictId) {
		this.dictId = dictId;
	}

	@Length(min=0, max=15, message="商品编码长度必须介于 0 和 15 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=0, max=32, message="商品名称长度必须介于 0 和 32 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=10, message="标准单位长度必须介于 0 和 10 之间")
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	
	
}