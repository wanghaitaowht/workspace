package com.power.egs.business.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.power.platform.common.persistence.DataEntity;


/**
 * 订单数据详细Entity
 * @author wanghaitao
 * @version 2016-03-19
 */
public class EgsOrderInfo extends DataEntity<EgsOrderInfo> {
	
	private static final long serialVersionUID = 1L;
	private String orderNo;		// 订单号
	private String subject;		// 订单主题
	private String stationId;		// 站ID
	private String stationName;		// 站名称（简称）
	private String sellerDeviceId;		// 设备编号
	private int potNo;		// 罐号
	private int gunNo;		// 逻辑枪号
	private String goodsCode;		// 油品编号
	private String goodsName;		// 油品名称
	private String payGateway;		// 支付网关(ALIPAY_OVERSEAS 阿里海外;UNIONPAY_OVERSEAS 银联海外;UPOP 银联在线;ALIPAY_MOBILE 阿里手机支付;UNION_MOBILE 银联手机支付;WXPAY_MOBILE 徽信手机支付;WXPAY_SCAN_M2 微信扫码支付模式2;CASH_PAY 现金支付;MEMBER_CARD 卡支付)
	private String payNo;		// 支付号
	private String payWay;		// 0：在线支付 1：现金 2：银行卡支付 3：IC卡支付
	private String buyerId;		// 买家ID
	private String sellerId;		// 加油员工ID
	private String sellerName;		// 加油员工名称
	private String payStatus;		// 0：待支付 1：确认支付 2：支付成功 3：支付失败
	private String orderStatus;		// NEW:新订单UNPAID：待付款PAID：已付款 ASSESSED：已评价 CANCELED：已取消
	private String classNo;		// 班次号
	private Double totalFee;		// 订单金额
	private Double factFee;		// 实际付款金额
	private Double price;		// 单价
	private Double salesVolume;		// 销售量
	private String couponList;		// 优惠券列表
	private String couponFee;		// 优惠券金额
	private int points;		// 消费积分
	private Double pointsFee;		// 消费积分金额
	private String cancelReason;		// 取消原因
	private String assessContent;		// 评价内容
	private Double level;		// 订单评级
	private boolean isInvoice;		// 是否开发票
	private String modifyReason;		// 修改原因
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间
	private Date payCompleteTime;		// 支付完成时间
	
	public EgsOrderInfo() {
		super();
	}

	public EgsOrderInfo(String id){
		super(id);
	}

	@Length(min=0, max=32, message="订单号长度必须介于 0 和 32 之间")
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	@Length(min=0, max=100, message="订单主题长度必须介于 0 和 100 之间")
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Length(min=0, max=64, message="站ID长度必须介于 0 和 64 之间")
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	
	@Length(min=0, max=50, message="站名称（简称）长度必须介于 0 和 50 之间")
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	@Length(min=0, max=64, message="设备编号长度必须介于 0 和 64 之间")
	public String getSellerDeviceId() {
		return sellerDeviceId;
	}

	public void setSellerDeviceId(String sellerDeviceId) {
		this.sellerDeviceId = sellerDeviceId;
	}
	
	@Length(min=0, max=11, message="罐号长度必须介于 0 和 11 之间")
	public int getPotNo() {
		return potNo;
	}

	public void setPotNo(int potNo) {
		this.potNo = potNo;
	}
	
	@Length(min=0, max=11, message="逻辑枪号长度必须介于 0 和 11 之间")
	public int getGunNo() {
		return gunNo;
	}

	public void setGunNo(int gunNo) {
		this.gunNo = gunNo;
	}
	
	@Length(min=0, max=15, message="油品编号长度必须介于 0 和 15 之间")
	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	
	@Length(min=0, max=32, message="油品名称长度必须介于 0 和 32 之间")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	@Length(min=0, max=20, message="支付网关(ALIPAY_OVERSEAS 阿里海外;UNIONPAY_OVERSEAS 银联海外;UPOP 银联在线;ALIPAY_MOBILE 阿里手机支付;UNION_MOBILE 银联手机支付;WXPAY_MOBILE 徽信手机支付;WXPAY_SCAN_M2 微信扫码支付模式2;CASH_PAY 现金支付;MEMBER_CARD 卡支付)长度必须介于 0 和 20 之间")
	public String getPayGateway() {
		return payGateway;
	}

	public void setPayGateway(String payGateway) {
		this.payGateway = payGateway;
	}
	
	@Length(min=0, max=50, message="支付号长度必须介于 0 和 50 之间")
	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	@Length(min=0, max=1, message="0：在线支付 1：现金 2：银行卡支付 3：IC卡支付长度必须介于 0 和 1 之间")
	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	
	@Length(min=0, max=64, message="买家ID长度必须介于 0 和 64 之间")
	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	
	@Length(min=0, max=64, message="加油员工ID长度必须介于 0 和 64 之间")
	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	@Length(min=0, max=32, message="加油员工名称长度必须介于 0 和 32 之间")
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	@Length(min=0, max=1, message="0：待支付 1：确认支付 2：支付成功 3：支付失败长度必须介于 0 和 1 之间")
	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	
	@Length(min=0, max=10, message="NEW:新订单UNPAID：待付款PAID：已付款 ASSESSED：已评价 CANCELED：已取消长度必须介于 0 和 10 之间")
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	@Length(min=0, max=10, message="班次号长度必须介于 0 和 10 之间")
	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	
	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	
	public Double getFactFee() {
		return factFee;
	}

	public void setFactFee(Double factFee) {
		this.factFee = factFee;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(Double salesVolume) {
		this.salesVolume = salesVolume;
	}
	
	@Length(min=0, max=300, message="优惠券列表长度必须介于 0 和 300 之间")
	public String getCouponList() {
		return couponList;
	}

	public void setCouponList(String couponList) {
		this.couponList = couponList;
	}
	
	public String getCouponFee() {
		return couponFee;
	}

	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}
	
	@Length(min=0, max=11, message="消费积分长度必须介于 0 和 11 之间")
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public Double getPointsFee() {
		return pointsFee;
	}

	public void setPointsFee(Double pointsFee) {
		this.pointsFee = pointsFee;
	}
	
	@Length(min=0, max=50, message="取消原因长度必须介于 0 和 50 之间")
	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	
	@Length(min=0, max=100, message="评价内容长度必须介于 0 和 100 之间")
	public String getAssessContent() {
		return assessContent;
	}

	public void setAssessContent(String assessContent) {
		this.assessContent = assessContent;
	}
	
	public Double getLevel() {
		return level;
	}

	public void setLevel(Double level) {
		this.level = level;
	}
	
	@Length(min=0, max=1, message="是否开发票长度必须介于 0 和 1 之间")
	public boolean getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(boolean isInvoice) {
		this.isInvoice = isInvoice;
	}
	
	@Length(min=0, max=50, message="修改原因长度必须介于 0 和 50 之间")
	public String getModifyReason() {
		return modifyReason;
	}

	public void setModifyReason(String modifyReason) {
		this.modifyReason = modifyReason;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPayCompleteTime() {
		return payCompleteTime;
	}

	public void setPayCompleteTime(Date payCompleteTime) {
		this.payCompleteTime = payCompleteTime;
	}
	
}