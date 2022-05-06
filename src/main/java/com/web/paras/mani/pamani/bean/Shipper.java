package com.web.paras.mani.pamani.bean;

public class Shipper {
    String shipperId;
    String shipperName;
    float price;

    public Shipper() {
    }

    public Shipper(String shipperId, String shipperName, float price) {
        this.shipperId = shipperId;
        this.shipperName = shipperName;
        this.price = price;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "shipperId='" + shipperId + '\'' +
                ", shipperName='" + shipperName + '\'' +
                ", price=" + price +
                '}';
    }


}
