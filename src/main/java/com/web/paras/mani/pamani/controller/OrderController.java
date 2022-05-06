package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Category;
import com.web.paras.mani.pamani.bean.Order;
import com.web.paras.mani.pamani.dao.CategoryJdbcDao;
import com.web.paras.mani.pamani.dao.OrderJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    OrderJdbcDao orderJdbcDao;


//    @PostMapping
//    public  Category post(@RequestBody Category category)
//    {
//        orderJdbcDao.postCategory(category);
//
//        return category;
//    }

    @GetMapping
    public List<Order> get()
    {
        List<Order> orderList = new ArrayList<>();
        orderList = orderJdbcDao.findAll();
        return  orderList;
    }

    @PostMapping
    public Order post(@RequestBody Order order)
    {
        orderJdbcDao.post(order);

        return order;
    }

}
