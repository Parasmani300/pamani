package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Product;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.ProductInfo;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getProducts()
    {
        String query = SelectQuery.GET_PRODUCTS_IN_STORE;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Product>(Product.class));
    }

    public void  setProduct(ProductInfo productInfo)
    {
        String upc_query =
                "";

    }
}
