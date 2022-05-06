package com.web.paras.mani.pamani.bean;

public class SkuPool {
    int sku;

    public SkuPool() {
    }

    public SkuPool(int sku) {
        this.sku = sku;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "SkuPool{" +
                "sku=" + sku +
                '}';
    }
}
