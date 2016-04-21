/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.power.egs.business.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import com.power.egs.operate.entity.StationInfo;
import com.power.platform.common.persistence.DataEntity;

/**
 * 月盘点Entity
 * @author wulp
 * @version 2016-01-11
 */
public class MonthAccount extends DataEntity<MonthAccount> {
	
	private static final long serialVersionUID = 1L;
	private StationInfo station;		// 站点ID
	private String month;		// 月份
	private Date startDate;		// 开始时间            上一次月盘点结束时间
	private Date endDate;		// 结束时间
	private Double preStock;		// 上月总存量
	private Double sellOut;		// 本月出库
	private Double stock;		// 本月存量
	private Double loss;		// 损耗
	private String lossRat;		// 损耗率
	private Integer status;		// 状态            1.保存            2.提交
	private List<MonthDetail> monthDetailList = Lists.newArrayList();		// 子表列表
	
	
	private String createName; //创建人姓名

	private String updateName; //更新人姓名
	
	
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public MonthAccount() {
		super();
	}

	public MonthAccount(String id){
		super(id);
	}

	@Length(min=0, max=64, message="站点ID长度必须介于 0 和 64 之间")
	public StationInfo getStation() {
		return station;
	}


	public void setStation(StationInfo station) {
		this.station = station;
	}
	
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Double getPreStock() {
		return preStock;
	}

	public void setPreStock(Double preStock) {
		this.preStock = preStock;
	}
	
	public Double getSellOut() {
		return sellOut;
	}

	public void setSellOut(Double sellOut) {
		this.sellOut = sellOut;
	}
	
	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}
	
	public Double getLoss() {
		return loss;
	}

	public void setLoss(Double loss) {
		this.loss = loss;
	}
	

	
	public String getLossRat() {
		return lossRat;
	}

	public void setLossRat(String lossRat) {
		this.lossRat = lossRat;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public List<MonthDetail> getMonthDetailList() {
		return monthDetailList;
	}

	public void setMonthDetailList(List<MonthDetail> monthDetailList) {
		this.monthDetailList = monthDetailList;
	}
}