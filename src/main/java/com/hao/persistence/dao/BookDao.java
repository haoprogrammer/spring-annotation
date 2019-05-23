package com.hao.persistence.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: haoprogrammer
 * @date: 2019/2/14 14:50
 * @version: 1.0
 */
@Repository
public class BookDao {

    private String name = "Java";

    public BookDao(String name) {
        this.name = name;
    }

    public BookDao() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "name='" + name + '\'' +
                '}';
    }
}