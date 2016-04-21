package com.power.egs.operate.entity;


import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 商品类型表
 * @author sunjunhui
 * @version 2016-03-01
 */
public class EgsGoodType extends DataEntity<EgsGoodType> {
	
	private static final long serialVersionUID = 1L;
	private String type;		// 类型
	
	public EgsGoodType() {
		super();
	}

	public EgsGoodType(String id){
		super(id);
	}

	@Length(min=0, max=11, message="类型长度必须介于 0 和 11 之间")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}