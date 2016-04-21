package com.power.egs.operate.entity;



import java.util.Date;

import com.power.platform.common.persistence.DataEntity;
import com.power.platform.sys.entity.Office;


/**
 * 积分规则表
 * @author sunjunhui
 * @version 2016-03-16
 */
public class ImsIntegralSet extends DataEntity<ImsIntegralSet> {
	
	private static final long serialVersionUID = 1L;
	private String code;		// 编码
	private Office appId;		// 公众号id
	private String content;		// 内容
	private String type;		// type (1表示增加  0表示减少)
	private Date endDate;		// 截止日期
	private Integer num;		// 积分数量
	private String cycle;		// 周期 (1表示1天一次  2表示无限制  3表示一次性)
	private Float unit;		// 系数
	
	private String businessDecription;//业务描述
	
	public ImsIntegralSet() {
		super();
	}

	public ImsIntegralSet(String id){
		super(id);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	public Office getAppId() {
		return appId;
	}

	public void setAppId(Office appId) {
		this.appId = appId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Float getUnit() {
		return unit;
	}

	public void setUnit(Float unit) {
		this.unit = unit;
	}

	public String getBusinessDecription() {
		return businessDecription;
	}

	public void setBusinessDecription(String businessDecription) {
		this.businessDecription = businessDecription;
	}
	
	
}