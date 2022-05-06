package com.web.paras.mani.pamani.bean;

public class SubClass {
    Integer dept;
    Integer productClass;
    Integer subclass;
    String subClassName;

    public SubClass() {
    }

    public SubClass(Integer dept, Integer productClass, Integer subclass, String subClassName) {
        this.dept = dept;
        this.productClass = productClass;
        this.subclass = subclass;
        this.subClassName = subClassName;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public Integer getProductClass() {
        return productClass;
    }

    public void setProductClass(Integer productClass) {
        this.productClass = productClass;
    }

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }

    public String getSubClassName() {
        return subClassName;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

    @Override
    public String toString() {
        return "SubClass{" +
                "dept=" + dept +
                ", productClass=" + productClass +
                ", subclass=" + subclass +
                ", subClassName='" + subClassName + '\'' +
                '}';
    }
}
