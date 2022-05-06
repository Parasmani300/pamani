package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class ProductStore {
    Integer sku;
    Integer store;
    Integer coreSupplier;
    Float unitRetail;
    Float unitCost;
    Integer stockOnHand;
    Integer inTransitQty;
    Integer tsfExpectedQty;
    Integer tsfReservedQty;
    Integer rtvQty;
    Integer nonSellableQty;
    String clearInd;
    String taxableInd;
    String status;
    Date statusUpdateDate;
    Date lastSalesExportDate;
    String repairServiceInd;

    public ProductStore() {
    }

    public ProductStore(Integer sku, Integer store, Integer coreSupplier, Float unitRetail, Float unitCost, Integer stockOnHand, Integer inTransitQty, Integer tsfExpectedQty, Integer tsfReservedQty, Integer rtvQty, Integer nonSellableQty, String clearInd, String taxableInd, String status, Date statusUpdateDate, Date lastSalesExportDate, String repairServiceInd) {
        this.sku = sku;
        this.store = store;
        this.coreSupplier = coreSupplier;
        this.unitRetail = unitRetail;
        this.unitCost = unitCost;
        this.stockOnHand = stockOnHand;
        this.inTransitQty = inTransitQty;
        this.tsfExpectedQty = tsfExpectedQty;
        this.tsfReservedQty = tsfReservedQty;
        this.rtvQty = rtvQty;
        this.nonSellableQty = nonSellableQty;
        this.clearInd = clearInd;
        this.taxableInd = taxableInd;
        this.status = status;
        this.statusUpdateDate = statusUpdateDate;
        this.lastSalesExportDate = lastSalesExportDate;
        this.repairServiceInd = repairServiceInd;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getCoreSupplier() {
        return coreSupplier;
    }

    public void setCoreSupplier(Integer coreSupplier) {
        this.coreSupplier = coreSupplier;
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

    public Integer getStockOnHand() {
        return stockOnHand;
    }

    public void setStockOnHand(Integer stockOnHand) {
        this.stockOnHand = stockOnHand;
    }

    public Integer getInTransitQty() {
        return inTransitQty;
    }

    public void setInTransitQty(Integer inTransitQty) {
        this.inTransitQty = inTransitQty;
    }

    public Integer getTsfExpectedQty() {
        return tsfExpectedQty;
    }

    public void setTsfExpectedQty(Integer tsfExpectedQty) {
        this.tsfExpectedQty = tsfExpectedQty;
    }

    public Integer getTsfReservedQty() {
        return tsfReservedQty;
    }

    public void setTsfReservedQty(Integer tsfReservedQty) {
        this.tsfReservedQty = tsfReservedQty;
    }

    public Integer getRtvQty() {
        return rtvQty;
    }

    public void setRtvQty(Integer rtvQty) {
        this.rtvQty = rtvQty;
    }

    public Integer getNonSellableQty() {
        return nonSellableQty;
    }

    public void setNonSellableQty(Integer nonSellableQty) {
        this.nonSellableQty = nonSellableQty;
    }

    public String getClearInd() {
        return clearInd;
    }

    public void setClearInd(String clearInd) {
        this.clearInd = clearInd;
    }

    public String getTaxableInd() {
        return taxableInd;
    }

    public void setTaxableInd(String taxableInd) {
        this.taxableInd = taxableInd;
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

    @Override
    public String toString() {
        return "ProductStore{" +
                "sku=" + sku +
                ", store=" + store +
                ", coreSupplier=" + coreSupplier +
                ", unitRetail=" + unitRetail +
                ", unitCost=" + unitCost +
                ", stockOnHand=" + stockOnHand +
                ", inTransitQty=" + inTransitQty +
                ", tsfExpectedQty=" + tsfExpectedQty +
                ", tsfReservedQty=" + tsfReservedQty +
                ", rtvQty=" + rtvQty +
                ", nonSellableQty=" + nonSellableQty +
                ", clearInd='" + clearInd + '\'' +
                ", taxableInd='" + taxableInd + '\'' +
                ", status='" + status + '\'' +
                ", statusUpdateDate=" + statusUpdateDate +
                ", lastSalesExportDate=" + lastSalesExportDate +
                ", repairServiceInd='" + repairServiceInd + '\'' +
                '}';
    }


}
