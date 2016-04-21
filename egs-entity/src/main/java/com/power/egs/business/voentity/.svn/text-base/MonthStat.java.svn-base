package com.power.egs.business.voentity;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by hfjin on 2016/1/13.
 * 月统计分析实体
 */
public class MonthStat extends PeriodStat {
    /**
     * 周统计
     */
    private List<TotalSalesStat> weekTotalSalesStats;

    public List<TotalSalesStat> getWeekTotalSalesStats() {
        return weekTotalSalesStats;
    }

    public void setWeekTotalSalesStats(List<TotalSalesStat> weekTotalSalesStats) {
        this.weekTotalSalesStats = weekTotalSalesStats;
    }

    public TotalSalesStat getDayTotalSalesStat(int day){

        Calendar calendar = Calendar.getInstance();
        for (TotalSalesStat totalSalesStat : this.getEveryOneSalesStats()){
            calendar.setTime(totalSalesStat.getStartDate());
            if (calendar.get(Calendar.DAY_OF_MONTH) == day){
                return totalSalesStat;
            }
        }
        return null;
    }

    @Override
    public TotalSalesStat getTotalSalesStatByDate(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int curYear = calendar.get(Calendar.YEAR);
        int curMonth = calendar.get(Calendar.MONTH);
        int curDay = calendar.get(Calendar.DAY_OF_MONTH);
        for (TotalSalesStat totalSalesStat : this.getEveryOneSalesStats()) {
            calendar.setTime(totalSalesStat.getStartDate());
            if (calendar.get(Calendar.YEAR) == curYear &&
                    calendar.get(Calendar.MONTH) == curMonth &&
                    calendar.get(Calendar.DAY_OF_MONTH) == curDay) {
                return totalSalesStat;
            }
        }
        return null;
    }
}
