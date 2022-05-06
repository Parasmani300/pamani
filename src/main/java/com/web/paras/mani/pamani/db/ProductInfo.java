package com.web.paras.mani.pamani.db;

import java.sql.Date;

public class ProductInfo {
    Integer sku;
    String sku_desc;
    String short_desc;
    int dept;
    int productClass;
    int subClass;
    Date lastUpdateDate;
    int store;
    String primarySupplier;
    Float unitRetail;
    Float unitCost;
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
    String upc_supplement;
    String upc_desc;
    String primaryUpcInd;
    String manufacturer;
    String varType;
    String rating;
    String color;
    String size;
    String perfCode;
    String smallUrl;
    String bigUrl;
    Integer map;
    Date mapStartDate;
    Date mapEndDate;
    Date mapStreetDate;
    Date inStockDate;
    Date outStockDate;
    String upcType;
    String skuStatus;
    Integer supplier;
    String rtvInd;
    String errMsg;


    public ProductInfo() {
    }

    public ProductInfo(String errMsg) {
        this.errMsg = errMsg;
    }

    public ProductInfo(Integer sku,String sku_desc, String short_desc, int dept, int productClass, int subClass, Date lastUpdateDate, int store, String primarySupplier, Float unitRetail, Float unitCost, int stockOnHand, int tsfExpectedQty, int tsfReservedQty, int rtvQty, int nonSellableQty, String clearInd, String status, Date statusUpdateDate, Date lastSalesExportDate, String repairServiceInd, String upc, String upc_supplement, String upc_desc, String primaryUpcInd, String manufacturer, String varType, String rating, String color, String size, String perfCode, String smallUrl, String bigUrl, Integer map, Date mapStartDate, Date mapEndDate, Date mapStreetDate, Date inStockDate, Date outStockDate, String upcType, String skuStatus, Integer supplier, String rtvInd,String errMsg) {
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
        this.upc_supplement = upc_supplement;
        this.upc_desc = upc_desc;
        this.primaryUpcInd = primaryUpcInd;
        this.manufacturer = manufacturer;
        this.varType = varType;
        this.rating = rating;
        this.color = color;
        this.size = size;
        this.perfCode = perfCode;
        this.smallUrl = smallUrl;
        this.bigUrl = bigUrl;
        this.map = map;
        this.mapStartDate = mapStartDate;
        this.mapEndDate = mapEndDate;
        this.mapStreetDate = mapStreetDate;
        this.inStockDate = inStockDate;
        this.outStockDate = outStockDate;
        this.upcType = upcType;
        this.skuStatus = skuStatus;
        this.supplier = supplier;
        this.rtvInd = rtvInd;
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "sku_desc='" + sku_desc + '\'' +
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
                ", upc_supplement='" + upc_supplement + '\'' +
                ", upc_desc='" + upc_desc + '\'' +
                ", primaryUpcInd='" + primaryUpcInd + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", varType='" + varType + '\'' +
                ", rating='" + rating + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", perfCode='" + perfCode + '\'' +
                ", smallUrl='" + smallUrl + '\'' +
                ", bigUrl='" + bigUrl + '\'' +
                ", map='" + map + '\'' +
                ", mapStartDate=" + mapStartDate +
                ", mapEndDate=" + mapEndDate +
                ", mapStreetDate=" + mapStreetDate +
                ", inStockDate=" + inStockDate +
                ", outStockDate=" + outStockDate +
                '}';
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getRtvInd() {
        return rtvInd;
    }

    public void setRtvInd(String rtvInd) {
        this.rtvInd = rtvInd;
    }

    public String getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
    }

    public String getUpcType() {
        return upcType;
    }

    public void setUpcType(String upcType) {
        this.upcType = upcType;
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

    public Float getUnitRetail() {
        return unitRetail;
    }

    public void setUnitRetail(Float unitRetail) {
        this.unitRetail = unitRetail;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
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

    public String getUpc_supplement() {
        return upc_supplement;
    }

    public void setUpc_supplement(String upc_supplement) {
        this.upc_supplement = upc_supplement;
    }

    public String getUpc_desc() {
        return upc_desc;
    }

    public void setUpc_desc(String upc_desc) {
        this.upc_desc = upc_desc;
    }

    public String getPrimaryUpcInd() {
        return primaryUpcInd;
    }

    public void setPrimaryUpcInd(String primaryUpcInd) {
        this.primaryUpcInd = primaryUpcInd;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
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

    public Integer getMap() {
        return map;
    }

    public void setMap(Integer map) {
        this.map = map;
    }

    public Date getMapStartDate() {
        return mapStartDate;
    }

    public void setMapStartDate(Date mapStartDate) {
        this.mapStartDate = mapStartDate;
    }

    public Date getMapEndDate() {
        return mapEndDate;
    }

    public void setMapEndDate(Date mapEndDate) {
        this.mapEndDate = mapEndDate;
    }

    public Date getMapStreetDate() {
        return mapStreetDate;
    }

    public void setMapStreetDate(Date mapStreetDate) {
        this.mapStreetDate = mapStreetDate;
    }

    public Date getInStockDate() {
        return inStockDate;
    }

    public void setInStockDate(Date inStockDate) {
        this.inStockDate = inStockDate;
    }

    public Date getOutStockDate() {
        return outStockDate;
    }

    public void setOutStockDate(Date outStockDate) {
        this.outStockDate = outStockDate;
    }
}
