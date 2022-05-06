package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Product;
import com.web.paras.mani.pamani.bean.SkuPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class SkuPoolJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<SkuPool> generateSku()
    {
        String query = "Select SKU_SEQ.NEXTVAL sku from dual";
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<SkuPool>(SkuPool.class));
    }

}
