package com.power.egs.business.voentity;

import com.power.platform.common.persistence.BaseEntity;

import java.util.List;

/**
 * Created by hfjin on 2016/1/13.
 * 日统计分析实体
 */
public class DayStat  extends BaseEntity<DayStat> {

    private TotalSalesStat totalSalesStat; // 日销售统计
    private List<GoodsStat> goodsStats; // 商品统计
    private List<ChannelPayStat> channelPayStats; // 支付渠道统计 // TODO 目前这个没法统计

    public List<GoodsStat> getGoodsStats() {
        return goodsStats;
    }

    public void setGoodsStats(List<GoodsStat> goodsStats) {
        this.goodsStats = goodsStats;
    }

    public List<ChannelPayStat> getChannelPayStats() {
        return channelPayStats;
    }

    public void setChannelPayStats(List<ChannelPayStat> channelPayStats) {
        this.channelPayStats = channelPayStats;
    }

    public TotalSalesStat getTotalSalesStat() {
        return totalSalesStat;
    }

    public void setTotalSalesStat(TotalSalesStat totalSalesStat) {
        this.totalSalesStat = totalSalesStat;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
