package com.power.egs.operate.entity;


import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 单表生成Entity
 * @author sunjunhui
 * @version 2016-03-01
 */
public class EgsGoodInfo extends DataEntity<EgsGoodInfo> {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String code;		// code
	private EgsGoodType type;		// type
	private String unit;		// unit
	private String costPrice;		// cost_price
	
	public EgsGoodInfo() {
		super();
	}

	public EgsGoodInfo(String id){
		super(id);
	}

	@Length(min=0, max=15, message="code长度必须介于 0 和 15 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EgsGoodType getType() {
		return type;
	}

	public void setType(EgsGoodType type) {
		this.type = type;
	}

	@Length(min=0, max=255, message="unit长度必须介于 0 和 255 之间")
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	
}