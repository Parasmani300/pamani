package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class OrderDetails {
    String orderID;
    String productID;
    String orderNumber;
    float price;
    int quantity;
    float discount;
    float total;
    String IdSku;
    int orderSize;
    String color;
    String fulfilled;
    Date shipDate;
    String orderDetailId;
    Date billDate;

    public OrderDetails() {
    }

    public OrderDetails(String orderID, String productID, String orderNumber, float price, int quantity, float discount, float total, String idSku, int orderSize, String color, String fulfilled, Date shipDate, String orderDetailId, Date billDate) {
        this.orderID = orderID;
        this.productID = productID;
        this.orderNumber = orderNumber;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.total = total;
        IdSku = idSku;
        this.orderSize = orderSize;
        this.color = color;
        this.fulfilled = fulfilled;
        this.shipDate = shipDate;
        this.orderDetailId = orderDetailId;
        this.billDate = billDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getIdSku() {
        return IdSku;
    }

    public void setIdSku(String idSku) {
        IdSku = idSku;
    }

    public int getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(int orderSize) {
        this.orderSize = orderSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(String fulfilled) {
        this.fulfilled = fulfilled;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderID='" + orderID + '\'' +
                ", productID='" + productID + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", total=" + total +
                ", IdSku='" + IdSku + '\'' +
                ", orderSize=" + orderSize +
                ", color='" + color + '\'' +
                ", fulfilled='" + fulfilled + '\'' +
                ", shipDate=" + shipDate +
                ", orderDetailId='" + orderDetailId + '\'' +
                ", billDate=" + billDate +
                '}';
    }
}
