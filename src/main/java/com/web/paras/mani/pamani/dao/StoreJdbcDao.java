package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Store;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Store> getStore()
    {
        String query = SelectQuery.GET_STORE;
        return jdbcTemplate.query(query,new BeanPropertyRowMapper<Store>(Store.class));
    }

    public void  setStore(Store store)
    {
        System.out.println(store);
        String query = InsertQuery.INSERT_STORE;
        jdbcTemplate.update(query,
                store.getStore(),
                store.getStoreName(),
                store.getStoreAddress(),
                store.getStorePhone(),
                store.getStoreEmail(),
                store.getStoreCity(),
                store.getStoreDistrict(),
                store.getStoreState(),
                store.getStoreZip(),
                store.getStoreCountry(),
                store.getLastUpdateDate()
                );
    }

}
