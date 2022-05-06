package com.web.paras.mani.pamani.bean;

public class ProductClass {
    Integer dept;
    Integer productClass;
    String className;

    public ProductClass() {
    }

    public ProductClass(Integer dept, Integer productClass, String className) {
        this.dept = dept;
        this.productClass = productClass;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "dept=" + dept +
                ", productClass=" + productClass +
                ", className='" + className + '\'' +
                '}';
    }
}
