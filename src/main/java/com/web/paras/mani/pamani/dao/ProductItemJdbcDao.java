package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.ProductItem;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductItemJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductItem> getProductItem()
    {
        String query = SelectQuery.GET_PRODUCTS;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<ProductItem>(ProductItem.class));
    }

    public void setProductItem(ProductItem productItem)
    {
        String query = InsertQuery.INSERT_PRODUCT_ITEM;
        jdbcTemplate.update(query,
                    productItem.getSku(),
                    productItem.getSku_desc(),
                    productItem.getShort_desc(),
                    productItem.getDept(),
                    productItem.getProductClass(),
                    productItem.getSubClass(),
                    productItem.getLastUpdateDate()
                );
    }
}
