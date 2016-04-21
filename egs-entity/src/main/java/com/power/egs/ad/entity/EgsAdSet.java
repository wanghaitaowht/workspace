package com.power.egs.ad.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;
import com.power.platform.sys.entity.Office;


/**
 * 广告位设置Entity
 * @author hanhao
 * @version 2016-04-11
 */
public class EgsAdSet extends DataEntity<EgsAdSet> {
	
	private static final long serialVersionUID = 1L;
	private String title;		// 标题
	private String content;		// 广告文章内容
	private String contentPictureName;		// 内容图片名
	private String thumbnail;		// 广告位缩略图
	private Office office;		// 组织id
	
	public EgsAdSet() {
		super();
	}

	public EgsAdSet(String id){
		super(id);
	}

	@Length(min=0, max=255, message="标题长度必须介于 0 和 255 之间")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Length(min=0, max=255, message="内容图片名长度必须介于 0 和 255 之间")
	public String getContentPictureName() {
		return contentPictureName;
	}

	public void setContentPictureName(String contentPictureName) {
		this.contentPictureName = contentPictureName;
	}
	
	@Length(min=0, max=255, message="广告位缩略图长度必须介于 0 和 255 之间")
	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
	
}