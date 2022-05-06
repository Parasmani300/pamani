package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.UPC;
import com.web.paras.mani.pamani.bean.UpcChecker;
import com.web.paras.mani.pamani.dao.UpcJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/upc")
public class UpcController {

    @Autowired
    UpcJdbcDao upcJdbcDao;

    @GetMapping
    public List<UPC> getUPC()
    {
        return upcJdbcDao.getUpc();
    }

    @RequestMapping(value = "/fresh",method = RequestMethod.POST)
    public UpcChecker checkFreshUpc(@RequestBody UpcChecker upcChecker)
    {
       boolean res =  upcJdbcDao.checkFreshUpc(upcChecker.getUpc());

       if(res == true)
       {
           return upcChecker;
       }else {
           upcChecker.setUpc("X");
           return  upcChecker;
       }
    }
}
