package com.power.egs.business.voentity;

/**
 * Created by hfjin on 2016/1/15.
 * 月环比实体
 */
public class MonthSalesLinkStat extends TwoMonthComparedSalesStat {

    public MonthStat getCurrentMonthStat() {
        return this.getTarget();
    }

    public void setCurrentMonthStat(MonthStat currentMonthStat) {
        this.setTarget(currentMonthStat);
    }

    public MonthStat getLastMonthStat() {
        return this.getCompared();
    }

    public void setLastMonthStat(MonthStat lastMonthStat) {
        this.setCompared(lastMonthStat);
    }
}
