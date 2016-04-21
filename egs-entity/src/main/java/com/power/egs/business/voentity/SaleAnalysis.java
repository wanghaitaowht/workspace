package com.power.egs.business.voentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SaleAnalysis implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String weekstarttime;
	String weekendtime;
	String monthendtime;
	String monthstarttime;
	List<String> monthoilname=new ArrayList<String>();  //月份统计的所有油品名称
	List<String> weekoilname=new ArrayList<String>();   //周统计所有油品名称
	List<String> yearoilname=new ArrayList<String>(); //年统计所有油品名称
	List<WeekEntity> WeekEntitylist = new ArrayList<WeekEntity>();
	List<MonthEntity> monthEntitylist = new ArrayList<MonthEntity>();
	List<YearEntity> yearEntitylist = new ArrayList<YearEntity>();
	
	public List<String> getYearoilname() {
		return yearoilname;
	}
	public void setYearoilname(List<String> yearoilname) {
		this.yearoilname = yearoilname;
	}
	public List<YearEntity> getYearEntitylist() {
		return yearEntitylist;
	}
	public void setYearEntitylist(List<YearEntity> yearEntitylist) {
		this.yearEntitylist = yearEntitylist;
	}
	public List<WeekEntity> getWeekEntitylist() {
		return WeekEntitylist;
	}
	public void setWeekEntitylist(List<WeekEntity> weekEntitylist) {
		WeekEntitylist = weekEntitylist;
	}
	public List<String> getMonthoilname() {
		return monthoilname;
	}
	public void setMonthoilname(List<String> monthoilname) {
		this.monthoilname = monthoilname;
	}
	public List<MonthEntity> getMonthEntitylist() {
		return monthEntitylist;
	}
	public void setMonthEntitylist(List<MonthEntity> monthEntitylist) {
		this.monthEntitylist = monthEntitylist;
	}
	public String getMonthstarttime() {
		return monthstarttime;
	}
	public void setMonthstarttime(String monthstarttime) {
		this.monthstarttime = monthstarttime;
	}
	public String getMonthendtime() {
		return monthendtime;
	}
	public void setMonthendtime(String monthendtime) {
		this.monthendtime = monthendtime;
	}
	
	public String getWeekstarttime() {
		return weekstarttime;
	}
	public void setWeekstarttime(String weekstarttime) {
		this.weekstarttime = weekstarttime;
	}
	public String getWeekendtime() {
		return weekendtime;
	}
	public void setWeekendtime(String weekendtime) {
		this.weekendtime = weekendtime;
	}
	public List<String> getWeekoilname() {
		return weekoilname;
	}
	public void setWeekoilname(List<String> weekoilname) {
		this.weekoilname = weekoilname;
	}
	
	
	
}
