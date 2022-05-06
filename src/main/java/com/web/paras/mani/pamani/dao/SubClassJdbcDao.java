package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.ProductClass;
import com.web.paras.mani.pamani.bean.SubClass;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubClassJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<SubClass> getSubClass(ProductClass productClass)
    {
        System.out.println(productClass);
        String query = SelectQuery.GET_SUBCLASS;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<SubClass>(SubClass.class),new Object[]{productClass.getDept(),productClass.getProductClass()});
    }
}
