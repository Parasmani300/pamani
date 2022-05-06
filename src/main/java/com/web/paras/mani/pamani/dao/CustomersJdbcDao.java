package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Customers;
import com.web.paras.mani.pamani.db.InsertQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomersJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Customers> getCustomers()
    {
        String query = "Select * from Customers";
        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Customers>(Customers.class));
    }

    public void postCustomer(Customers customers)
    {
        String query = InsertQuery.INSERT_CUSTOMERS;
        jdbcTemplate.update(query,
                customers.getCustomerID(),
                customers.getFirstName(),
                customers.getLastName(),
                customers.getCustomerClass(),
                customers.getRoom(),
                customers.getBuilding(),
                customers.getAddress1(),
                customers.getAddress2(),
                customers.getCity(),
                customers.getState(),
                customers.getPostalCode(),
                customers.getCountry(),
                customers.getPhone(),
                customers.getEmail(),
                customers.getVoiceMail(),
                customers.getPassword(),
                customers.getCreditCard(),
                customers.getCreditCardTypeID(),
                customers.getCardExpMo(),
                customers.getCardExpYr(),
                customers.getBillingAddress(),
                customers.getBillingCity(),
                customers.getBillingRegion(),
                customers.getBillingPostalCode(),
                customers.getBillingCountry(),
                customers.getShipAddress(),
                customers.getShipCity(),
                customers.getShipRegion(),
                customers.getShipPostalCode(),
                customers.getShipCountry(),
                customers.getDateEntered()
                );
    }

}
