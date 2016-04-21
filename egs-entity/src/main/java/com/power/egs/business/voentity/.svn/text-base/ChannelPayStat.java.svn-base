package com.power.egs.business.voentity;

import com.power.platform.common.persistence.BaseEntity;

import java.math.BigDecimal;

/**
 * Created by hfjin on 2016/1/13.
 * 支付渠道支付统计分析
 */
public class ChannelPayStat extends BaseEntity<ChannelPayStat>{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String channel; // 支付渠道
    private BigDecimal payAmmounts; // 支付金额
    private Float percent; //占比

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public BigDecimal getPayAmmounts() {
        return payAmmounts;
    }

    public void setPayAmmounts(BigDecimal payAmmounts) {
        this.payAmmounts = payAmmounts;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
