package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class Store {
    Integer store;
    String storeName;
    String storeAddress;
    String storePhone;
    String storeEmail;
    String storeCity;
    String storeDistrict;
    String storeState;
    String storeZip;
    String storeCountry;
    Date lastUpdateDate;

    public Store(Integer store, String storeName, String storeAddress, String storePhone, String storeEmail, String storeCity, String storeDistrict, String storeState, String storeZip, String storeCountry, Date lastUpdateDate) {
        this.store = store;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storePhone = storePhone;
        this.storeEmail = storeEmail;
        this.storeCity = storeCity;
        this.storeDistrict = storeDistrict;
        this.storeState = storeState;
        this.storeZip = storeZip;
        this.storeCountry = storeCountry;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Store() {
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreDistrict() {
        return storeDistrict;
    }

    public void setStoreDistrict(String storeDistrict) {
        this.storeDistrict = storeDistrict;
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        this.storeState = storeState;
    }

    public String getStoreZip() {
        return storeZip;
    }

    public void setStoreZip(String storeZip) {
        this.storeZip = storeZip;
    }

    public String getStoreCountry() {
        return storeCountry;
    }

    public void setStoreCountry(String storeCountry) {
        this.storeCountry = storeCountry;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "Store{" +
                "store=" + store +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeEmail='" + storeEmail + '\'' +
                ", storeCity='" + storeCity + '\'' +
                ", storeDistrict='" + storeDistrict + '\'' +
                ", storeState='" + storeState + '\'' +
                ", storeZip='" + storeZip + '\'' +
                ", storeCountry='" + storeCountry + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
