package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.ProductAttributes;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductAttributesJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductAttributes> getProductAttributes()
    {
        String query = SelectQuery.GET_PRODUCT_ATTRIBUTES;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<ProductAttributes>(ProductAttributes.class));
    }

    public void setProductAttributes(ProductAttributes productAttributes)
    {
        String query = InsertQuery.INSERT_PRODUCT_ATTRIBUTES;
        jdbcTemplate.update(query,
                productAttributes.getSku(),
                productAttributes.getSkuNotes(),
                productAttributes.getRating(),
                productAttributes.getColor(),
                productAttributes.getProductSize(),
                productAttributes.getSkuStatus(),
                productAttributes.getStreetDate(),
                productAttributes.getInStockDate(),
                productAttributes.getOutStockDate(),
                productAttributes.getMap(),
                productAttributes.getMapStartDate(),
                productAttributes.getMapEndDate(),
                productAttributes.getPerformanceCode(),
                productAttributes.getUrlSmall(),
                productAttributes.getUrlBig(),
                productAttributes.getLastUpdateDate()
                );
    }
}
