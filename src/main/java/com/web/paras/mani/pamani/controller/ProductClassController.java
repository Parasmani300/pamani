package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Dept;
import com.web.paras.mani.pamani.bean.ProductClass;
import com.web.paras.mani.pamani.dao.ProductClassJdbcDao;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/class")
public class ProductClassController {

    @Autowired
    ProductClassJdbcDao productClassJdbcDao;

    @PostMapping
    public List<ProductClass> getProductClass(@RequestBody Dept dept)
    {
        return  productClassJdbcDao.getProductClass(dept);
    }

}
