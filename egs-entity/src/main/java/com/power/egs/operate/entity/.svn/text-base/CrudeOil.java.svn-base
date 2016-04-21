package com.power.egs.operate.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.power.platform.common.persistence.DataEntity;

public class CrudeOil extends DataEntity<CrudeOil>{
	private static final long serialVersionUID = 1L;
	
	private Double oilPrice;   //油价
	private Double rise;       //涨幅
	private Date quotationDate;  //行情日期
	private String type;  		//类型
	
	public CrudeOil() {
		super();
	}

	public CrudeOil(String id){
		super(id);
	}

	public Double getOilPrice() {
		return oilPrice;
	}

	public void setOilPrice(Double oilPrice) {
		this.oilPrice = oilPrice;
	}

	public Double getRise() {
		return rise;
	}

	public void setRise(Double rise) {
		this.rise = rise;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(Date quotationDate) {
		this.quotationDate = quotationDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
