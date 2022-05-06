package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.Dept;
import com.web.paras.mani.pamani.dao.DeptJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("/api/v1/depts")
@RestController
public class DeptController {

    @Autowired
    DeptJdbcDao deptJdbcDao;

    @GetMapping
    public List<Dept> getDepts()
    {
        return  deptJdbcDao.getDepts();
    }


}
