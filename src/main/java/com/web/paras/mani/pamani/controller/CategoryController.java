package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Category;
import com.web.paras.mani.pamani.dao.CategoryJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    List<Category> categoryList;

    @Autowired
    CategoryJdbcDao categoryJdbcDao;

    public CategoryController(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @PostMapping
    public  Category post(@RequestBody Category category)
    {
        categoryJdbcDao.postCategory(category);

        return category;
    }

    @GetMapping
    public List<Category> get()
    {
        categoryList = categoryJdbcDao.findAll();
        return  categoryList;
    }

}
