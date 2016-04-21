package com.power.egs.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;
/**
 * 上下班Entity
 * @author guojinlong
 * @version 2016-04-07
 */
public class Changeprice extends DataEntity<Changeprice> {
	
	private static final long serialVersionUID = 1L;
	private Date viliableTime;		// 生效时间
	private String status;		// 状态说明【0：未执行；1：已执行；2：执行失败再执行；3：执行异常】
	private String topCompanyId;

	List<ChangepriceStation> changepriceStation;
	
	public Changeprice() {
		super();
	}

	public Changeprice(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getViliableTime() {
		return viliableTime;
	}

	public void setViliableTime(Date viliableTime) {
		this.viliableTime = viliableTime;
	}
	
	@Length(min=0, max=1, message="状态说明【0：未执行；1：已执行；2：执行失败再执行；3：执行异常】长度必须介于 0 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<ChangepriceStation> getChangepriceStation() {
		if(changepriceStation ==null){
			changepriceStation = new ArrayList<ChangepriceStation>();
		}
		return changepriceStation;
	}

	public void setChangepriceStation(List<ChangepriceStation> changepriceStation) {
		this.changepriceStation = changepriceStation;
	}

	public String getTopCompanyId() {
		return topCompanyId;
	}

	public void setTopCompanyId(String topCompanyId) {
		this.topCompanyId = topCompanyId;
	}
	
}