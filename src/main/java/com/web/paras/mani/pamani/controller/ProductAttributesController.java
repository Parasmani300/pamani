package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.ProductAttributes;
import com.web.paras.mani.pamani.dao.ProductAttributesJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/productAttributes")
public class ProductAttributesController {

    @Autowired
    ProductAttributesJdbcDao productAttributesJdbcDao;

    @GetMapping
    public List<ProductAttributes> getProductAttributes()
    {
        return  productAttributesJdbcDao.getProductAttributes();
    }
}
