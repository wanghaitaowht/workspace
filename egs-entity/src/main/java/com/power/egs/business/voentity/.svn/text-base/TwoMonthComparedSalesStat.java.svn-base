package com.power.egs.business.voentity;

import com.power.platform.common.persistence.BaseEntity;

import java.util.Calendar;

/**
 * Created by hfjin on 2016/1/13.
 * 两月比统计分析
 */
public class TwoMonthComparedSalesStat extends BaseEntity<TwoMonthComparedSalesStat> {

    /**
     * 百分比
     */
    private Double percent;
    /**
     * 目标月统计
     */
    private MonthStat target;
    /**
     * 被比较月统计
     */
    private MonthStat compared;

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public MonthStat getTarget() {
        return target;
    }

    public void setTarget(MonthStat target) {
        this.target = target;
    }

    public MonthStat getCompared() {
        return compared;
    }

    public void setCompared(MonthStat compared) {
        this.compared = compared;
    }

    /**
     * 获取指定天的销售统计
     *
     * @param day
     * @return
     */
    public TotalSalesStat[] getComparedSalesStatsOnDay(int day) {


        TotalSalesStat[] totalSalesStats = new TotalSalesStat[2];
        totalSalesStats[0] = (target != null) ? target.getDayTotalSalesStat(day) : null;
        totalSalesStats[1] = (compared != null) ? compared.getDayTotalSalesStat(day) : null;
        return totalSalesStats;
    }


    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
