package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.OrderDetails;
import com.web.paras.mani.pamani.db.InsertQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDetailsJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<OrderDetails> getOrderDetails()
    {
        String query = "Select * from OrderDetails";

        return jdbcTemplate.query(query,new BeanPropertyRowMapper<OrderDetails>(OrderDetails.class));
    }

    public void postOrderDetails(OrderDetails orderDetails)
    {
        String query = InsertQuery.INSERT_ORDERDETAILS;

        jdbcTemplate.update(query,
                orderDetails.getOrderID(),
                orderDetails.getProductID(),
                orderDetails.getProductID(),
                orderDetails.getPrice(),
                orderDetails.getQuantity(),
                orderDetails.getDiscount(),
                orderDetails.getTotal(),
                orderDetails.getIdSku(),
                orderDetails.getOrderSize(),
                orderDetails.getColor(),
                orderDetails.getFulfilled(),
                orderDetails.getShipDate(),
                orderDetails.getOrderDetailId(),
                orderDetails.getBillDate()
                );
    }



}
