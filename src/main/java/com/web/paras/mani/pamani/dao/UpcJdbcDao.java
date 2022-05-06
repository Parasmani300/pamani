package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.UPC;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UpcJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<UPC> getUpc()
    {
        String query = SelectQuery.GET_UPC;
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<UPC>(UPC.class));
    }

    public boolean checkFreshUpc(String upc)
    {
        List<UPC> checkDup = jdbcTemplate.query(SelectQuery.CHECK_DUP_UPC_EXISTS,new BeanPropertyRowMapper<UPC>(UPC.class),new Object[]{upc});

        if(checkDup.size() > 0)
            return  false;
        return  true;
    }

    public boolean setUpc(UPC upc)
    {
        String query = InsertQuery.INSERT_UPC_EAN;

        System.out.println(upc);

        List<UPC> checkDup = jdbcTemplate.query(SelectQuery.CHECK_DUP_UPC_EXISTS,new BeanPropertyRowMapper<UPC>(UPC.class),new Object[]{upc.getUpc()});
        System.out.println();
        String lUpc = upc.getUpc();
        if(checkDup.size() > 0 &&  lUpc.equals(checkDup.get(0).getUpc()))
        {
            return  false;
        }
        jdbcTemplate.update(query,
                upc.getUpc(),
                upc.getUpc_supplement(),
                upc.getSku(),
                upc.getUpc_desc(),
                upc.getPrimaryUpcInd(),
                upc.getUpcType(),
                upc.getManufacturer(),
                upc.getVarType());

        return  true;
    }
}
