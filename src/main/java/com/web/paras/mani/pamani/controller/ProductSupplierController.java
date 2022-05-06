package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.ProductSupplier;
import com.web.paras.mani.pamani.dao.ProductSupplierJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/productSupplier")
public class ProductSupplierController {

    @Autowired
    ProductSupplierJdbcDao productSupplierJdbcDao;

    @GetMapping
    public List<ProductSupplier> getProductSupplier()
    {
        return productSupplierJdbcDao.getSupplier();
    }
}
