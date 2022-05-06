package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Supplier;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SupplierJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Supplier> getSupplier()
    {
        String query = SelectQuery.GET_SUPPLIERS;

        return jdbcTemplate.query(query,new BeanPropertyRowMapper<Supplier>(Supplier.class));
    }

    public void setSupplier(Supplier supplier)
    {
        String query = InsertQuery.INSERT_SUPPLIER_NEW;
        jdbcTemplate.update(query,
                supplier.getSupplier(),
                supplier.getSupplierName(),
                supplier.getContactName(),
                supplier.getAddress(),
                supplier.getContactPhone(),
                supplier.getSupplierStatus(),
                supplier.getLang(),
                supplier.getEmail(),
                supplier.getFax(),
                supplier.getWebsite());
    }

}
