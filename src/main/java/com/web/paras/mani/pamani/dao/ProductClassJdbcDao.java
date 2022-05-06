package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Dept;
import com.web.paras.mani.pamani.bean.ProductClass;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductClassJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductClass> getProductClass(Dept dept)
    {
        String query = SelectQuery.GET_CLASS;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<ProductClass>(ProductClass.class),new Object[]{dept.getDept()});
    }
}
