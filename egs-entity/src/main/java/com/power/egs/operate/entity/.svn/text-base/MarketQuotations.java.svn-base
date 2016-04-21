package com.power.egs.operate.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.power.platform.common.persistence.DataEntity;

public class MarketQuotations extends DataEntity<MarketQuotations>{
	private static final long serialVersionUID = 1L;
	
	private Date nextPriceDate; //下次调价时间
	private Double nextPriceRise; ////下次调价涨幅
	
	public MarketQuotations() {
		super();
	}

	public MarketQuotations(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getNextPriceDate() {
		return nextPriceDate;
	}

	public void setNextPriceDate(Date nextPriceDate) {
		this.nextPriceDate = nextPriceDate;
	}

	public Double getNextPriceRise() {
		return nextPriceRise;
	}

	public void setNextPriceRise(Double nextPriceRise) {
		this.nextPriceRise = nextPriceRise;
	}

	
	
}
