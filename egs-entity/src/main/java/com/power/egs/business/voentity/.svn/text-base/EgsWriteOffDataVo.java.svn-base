package com.power.egs.business.voentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
 * 冲销VO
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsWriteOffDataVo implements Serializable{
	
	public static final long serialVersionUID = 1L;
	public String stationId;		// 所属站
	public String stationName;		// 站名称
	public String userId;   //用户id
	public String reasonWriteOff;  //冲销原因    1或者2或者3 
	public String remarks;  //当冲销原因为其他时，remarks存储补充说明
	public List<PotAndGoodsVo> potandgoods=new ArrayList<PotAndGoodsVo>();
	
	/*------------以下三个字段是入库表用的，上面的字段是冲销表用-----------*/

	public String totalInstock; //总入库量 也是核销的总核销量      核销和入库公用
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReasonWriteOff() {
		return reasonWriteOff;
	}
	public void setReasonWriteOff(String reasonWriteOff) {
		this.reasonWriteOff = reasonWriteOff;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	
	
	public String getTotalInstock() {
		return totalInstock;
	}
	public void setTotalInstock(String totalInstock) {
		this.totalInstock = totalInstock;
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
	public List<PotAndGoodsVo> getPotandgoods() {
		return potandgoods;
	}
	public void setPotandgoods(List<PotAndGoodsVo> potandgoods) {
		this.potandgoods = potandgoods;
	}

	
	
}