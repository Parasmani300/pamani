package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.ProductStore;
import com.web.paras.mani.pamani.dao.ProductStoreJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/productStore")
public class ProductStoreController {

    @Autowired
    ProductStoreJdbcDao productStoreJdbcDao;

    @GetMapping
    public List<ProductStore> getProductInStore()
    {
        return  productStoreJdbcDao.getProductsInStore();
    }
}
