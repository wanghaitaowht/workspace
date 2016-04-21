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
public class PotInfo extends DataEntity<PotInfo> {
	
	private static final long serialVersionUID = 1L;
	private StationInfo station;		// 所属站 父类
	private Integer potNo;		// 罐号
	private Dict type;		// 罐类型
	private String goodsCode;		// 商品编码
	private Double initStorage;		// 初始实存
	private Double initAccount;		// 初始帐存
	private Double storage;			//帐存
	private Double account;			//实存
	
	
	private Double nowStorage;//现在实存
	private Double nowAccount;//现在帐存
	private Goods goods;//商品
	private String dictId;
	public PotInfo() {
		super();
	}

	public PotInfo(String id){
		super(id);
	}

	public PotInfo(StationInfo station){
		this.station = station;
	}

	@Length(min=0, max=64, message="所属站长度必须介于 0 和 64 之间")
	public StationInfo getStation() {
		return station;
	}

	public void setStation(StationInfo station) {
		this.station = station;
	}
	
	public Integer getPotNo() {
		return potNo;
	}

	public void setPotNo(Integer potNo) {
		this.potNo = potNo;
	}
	

	
	public Dict getType() {
		return type;
	}

	public void setType(Dict type) {
		this.type = type;
	}

	
	
	

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public Double getInitStorage() {
		return initStorage;
	}

	public void setInitStorage(Double initStorage) {
		this.initStorage = initStorage;
	}
	
	public Double getInitAccount() {
		return initAccount;
	}

	public void setInitAccount(Double initAccount) {
		this.initAccount = initAccount;
	}

	public Double getStorage() {
		return storage;
	}

	public void setStorage(Double storage) {
		this.storage = storage;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getDictId() {
		return dictId;
	}

	public void setDictId(String dictId) {
		this.dictId = dictId;
	}

	public Double getNowStorage() {
		return nowStorage;
	}

	public void setNowStorage(Double nowStorage) {
		this.nowStorage = nowStorage;
	}

	public Double getNowAccount() {
		return nowAccount;
	}

	public void setNowAccount(Double nowAccount) {
		this.nowAccount = nowAccount;
	}
	
	
	
}