package com.web.paras.mani.pamani.bean;

public class Supplier {
   Integer supplier;
   String supplierName;
   String contactName;
   String address;
   String contactPhone;
   String supplierStatus;
   String lang;
   String email;
   String fax;
   String website;

    public Supplier() {
    }

    public Supplier(Integer supplier, String supplierName, String contactName, String address, String contactPhone, String supplierStatus, String lang, String email, String fax, String website) {
        this.supplier = supplier;
        this.supplierName = supplierName;
        this.contactName = contactName;
        this.address = address;
        this.contactPhone = contactPhone;
        this.supplierStatus = supplierStatus;
        this.lang = lang;
        this.email = email;
        this.fax = fax;
        this.website = website;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplier=" + supplier +
                ", supplierName='" + supplierName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", address='" + address + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", supplierStatus='" + supplierStatus + '\'' +
                ", lang='" + lang + '\'' +
                ", email='" + email + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
