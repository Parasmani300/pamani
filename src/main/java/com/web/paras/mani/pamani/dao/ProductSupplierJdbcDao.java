package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.ProductSupplier;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductSupplierJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductSupplier> getSupplier()
    {
        String query = SelectQuery.GET_PRODUCT_SUPPLIER;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<ProductSupplier>(ProductSupplier.class));
    }

    public void setSupplier(ProductSupplier productSupplier)
    {
        String query = InsertQuery.INSERT_PRODUCT_SUPPLIER;
        jdbcTemplate.update(query,
                productSupplier.getSku(),
                productSupplier.getSupplier(),
                productSupplier.getPrimarySupplierInd(),
                productSupplier.getRtvInd(),
                productSupplier.getLastUpdateDate());
    }
}
