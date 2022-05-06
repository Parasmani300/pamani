package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class ProductItem {
    int sku;
    String sku_desc;
    String short_desc;
    int dept;
    int productClass;
    int subClass;
    Date lastUpdateDate;

    public ProductItem() {
    }

    public ProductItem(int sku, String sku_desc, String short_desc, int dept, int productClass, int subClass, Date lastUpdateDate) {
        this.sku = sku;
        this.sku_desc = sku_desc;
        this.short_desc = short_desc;
        this.dept = dept;
        this.productClass = productClass;
        this.subClass = subClass;
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getSku_desc() {
        return sku_desc;
    }

    public void setSku_desc(String sku_desc) {
        this.sku_desc = sku_desc;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getProductClass() {
        return productClass;
    }

    public void setProductClass(int productClass) {
        this.productClass = productClass;
    }

    public int getSubClass() {
        return subClass;
    }

    public void setSubClass(int subClass) {
        this.subClass = subClass;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "sku=" + sku +
                ", sku_desc='" + sku_desc + '\'' +
                ", short_desc='" + short_desc + '\'' +
                ", dept=" + dept +
                ", productClass=" + productClass +
                ", subClass=" + subClass +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
