package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.ProductStore;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductStoreJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ProductStore> getProductsInStore()
    {
        String query = SelectQuery.GET_PRODUCT_IN_STORE;
        return jdbcTemplate.query(query,new BeanPropertyRowMapper<ProductStore>(ProductStore.class));
    }

    public void setProductStore(ProductStore productStore)
    {
        String query = InsertQuery.INSERT_PRODUCT_IN_STORE;
        jdbcTemplate.update(query,
                productStore.getSku(),
                productStore.getStore(),
                productStore.getCoreSupplier(),
                productStore.getUnitRetail(),
                productStore.getStockOnHand(),
                productStore.getInTransitQty(),
                productStore.getTsfReservedQty(),
                productStore.getTsfExpectedQty(),
                productStore.getRtvQty(),
                productStore.getNonSellableQty(),
                productStore.getClearInd(),
                productStore.getTaxableInd(),
                productStore.getStatus(),
                productStore.getStatusUpdateDate(),
                productStore.getLastSalesExportDate(),
                productStore.getRepairServiceInd(),
                productStore.getUnitCost()
                );


    }

}
