package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class ProductAttributes {
    Integer sku;
    String skuNotes;
    String rating;
    String color;
    String productSize;
    String skuStatus;
    Date streetDate;
    Date inStockDate;
    Date outStockDate;
    Integer map;
    Date mapStartDate;
    Date mapEndDate;
    String performanceCode;
    String urlSmall;
    String urlBig;
    Date lastUpdateDate;

    public ProductAttributes() {
    }

    public ProductAttributes(Integer sku, String skuNotes, String rating, String color, String productSize, String skuStatus, Date streetDate, Date inStockDate, Date outStockDate, Integer map, Date mapStartDate, Date mapEndDate, String performanceCode, String urlSmall, String urlBig, Date lastUpdateDate) {
        this.sku = sku;
        this.skuNotes = skuNotes;
        this.rating = rating;
        this.color = color;
        this.productSize = productSize;
        this.skuStatus = skuStatus;
        this.streetDate = streetDate;
        this.inStockDate = inStockDate;
        this.outStockDate = outStockDate;
        this.map = map;
        this.mapStartDate = mapStartDate;
        this.mapEndDate = mapEndDate;
        this.performanceCode = performanceCode;
        this.urlSmall = urlSmall;
        this.urlBig = urlBig;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getSkuNotes() {
        return skuNotes;
    }

    public void setSkuNotes(String skuNotes) {
        this.skuNotes = skuNotes;
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

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
    }

    public Date getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(Date streetDate) {
        this.streetDate = streetDate;
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

    public String getPerformanceCode() {
        return performanceCode;
    }

    public void setPerformanceCode(String performanceCode) {
        this.performanceCode = performanceCode;
    }

    public String getUrlSmall() {
        return urlSmall;
    }

    public void setUrlSmall(String urlSmall) {
        this.urlSmall = urlSmall;
    }

    public String getUrlBig() {
        return urlBig;
    }

    public void setUrlBig(String urlBig) {
        this.urlBig = urlBig;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "ProductAttributes{" +
                "sku=" + sku +
                ", skuNotes='" + skuNotes + '\'' +
                ", rating='" + rating + '\'' +
                ", color='" + color + '\'' +
                ", productSize='" + productSize + '\'' +
                ", skuStatus='" + skuStatus + '\'' +
                ", streetDate=" + streetDate +
                ", inStockDate=" + inStockDate +
                ", outStockDate=" + outStockDate +
                ", map=" + map +
                ", mapStartDate=" + mapStartDate +
                ", mapEndDate=" + mapEndDate +
                ", performanceCode='" + performanceCode + '\'' +
                ", urlSmall='" + urlSmall + '\'' +
                ", urlBig='" + urlBig + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }

}
