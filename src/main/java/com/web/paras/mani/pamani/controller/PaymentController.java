package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Payment;
import com.web.paras.mani.pamani.dao.PaymentJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @Autowired
    PaymentJdbcDao paymentJdbcDao;

    @GetMapping
    public List<Payment> getPayments()
    {
        return  paymentJdbcDao.findAll();
    }

    @RequestMapping(value = "pay",method = RequestMethod.GET)
    public List<Payment> findPaymentById(@RequestParam String id)
    {
//        paymentJdbcDao.findPaymentById(id);
//        return "Hello WOrld" + id;
        return paymentJdbcDao.findPaymentById(id);
    }

    @PostMapping
    public void post(@RequestBody Payment payment)
    {
        paymentJdbcDao.postPayment(payment);
    }
}
