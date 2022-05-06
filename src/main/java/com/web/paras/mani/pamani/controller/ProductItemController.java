package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.ProductItem;
import com.web.paras.mani.pamani.dao.ProductItemJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/items")
public class ProductItemController {

    @Autowired
    ProductItemJdbcDao productItemJdbcDao;

    @GetMapping
    public List<ProductItem> getProductItem()
    {
        return  productItemJdbcDao.getProductItem();
    }
}
