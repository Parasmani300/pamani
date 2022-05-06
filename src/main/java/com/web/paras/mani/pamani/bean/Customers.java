package com.web.paras.mani.pamani.bean;

import java.sql.Date;

public class Customers {

    int customerID;
    String firstName;
    String lastName;
    String customerClass;
    String room;
    String building;
    String address1;
    String address2;
    String city;
    String state;
    String postalCode;
    String country;
    String phone;
    String email;
    String voiceMail;
    String password;
    String creditCard;
    String creditCardTypeID;
    String cardExpMo;
    String cardExpYr;
    String billingAddress;
    String billingCity;
    String billingRegion;
    String billingPostalCode;
    String billingCountry;
    String shipAddress;
    String shipCity;
    String shipRegion;
    String shipPostalCode;
    String shipCountry;
    Date dateEntered;

    public Customers() {
    }

    public Customers(int customerID, String firstName, String lastName, String customerClass, String room, String building, String address1, String address2, String city, String state, String postalCode, String country, String phone, String email, String voiceMail, String password, String creditCard, String creditCardTypeID, String cardExpMo, String cardExpYr, String billingAddress, String billingCity, String billingRegion, String billingPostalCode, String billingCountry, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry, Date dateEntered) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerClass = customerClass;
        this.room = room;
        this.building = building;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.voiceMail = voiceMail;
        this.password = password;
        this.creditCard = creditCard;
        this.creditCardTypeID = creditCardTypeID;
        this.cardExpMo = cardExpMo;
        this.cardExpYr = cardExpYr;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingRegion = billingRegion;
        this.billingPostalCode = billingPostalCode;
        this.billingCountry = billingCountry;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
        this.dateEntered = dateEntered;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoiceMail() {
        return voiceMail;
    }

    public void setVoiceMail(String voiceMail) {
        this.voiceMail = voiceMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCardTypeID() {
        return creditCardTypeID;
    }

    public void setCreditCardTypeID(String creditCardTypeID) {
        this.creditCardTypeID = creditCardTypeID;
    }

    public String getCardExpMo() {
        return cardExpMo;
    }

    public void setCardExpMo(String cardExpMo) {
        this.cardExpMo = cardExpMo;
    }

    public String getCardExpYr() {
        return cardExpYr;
    }

    public void setCardExpYr(String cardExpYr) {
        this.cardExpYr = cardExpYr;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingRegion() {
        return billingRegion;
    }

    public void setBillingRegion(String billingRegion) {
        this.billingRegion = billingRegion;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerClass='" + customerClass + '\'' +
                ", room='" + room + '\'' +
                ", building='" + building + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", voiceMail='" + voiceMail + '\'' +
                ", password='" + password + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", creditCardTypeID='" + creditCardTypeID + '\'' +
                ", cardExpMo='" + cardExpMo + '\'' +
                ", cardExpYr='" + cardExpYr + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingReligion='" + billingRegion + '\'' +
                ", billingPostalCode='" + billingPostalCode + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipCity='" + shipCity + '\'' +
                ", shipRegion='" + shipRegion + '\'' +
                ", shipPostalCode='" + shipPostalCode + '\'' +
                ", shipCountry='" + shipCountry + '\'' +
                ", dateEntered=" + dateEntered +
                '}';
    }
}
