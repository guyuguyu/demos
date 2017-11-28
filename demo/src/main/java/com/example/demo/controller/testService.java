package com.example.demo.controller;


import com.example.demo.dao.gen.AbumMapper;
import com.example.demo.entity.gen.Abum;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class testService{
    @Resource
    private AbumMapper abumMapper;

    public Abum getAbum() {
        Abum abum = abumMapper.selectByPrimaryKey("25064798987226191");
        System.out.println(abum);
        return abum;
    }

}
