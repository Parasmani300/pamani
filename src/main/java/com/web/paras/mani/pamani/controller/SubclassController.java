package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.ProductClass;
import com.web.paras.mani.pamani.bean.SubClass;
import com.web.paras.mani.pamani.dao.SubClassJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/subclass")
public class SubclassController {

    @Autowired
    SubClassJdbcDao subClassJdbcDao;

    @PostMapping
    public List<SubClass> getSubclass(@RequestBody ProductClass productClass)
    {
        return subClassJdbcDao.getSubClass(productClass);
    }
}
