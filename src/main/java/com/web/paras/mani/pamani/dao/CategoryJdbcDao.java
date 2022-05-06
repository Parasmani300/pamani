package com.web.paras.mani.pamani.dao;

import com.web.paras.mani.pamani.bean.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Category> findAll()
    {
        String query = "Select * from Category where rownum <= 20";

        return  jdbcTemplate.query(query,new BeanPropertyRowMapper<Category>(Category.class));
    }

    public void postCategory(Category category)
    {
        String query = "Insert into Category(CATEGORYID,GETCATEGORYNAME,DESCRIPTION,PICTURE,ACTIVE) values (?,?,?,?,?)";

        jdbcTemplate.update(query,category.getCategoryId(),category.getGetCategoryName(),category.getDescription(),category.getPicture(),category.getActive());

    }
}
