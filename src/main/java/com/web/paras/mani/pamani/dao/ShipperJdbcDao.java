package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Category;
import com.web.paras.mani.pamani.bean.Shipper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShipperJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Shipper> findAll()
    {
        String query = "Select * from Shipper where rownum <= 20";

        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Shipper>(Shipper.class));
    }

    public void postShipper(Shipper shipper)
    {
        String query = "Insert into Shipper(shipperId,shipperName,price) values (?,?,?)";
        jdbcTemplate.update(query,shipper.getShipperId(),shipper.getShipperName(),shipper.getPrice());
    }
}
