package com.web.paras.mani.pamani.bean;


import java.sql.Date;

public class Product {
    int sku;
    String sku_desc;
    String short_desc;
    int dept;
    int productClass;
    int subClass;
    Date lastUpdateDate;
    int store;
    String primarySupplier;
    long unitRetail;
    long unitCost;
    int stockOnHand;
    int tsfExpectedQty;
    int tsfReservedQty;
    int rtvQty;
    int nonSellableQty;
    String clearInd;
    String status;
    Date statusUpdateDate;
    Date lastSalesExportDate;
    String repairServiceInd;
    String upc;
    String rating;
    String color;
    String size;
    String perfCode;
    String smallUrl;
    String bigUrl;
    String map;
    String mapStartDate;
    String mapEndDate;
    String streetDate;
    String inStockDate;
    String outStockDate;


    public Product() {
    }

    public Product(int sku, String sku_desc, String short_desc, int dept, int productClass, int subClass, Date lastUpdateDate, int store, String primarySupplier, long unitRetail, long unitCost, int stockOnHand, int tsfExpectedQty, int tsfReservedQty, int rtvQty, int nonSellableQty, String clearInd, String status, Date statusUpdateDate, Date lastSalesExportDate, String repairServiceInd, String upc, String rating, String color, String size, String perfCode, String smallUrl, String bigUrl, String map, String mapStartDate, String mapEndDate, String streetDate, String inStockDate, String outStockDate) {
        this.sku = sku;
        this.sku_desc = sku_desc;
        this.short_desc = short_desc;
        this.dept = dept;
        this.productClass = productClass;
        this.subClass = subClass;
        this.lastUpdateDate = lastUpdateDate;
        this.store = store;
        this.primarySupplier = primarySupplier;
        this.unitRetail = unitRetail;
        this.unitCost = unitCost;
        this.stockOnHand = stockOnHand;
        this.tsfExpectedQty = tsfExpectedQty;
        this.tsfReservedQty = tsfReservedQty;
        this.rtvQty = rtvQty;
        this.nonSellableQty = nonSellableQty;
        this.clearInd = clearInd;
        this.status = status;
        this.statusUpdateDate = statusUpdateDate;
        this.lastSalesExportDate = lastSalesExportDate;
        this.repairServiceInd = repairServiceInd;
        this.upc = upc;
        this.rating = rating;
        this.color = color;
        this.size = size;
        this.perfCode = perfCode;
        this.smallUrl = smallUrl;
        this.bigUrl = bigUrl;
        this.map = map;
        this.mapStartDate = mapStartDate;
        this.mapEndDate = mapEndDate;
        this.streetDate = streetDate;
        this.inStockDate = inStockDate;
        this.outStockDate = outStockDate;
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

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public String getPrimarySupplier() {
        return primarySupplier;
    }

    public void setPrimarySupplier(String primarySupplier) {
        this.primarySupplier = primarySupplier;
    }

    public long getUnitRetail() {
        return unitRetail;
    }

    public void setUnitRetail(long unitRetail) {
        this.unitRetail = unitRetail;
    }

    public long getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(long unitCost) {
        this.unitCost = unitCost;
    }

    public int getStockOnHand() {
        return stockOnHand;
    }

    public void setStockOnHand(int stockOnHand) {
        this.stockOnHand = stockOnHand;
    }

    public int getTsfExpectedQty() {
        return tsfExpectedQty;
    }

    public void setTsfExpectedQty(int tsfExpectedQty) {
        this.tsfExpectedQty = tsfExpectedQty;
    }

    public int getTsfReservedQty() {
        return tsfReservedQty;
    }

    public void setTsfReservedQty(int tsfReservedQty) {
        this.tsfReservedQty = tsfReservedQty;
    }

    public int getRtvQty() {
        return rtvQty;
    }

    public void setRtvQty(int rtvQty) {
        this.rtvQty = rtvQty;
    }

    public int getNonSellableQty() {
        return nonSellableQty;
    }

    public void setNonSellableQty(int nonSellableQty) {
        this.nonSellableQty = nonSellableQty;
    }

    public String getClearInd() {
        return clearInd;
    }

    public void setClearInd(String clearInd) {
        this.clearInd = clearInd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Date statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public Date getLastSalesExportDate() {
        return lastSalesExportDate;
    }

    public void setLastSalesExportDate(Date lastSalesExportDate) {
        this.lastSalesExportDate = lastSalesExportDate;
    }

    public String getRepairServiceInd() {
        return repairServiceInd;
    }

    public void setRepairServiceInd(String repairServiceInd) {
        this.repairServiceInd = repairServiceInd;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPerfCode() {
        return perfCode;
    }

    public void setPerfCode(String perfCode) {
        this.perfCode = perfCode;
    }

    public String getSmallUrl() {
        return smallUrl;
    }

    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    public String getBigUrl() {
        return bigUrl;
    }

    public void setBigUrl(String bigUrl) {
        this.bigUrl = bigUrl;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMapStartDate() {
        return mapStartDate;
    }

    public void setMapStartDate(String mapStartDate) {
        this.mapStartDate = mapStartDate;
    }

    public String getMapEndDate() {
        return mapEndDate;
    }

    public void setMapEndDate(String mapEndDate) {
        this.mapEndDate = mapEndDate;
    }

    public String getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public String getInStockDate() {
        return inStockDate;
    }

    public void setInStockDate(String inStockDate) {
        this.inStockDate = inStockDate;
    }

    public String getOutStockDate() {
        return outStockDate;
    }

    public void setOutStockDate(String outStockDate) {
        this.outStockDate = outStockDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku=" + sku +
                ", sku_desc='" + sku_desc + '\'' +
                ", short_desc='" + short_desc + '\'' +
                ", dept=" + dept +
                ", productClass=" + productClass +
                ", subClass=" + subClass +
                ", lastUpdateDate=" + lastUpdateDate +
                ", store=" + store +
                ", primarySupplier='" + primarySupplier + '\'' +
                ", unitRetail=" + unitRetail +
                ", unitCost=" + unitCost +
                ", stockOnHand=" + stockOnHand +
                ", tsfExpectedQty=" + tsfExpectedQty +
                ", tsfReservedQty=" + tsfReservedQty +
                ", rtvQty=" + rtvQty +
                ", nonSellableQty=" + nonSellableQty +
                ", clearInd='" + clearInd + '\'' +
                ", status='" + status + '\'' +
                ", statusUpdateDate=" + statusUpdateDate +
                ", lastSalesExportDate=" + lastSalesExportDate +
                ", repairServiceInd='" + repairServiceInd + '\'' +
                ", upc='" + upc + '\'' +
                ", rating='" + rating + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", perfCode='" + perfCode + '\'' +
                ", smallUrl='" + smallUrl + '\'' +
                ", bigUrl='" + bigUrl + '\'' +
                ", map='" + map + '\'' +
                ", mapStartDate='" + mapStartDate + '\'' +
                ", mapEndDate='" + mapEndDate + '\'' +
                ", streetDate='" + streetDate + '\'' +
                ", inStockDate='" + inStockDate + '\'' +
                ", outStockDate='" + outStockDate + '\'' +
                '}';
    }
}
