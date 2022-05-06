package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class ProductSupplier {
    Integer sku;
    Integer supplier;
    String primarySupplierInd;
    String rtvInd;
    Date lastUpdateDate;

    public ProductSupplier() {
    }

    public ProductSupplier(Integer sku, Integer supplier, String primarySupplierInd, String rtvInd, Date lastUpdateDate) {
        this.sku = sku;
        this.supplier = supplier;
        this.primarySupplierInd = primarySupplierInd;
        this.rtvInd = rtvInd;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getPrimarySupplierInd() {
        return primarySupplierInd;
    }

    public void setPrimarySupplierInd(String primarySupplierInd) {
        this.primarySupplierInd = primarySupplierInd;
    }

    public String getRtvInd() {
        return rtvInd;
    }

    public void setRtvInd(String rtvInd) {
        this.rtvInd = rtvInd;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "ProductSupplier{" +
                "sku=" + sku +
                ", supplier=" + supplier +
                ", primarySupplierInd='" + primarySupplierInd + '\'' +
                ", rtvInd='" + rtvInd + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
