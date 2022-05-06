package com.web.paras.mani.pamani.bean;

public class Dept {
    Integer dept;
    String deptName;
    Integer buyer;
    Integer merch;
    Integer profitCalcType;
    Integer purchaseType;
    Integer groupNo;

    public Dept() {
    }

    public Dept(Integer dept, String deptName, Integer buyer, Integer merch, Integer profitCalcType, Integer purchaseType, Integer groupNo) {
        this.dept = dept;
        this.deptName = deptName;
        this.buyer = buyer;
        this.merch = merch;
        this.profitCalcType = profitCalcType;
        this.purchaseType = purchaseType;
        this.groupNo = groupNo;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getBuyer() {
        return buyer;
    }

    public void setBuyer(Integer buyer) {
        this.buyer = buyer;
    }

    public Integer getMerch() {
        return merch;
    }

    public void setMerch(Integer merch) {
        this.merch = merch;
    }

    public Integer getProfitCalcType() {
        return profitCalcType;
    }

    public void setProfitCalcType(Integer profitCalcType) {
        this.profitCalcType = profitCalcType;
    }

    public Integer getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    public Integer getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }
}
