package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Order;
import com.web.paras.mani.pamani.bean.OrderDetails;
import com.web.paras.mani.pamani.dao.OrderDetailsJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/orderdetails")
public class OrderDetailsController {

    @Autowired
    OrderDetailsJdbcDao orderDetailsJdbcDao;

    @GetMapping
    public List<OrderDetails> getOrderDetails()
    {
        return orderDetailsJdbcDao.getOrderDetails();
    }

    @PostMapping
    public void postMapping(@RequestBody OrderDetails orderDetails)
    {
        orderDetailsJdbcDao.postOrderDetails(orderDetails);
    }
}
