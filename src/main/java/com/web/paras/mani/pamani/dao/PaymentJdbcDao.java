package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Payment;
import com.web.paras.mani.pamani.db.InsertQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Payment> findAll()
    {
        String query = "Select * from Payments where rownum  <= 20";
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Payment>(Payment.class));
    }

    public List<Payment> findPaymentById(String paymentId)
    {
        String query = "Select *  from Payments where paymentId = ?";

        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Payment>(Payment.class),new Object[]{paymentId});
    }

    public void postPayment(Payment payment)
    {
        String query = InsertQuery.INSERT_PAYMENT;

        jdbcTemplate.update(query,payment.getPaymentID(),payment.getPaymentType(),payment.getAllowed());
    }
}
