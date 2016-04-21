package com.power.egs.business.entity;

import org.hibernate.validator.constraints.Length;

import com.power.platform.common.persistence.DataEntity;


/**
 * 月盘点-油罐数据Entity
 * @author wanghaitao
 * @version 2016-04-05
 */
public class EgsPotMonth extends DataEntity<EgsPotMonth> {
	
	private static final long serialVersionUID = 1L;
	private String monthId;		// 月盘点ID
	private Integer potNo;		// 罐号
	private String goodsCode;		// 油品编号
	private String goodsName;		// 油品名称
	private Double preAccount;		// 上日账存
	private Double inStorage;		// 本日入库
	private Double outStorage;		// 本日出库
	private Double verificationOilMass;		// 核销数量
	private Double adjustStorage;		// 调节数量
	private Double account;		// 本日结存
	private Double realStock;		// 实际库存
	private Double loss;		// 损耗
	private String lossRat;		// 损耗率
	
	public Double getLoss() {
		return loss;
	}

	public void setLoss(Double loss) {
		this.loss = loss;
	}

	public String getLossRat() {
		return lossRat;
	}

	public void setLossRat(String lossRat) {
		this.lossRat = lossRat;
	}

	public EgsPotMonth() {
		super();
	}

	public EgsPotMonth(String id){
		super(id);
	}

	@Length(min=0, max=64, message="月盘点ID长度必须介于 0 和 64 之间")
	public String getMonthId() {
		return monthId;
	}

	public void setMonthId(String monthId) {
		this.monthId = monthId;
	}
	
	public Integer getPotNo() {
		return potNo;
	}

	public void setPotNo(Integer potNo) {
		this.potNo = potNo;
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
	
	public Double getAdjustStorage() {
		return adjustStorage;
	}

	public void setAdjustStorage(Double adjustStorage) {
		this.adjustStorage = adjustStorage;
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
	
	
	
}