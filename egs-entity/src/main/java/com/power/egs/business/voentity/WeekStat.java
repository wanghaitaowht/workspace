package com.power.egs.business.voentity;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by hfjin on 2016/1/13.
 * 一周内销售统计
 */
public class WeekStat extends PeriodStat {

    /**
     * 获取指定星期几 的销售统计
     *
     * @param dayOfWeek 周一为1，。。。周日为7
     * @return
     */
    public TotalSalesStat getDayTotalSalesStat(int dayOfWeek) {

        Calendar calendar = Calendar.getInstance();

        dayOfWeek = (dayOfWeek % 7) + 1;
        for (TotalSalesStat totalSalesStat : this.getEveryOneSalesStats()) {
            calendar.setTime(totalSalesStat.getStartDate());
            calendar.setFirstDayOfWeek(Calendar.MONDAY);

            if (calendar.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
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
