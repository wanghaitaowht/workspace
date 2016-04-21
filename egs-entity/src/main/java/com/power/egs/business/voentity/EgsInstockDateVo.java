package com.power.egs.business.voentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.power.egs.business.entity.EgsInstockDetail;

/**
 * 入库VO
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsInstockDateVo implements Serializable{
	
	public static final long serialVersionUID = 1L;
	public String stationId;		// 所属站
	public String stationName;		// 站名称
	public List<EgsInstockDetail> egsInstockllist=new ArrayList<EgsInstockDetail>();
	public String totalInstock;  //总冲销量
	public String userName;  //用户名称
	public String instockId;
	public Date createDate;
	public String remarks;
	public String createBy;	// 创建者
	

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public List<EgsInstockDetail> getEgsInstockllist() {
		return egsInstockllist;
	}
	public void setEgsInstockllist(List<EgsInstockDetail> egsInstockllist) {
		this.egsInstockllist = egsInstockllist;
	}
	public String getTotalInstock() {
		return totalInstock;
	}
	public void setTotalInstock(String totalInstock) {
		this.totalInstock = totalInstock;
	}
	public String getInstockId() {
		return instockId;
	}
	public void setInstockId(String instockId) {
		this.instockId = instockId;
	}
	public String getRemarks() {
		return remarks;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	
	
}