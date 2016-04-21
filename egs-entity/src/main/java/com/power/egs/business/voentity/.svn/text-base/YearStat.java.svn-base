package com.power.egs.business.voentity;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by hfjin on 2016/1/13.
 * 年统计分析
 */
public class YearStat extends PeriodStat {

    public TotalSalesStat getMonthTotalSalesStat(int month) {

        Calendar calendar = Calendar.getInstance();
        month -= 1;
        for (TotalSalesStat totalSalesStat : this.getEveryOneSalesStats()) {
            calendar.setTime(totalSalesStat.getStartDate());
            if (calendar.get(Calendar.MONTH) == month) {
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
        for (TotalSalesStat totalSalesStat : this.getEveryOneSalesStats()) {
            calendar.setTime(totalSalesStat.getStartDate());
            if (calendar.get(Calendar.YEAR) == curYear &&
                    calendar.get(Calendar.MONTH) == curMonth) {
                return totalSalesStat;
            }
        }
        return null;
    }
}
