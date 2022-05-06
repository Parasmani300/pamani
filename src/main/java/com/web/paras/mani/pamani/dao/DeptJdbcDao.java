package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Dept;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeptJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Dept> getDepts()
    {
        String query = SelectQuery.GET_DEPT;

        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Dept>(Dept.class));
    }

    public void setDept(Dept dept)
    {
        System.out.println("Set Dept");
    }
}

