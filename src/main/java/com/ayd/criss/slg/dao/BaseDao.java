package com.ayd.criss.slg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/26.
 * 基础dao，实现了获取session的方法
 */
public class BaseDao {

    @Resource
    private SessionFactory sessionFactory;

    /***
     * 获取session
     * @return  调用sessionFactory.getCurrentSession()方法
     */
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
