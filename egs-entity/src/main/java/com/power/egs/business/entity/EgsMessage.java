package com.power.egs.business.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import com.power.platform.common.config.Global;
import com.power.platform.common.persistence.DataEntity;
import com.power.platform.common.utils.StringUtils;
import com.power.platform.sys.entity.User;


/**
 * 首页消息Entity
 * @author guojinlong
 * @version 2016-01-09
 */
public class EgsMessage extends DataEntity<EgsMessage> {
	
	private static final long serialVersionUID = 1L;
	private User user;		// 发送人
	private String title;		// 标题
	private String action;		// 动作
	private String link;		// 链接
	private String receivedUser;		// 接收人
	private Date operTime;		// 操作时间
	List<EgsMessage> messList = Lists.newArrayList();
	
	private int startNum;//当前页码
	private int pageSize;//一页条数
	
//	临时属性
	private String currUserId;
	
	public EgsMessage() {
		super();
	}

	public EgsMessage(String id){
		super(id);
	}

	@NotNull(message="发送人不能为空")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Length(min=0, max=100, message="标题长度必须介于 0 和 100 之间")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Length(min=0, max=100, message="动作长度必须介于 0 和 100 之间")
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	@Length(min=0, max=200, message="链接长度必须介于 0 和 200 之间")
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	@Length(min=0, max=500, message="接收人长度必须介于 0 和 500 之间")
	public String getReceivedUser() {
		return receivedUser;
	}

	public void setReceivedUser(String receivedUser) {
		this.receivedUser = receivedUser;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	public String getCurrUserId() {
		return currUserId;
	}

	public void setCurrUserId(String currUserId) {
		this.currUserId = currUserId;
	}

	public List<EgsMessage> getMessList() {
		return messList;
	}

	public void setMessList(List<EgsMessage> messList) {
		this.messList = messList;
	}


	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getPageSize() {
		String pageSizeStr = Global.getConfig("loadmore.page.pageSize");
		if(StringUtils.isNotBlank(pageSizeStr)){
			pageSize = Integer.parseInt(pageSizeStr);
		}
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	
}