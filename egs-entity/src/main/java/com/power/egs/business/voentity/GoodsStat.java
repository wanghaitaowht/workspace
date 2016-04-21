package com.power.egs.business.voentity;

import com.power.platform.common.persistence.BaseEntity;

import java.math.BigDecimal;

/**
 * Created by hfjin on 2016/1/13.
 * 商品统计分析
 */
public class GoodsStat extends BaseEntity<GoodsStat> {
    private String goodsCode; // 商品编码
    private String goodsName; // 商品名称
    private Double payTotalLiters; // 总付油量
    private BigDecimal totalAmounts; // 总收入价
    private BigDecimal totalCosts; // 总成本价
    private Float percent; // 所占百分比

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPayTotalLiters() {
        return payTotalLiters;
    }

    public void setPayTotalLiters(Double payTotalLiters) {
        this.payTotalLiters = payTotalLiters;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public BigDecimal getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(BigDecimal totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public BigDecimal getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(BigDecimal totalCosts) {
        this.totalCosts = totalCosts;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}