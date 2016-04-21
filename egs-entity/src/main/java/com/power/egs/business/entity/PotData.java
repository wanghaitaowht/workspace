package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;

/**
 * 上下班Entity
 * 
 * @author guojinlong
 * @version 2016-03-11
 */
public class PotData extends DataEntity<PotData> {

	private static final long serialVersionUID = 1L;
	private String classId; // 班报ID
	private Integer potNo; // 罐号
	private String goodsName; // 油品名称
	private Double preAccount; // 上班账存
	private Double inStorage; // 本班入库
	private Double outStorage; // 本班出库
	private Double verificationOilMass; // 核销数量
	private Double account; // 本班结存
	private Double realStock; // 实际库存
	private Double loss; // 损耗

	private ClassReport classReport;

	public PotData(ClassReport classReport) {
		this.classId = classReport.getId();
		this.classReport = classReport;
	}

	public ClassReport getClassReport() {
		return classReport;
	}

	public void setClassReport(ClassReport classReport) {
		this.classReport = classReport;
	}

	public PotData() {
		super();
	}

	public PotData(String id) {
		super(id);
	}

	@Length(min = 0, max = 64, message = "班报ID长度必须介于 0 和 64 之间")
	public String getClassIdId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Integer getPotNo() {
		return potNo;
	}

	public void setPotNo(Integer potNo) {
		this.potNo = potNo;
	}

	@Length(min = 0, max = 32, message = "油品名称长度必须介于 0 和 32 之间")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Double getPreAccount() {
		return preAccount;
	}

	public void setPreAccount(Double preAccount) {
		this.preAccount = preAccount;
	}

	public Double getInStorage() {
		return inStorage;
	}

	public void setInStorage(Double inStorage) {
		this.inStorage = inStorage;
	}

	public Double getOutStorage() {
		return outStorage;
	}

	public void setOutStorage(Double outStorage) {
		this.outStorage = outStorage;
	}

	public Double getVerificationOilMass() {
		return verificationOilMass;
	}

	public void setVerificationOilMass(Double verificationOilMass) {
		this.verificationOilMass = verificationOilMass;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public Double getRealStock() {
		return realStock;
	}

	public void setRealStock(Double realStock) {
		this.realStock = realStock;
	}

	public Double getLoss() {
		return loss;
	}

	public void setLoss(Double loss) {
		this.loss = loss;
	}

}