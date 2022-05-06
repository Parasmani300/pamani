package com.web.paras.mani.pamani.bean;

public class Payment {
    String paymentID;
    String paymentType;
    String allowed;

    public Payment() {
    }

    public Payment(String paymentID, String paymentType, String allowed) {
        this.paymentID = paymentID;
        this.paymentType = paymentType;
        this.allowed = allowed;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAllowed() {
        return allowed;
    }

    public void setAllowed(String allowed) {
        this.allowed = allowed;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", allowed='" + allowed + '\'' +
                '}';
    }
}
