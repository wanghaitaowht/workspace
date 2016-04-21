package com.power.egs.business.voentity;

import com.power.platform.common.persistence.BaseEntity;

import java.util.*;

/**
 * Created by hfjin on 2016/1/14.
 * 一定期间内统计分析记录
 */
public abstract class PeriodStat extends BaseEntity<PeriodStat> {

    /**
     * 期间总销售统计
     */
    private TotalSalesStat periodTotalSalesStat;
    /**
     * 期间内每单位时间销售统计
     */
    private List<TotalSalesStat> everyOneSalesStats;

    public TotalSalesStat getPeriodTotalSalesStat() {
        return periodTotalSalesStat;
    }

    public void setPeriodTotalSalesStat(TotalSalesStat periodTotalSalesStat) {
        this.periodTotalSalesStat = periodTotalSalesStat;
    }

    public List<TotalSalesStat> getEveryOneSalesStats() {
        return everyOneSalesStats;
    }

    public void setEveryOneSalesStats(List<TotalSalesStat> everyOneSalesStats) {
        this.everyOneSalesStats = everyOneSalesStats;
    }

    /**
     * 获取指定日期的销售统计记录
     * @param date
     * @return
     */
    public abstract TotalSalesStat getTotalSalesStatByDate(Date date);

    /**
     * 获取最大的销售记录
     *
     * @return
     */
    public TotalSalesStat getMaxAmountsSalesStat() {

        if (this.everyOneSalesStats == null || this.everyOneSalesStats.isEmpty())
            return null;

        return Collections.max(this.everyOneSalesStats, new Comparator<TotalSalesStat>() {
            @Override
            public int compare(TotalSalesStat o1, TotalSalesStat o2) {
                return o1.getTotalAmounts().compareTo(o2.getTotalAmounts());
            }
        });

    }

    /**
     * 获取指定时间区间内的日统计数据
     *
     * @param start 起始时间
     * @param end   结束时间
     * @return
     */
    public List<TotalSalesStat> getSectionTotalSalesStat(Date start, Date end) {

        if (this.everyOneSalesStats == null || this.everyOneSalesStats.isEmpty())
            return null;

        List<TotalSalesStat> totalSalesStats = new ArrayList<>();
        for (TotalSalesStat totalSalesStat : everyOneSalesStats) {
            if (totalSalesStat.getStartDate().compareTo(start) >= 0
                    && totalSalesStat.getEndDate().compareTo(end) <= 0)
                totalSalesStats.add(totalSalesStat);
        }
        return totalSalesStats;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
