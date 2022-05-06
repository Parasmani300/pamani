package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class Order {

    String orderId;
    String customerId;
    int orderNumber;
    int paymentId;
    Date orderDate;
    Date shipDate;
    Date requiredDate;
    int shipperId;
    String freight;
    float saleTax;
//    Date orderTImestamp;
    String transcatStatus;
    String errLoc;
    String errMsg;
    String fulfiled;
    String deleted;
    String paid;
    Date paymentDate;

    public Order() {
    }

    public Order(String orderId, String customerId, int orderNumber, int paymentId, Date orderDate, Date shipDate, Date requiredDate, int shipperId, String freight, float saleTax, String transcatStatus, String errLoc, String errMsg, String fulfiled, String deleted, String paid, Date paymentDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderNumber = orderNumber;
        this.paymentId = paymentId;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.requiredDate = requiredDate;
        this.shipperId = shipperId;
        this.freight = freight;
        this.saleTax = saleTax;
//        this.orderTImestamp = orderTImestamp;
        this.transcatStatus = transcatStatus;
        this.errLoc = errLoc;
        this.errMsg = errMsg;
        this.fulfiled = fulfiled;
        this.deleted = deleted;
        this.paid = paid;
        this.paymentDate = paymentDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public float getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(float saleTax) {
        this.saleTax = saleTax;
    }

//    public Date getOrderTImestamp() {
//        return orderTImestamp;
//    }
//
//    public void setOrderTImestamp(Date orderTImestamp) {
//        this.orderTImestamp = orderTImestamp;
//    }

    public String getTranscatStatus() {
        return transcatStatus;
    }

    public void setTranscatStatus(String transcatStatus) {
        this.transcatStatus = transcatStatus;
    }

    public String getErrLoc() {
        return errLoc;
    }

    public void setErrLoc(String errLoc) {
        this.errLoc = errLoc;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getFulfiled() {
        return fulfiled;
    }

    public void setFulfiled(String fulfiled) {
        this.fulfiled = fulfiled;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderNumber=" + orderNumber +
                ", paymentId=" + paymentId +
                ", orderDate=" + orderDate +
                ", shipDate=" + shipDate +
                ", requiredDate=" + requiredDate +
                ", shipperId=" + shipperId +
                ", freight='" + freight + '\'' +
                ", saleTax=" + saleTax +
                ", transcatStatus='" + transcatStatus + '\'' +
                ", errLoc='" + errLoc + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", fulfiled='" + fulfiled + '\'' +
                ", deleted='" + deleted + '\'' +
                ", paid='" + paid + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
