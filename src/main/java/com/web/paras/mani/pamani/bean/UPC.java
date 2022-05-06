package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class UPC {
    String upc;
    String upc_supplement;
    int sku;
    String upc_desc;
    String primaryUpcInd;
    String upcType;
    String manufacturer;
    String varType;
    Date lastUpdatedDate;

    public UPC() {
    }

    public UPC(String upc, String upc_supplement, int sku, String upc_desc, String primaryUpcInd, String upcType, String manufacturer,String varType, Date lastUpdatedDate) {
        this.upc = upc;
        this.upc_supplement = upc_supplement;
        this.sku = sku;
        this.upc_desc = upc_desc;
        this.primaryUpcInd = primaryUpcInd;
        this.upcType = upcType;
        this.manufacturer = manufacturer;
        this.lastUpdatedDate = lastUpdatedDate;
        this.varType = varType;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
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

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
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

    public String getUpcType() {
        return upcType;
    }

    public void setUpcType(String upcType) {
        this.upcType = upcType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public String toString() {
        return "UPC{" +
                "upc='" + upc + '\'' +
                ", upc_supplement='" + upc_supplement + '\'' +
                ", sku=" + sku +
                ", upc_desc='" + upc_desc + '\'' +
                ", primaryUpcInd='" + primaryUpcInd + '\'' +
                ", upcType='" + upcType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
