/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.power.egs.operate.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 站点信息Entity
 * @author wulp
 * @version 2016-01-11
 */
public class HubInfo extends DataEntity<HubInfo> {
	
	private static final long serialVersionUID = 1L;
	private StationInfo station;		// 所属站 父类
	private Integer hubNo;		// 集线器编号
	private Integer connType;		// 通讯方式            1.串口            2.TCP/IP
	private String serialPort;		// 串口名
	private Integer baudRate;		// 波特率
	private Integer dataBits;		// 数据位长度
	private Integer endBit;		// 停止位数
	private Integer parity;		// 奇偶校验
	private Integer timeout;		// 超时时间,单位毫秒
	private String ip;		// IP
	private Integer port;		// PORT
	private Integer status;		// 状态            1.可用            2.不可用
	
	public HubInfo() {
		super();
	}

	public HubInfo(String id){
		super(id);
	}

	public HubInfo(StationInfo station){
		this.station = station;
	}

	@Length(min=0, max=64, message="所属站长度必须介于 0 和 64 之间")
	public StationInfo getStation() {
		return station;
	}

	public void setStation(StationInfo station) {
		this.station = station;
	}
	
	public Integer getHubNo() {
		return hubNo;
	}

	public void setHubNo(Integer hubNo) {
		this.hubNo = hubNo;
	}
	
	public Integer getConnType() {
		return connType;
	}

	public void setConnType(Integer connType) {
		this.connType = connType;
	}
	
	@Length(min=0, max=10, message="串口名长度必须介于 0 和 10 之间")
	public String getSerialPort() {
		return serialPort;
	}

	public void setSerialPort(String serialPort) {
		this.serialPort = serialPort;
	}
	
	public Integer getBaudRate() {
		return baudRate;
	}

	public void setBaudRate(Integer baudRate) {
		this.baudRate = baudRate;
	}
	
	public Integer getDataBits() {
		return dataBits;
	}

	public void setDataBits(Integer dataBits) {
		this.dataBits = dataBits;
	}
	
	public Integer getEndBit() {
		return endBit;
	}

	public void setEndBit(Integer endBit) {
		this.endBit = endBit;
	}
	
	public Integer getParity() {
		return parity;
	}

	public void setParity(Integer parity) {
		this.parity = parity;
	}
	
	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	
	@Length(min=0, max=36, message="IP长度必须介于 0 和 36 之间")
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}