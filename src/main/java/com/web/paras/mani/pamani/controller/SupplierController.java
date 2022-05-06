package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Supplier;
import com.web.paras.mani.pamani.dao.SupplierJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/suppliers")
public class SupplierController {
    @Autowired
    SupplierJdbcDao supplierJdbcDao;

    @GetMapping
    public List<Supplier> getSupplier()
    {
        return  supplierJdbcDao.getSupplier();
    }

    @PostMapping
    public void postSupplier(@RequestBody Supplier supplier)
    {
        supplierJdbcDao.setSupplier(supplier);
    }


}
