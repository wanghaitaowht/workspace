package com.power.egs.business.voentity;

import com.power.platform.common.persistence.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hfjin on 2016/1/14.
 * 销售统计实体
 */
public class TotalSalesStat extends BaseEntity<TotalSalesStat> {
    private BigDecimal totalAmounts; // 总付油金额
    private BigDecimal totalIncomes; // 总收益
    private Double payTotalLiters; // 总付油量
    private Date startDate;
    private Date endDate;
    private PeriodType periodType = PeriodType.NON;


    public BigDecimal getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(BigDecimal totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public BigDecimal getTotalIncomes() {
        return totalIncomes;
    }

    public void setTotalIncomes(BigDecimal totalIncomes) {
        this.totalIncomes = totalIncomes;
    }

    public Double getPayTotalLiters() {
        return payTotalLiters;
    }

    public void setPayTotalLiters(Double payTotalLiters) {
        this.payTotalLiters = payTotalLiters;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
