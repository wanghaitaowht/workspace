package com.power.egs.business.voentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 本周统计定义
 * @author haitao
 *
 */
public class WeekEntity implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String dateofweek; //星期几
	String datetime;  //日期 2016-3-10
	String totalvolume; //总升数

	List<Map<String,String>> oillist=new ArrayList<Map<String,String>>();  //map的key是油品名称，value是油升数
	public String getDateofweek() {
		return dateofweek;
	}
	public List<Map<String, String>> getOillist() {
		return oillist;
	}
	public void setOillist(List<Map<String, String>> oillist) {
		this.oillist = oillist;
	}
	public void setDateofweek(String dateofweek) {
		this.dateofweek = dateofweek;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getTotalvolume() {
		return totalvolume;
	}
	public void setTotalvolume(String totalvolume) {
		this.totalvolume = totalvolume;
	}
	
}
