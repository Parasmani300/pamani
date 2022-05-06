package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Store;
import com.web.paras.mani.pamani.dao.StoreJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/store")
public class StoreController {

    @Autowired
    StoreJdbcDao storeJdbcDao;

    @GetMapping
    public List<Store> setStore()
    {
        return  storeJdbcDao.getStore();
    }

    @PostMapping
    public void setStore(@RequestBody Store store)
    {
        storeJdbcDao.setStore(store);
    }

}
