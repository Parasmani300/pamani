package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Shipper;
import com.web.paras.mani.pamani.dao.ShipperJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/shipper")
public class ShipperController {

    @Autowired
    ShipperJdbcDao shipperJdbcDao;

    @GetMapping
    public List<Shipper>  getShipper()
    {
        List<Shipper> shipperList = new ArrayList<>();

        shipperList = shipperJdbcDao.findAll();
        return shipperList;
    }

    @PostMapping
    public  void postShipper(@RequestBody Shipper shipper)
    {
        shipperJdbcDao.postShipper(shipper);
    }
}
