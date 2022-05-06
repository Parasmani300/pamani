package com.web.paras.mani.pamani.bean;

public class UpcChecker {
    String upc;

    public UpcChecker() {
    }

    public UpcChecker(String upc) {
        this.upc = upc;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    @Override
    public String toString() {
        return "UpcChecker{" +
                "upc='" + upc + '\'' +
                '}';
    }
}
