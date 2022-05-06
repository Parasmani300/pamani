package com.web.paras.mani.pamani.bean;

public class Category {
    private  String  categoryId;
    private  String getCategoryName;
    private String description;
    private  String picture;
    private String active;

    public Category() {
    }

    public Category(String categoryId, String getCategoryName, String description, String picture, String active) {
        this.categoryId = categoryId;
        this.getCategoryName = getCategoryName;
        this.description = description;
        this.picture = picture;
        this.active = active;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getGetCategoryName() {
        return getCategoryName;
    }

    public void setGetCategoryName(String getCategoryName) {
        this.getCategoryName = getCategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId='" + categoryId + '\'' +
                ", getCategoryName='" + getCategoryName + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}