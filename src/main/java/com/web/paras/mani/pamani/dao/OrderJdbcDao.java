package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Order;
import com.web.paras.mani.pamani.db.InsertQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Order> findAll()
    {
        String query = "Select * from Orders where rownum <= 20";

        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Order>(Order.class));
    }

    public void post(Order order)
    {
        String query = InsertQuery.INSERT_IN_ORDER;

        jdbcTemplate.update(query,
                order.getOrderId(),
                order.getCustomerId(),
                order.getOrderNumber(),
                order.getPaymentId(),
                order.getOrderDate(),
                order.getShipDate(),
                order.getRequiredDate(),
                order.getShipperId(),
                order.getFreight(),
                order.getSaleTax(),
                order.getTranscatStatus(),
                order.getErrLoc(),
                order.getErrMsg(),
                order.getFulfiled(),
                order.getDeleted(),
                order.getPaid(),
                order.getPaymentDate()
                );
    }

}
