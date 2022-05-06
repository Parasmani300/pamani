package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Customers;
import com.web.paras.mani.pamani.dao.CustomersJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customers")
public class CustomersController {

    @Autowired
    CustomersJdbcDao customersJdbcDao;

    @GetMapping
    public List<Customers> getCustomers()
    {
        return customersJdbcDao.getCustomers();
    }

    @PostMapping
    public void postCustomers(@RequestBody Customers customers)
    {
        customersJdbcDao.postCustomer(customers);
    }

    @CrossOrigin
    @RequestMapping

    public static class ProductItemController {
    }
}
