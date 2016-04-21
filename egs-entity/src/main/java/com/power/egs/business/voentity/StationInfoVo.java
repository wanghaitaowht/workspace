package com.power.egs.business.voentity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.power.egs.operate.entity.GunInfo;
import com.power.egs.operate.voentity.StationEquipment;

/**
 * 口袋付工作台
 */
public class StationInfoVo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public String stationName; //站名称
    public String classNo;  //班次号
    public String stationId;
    public String userName; //用户姓名
    public String userId;  //用户id
	public String isPayOrNot; //点击支付方式，查看上下班表，如果有未下班的，可以支付，否则不可以支付
    public String money;  //输入金额
    List<StationEquipment> stationequiplist=new ArrayList<StationEquipment>();  //根据站id获得的枪和对应的商品
    
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<StationEquipment> getStationequiplist() {
		return stationequiplist;
	}
	public void setStationequiplist(List<StationEquipment> stationequiplist) {
		this.stationequiplist = stationequiplist;
	}
	public String getStationName() {
		return stationName;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIsPayOrNot() {
		return isPayOrNot;
	}
	public void setIsPayOrNot(String isPayOrNot) {
		this.isPayOrNot = isPayOrNot;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
    
    
}