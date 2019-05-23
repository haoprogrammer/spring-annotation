package com.hao.persistence.config;

import com.hao.persistence.entity.Person;
import com.hao.persistence.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author: haoprogrammer
 * @date: 2019/2/12 20:22
 * @version: 1.0
 */
//包扫描
@ComponentScan(
        value = "com.hao.persistence",excludeFilters = {
        @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
        @ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
        })
//定义配置类，可替换xml文件
@Configuration
//excludeFilters = Filter[],指定扫描组件的时候按照一定规则过滤某些组件
//includeFilters = Filter[],指定扫描的时候只需要哪些组件
//FilterType.ANNOTATION，按照注释
//FilterType.ASSIGNABLE_TYPE,按照给定的类型
//FilterType.ASPECT,按照ASPECT表达式
//FilterType.REGEX,使用正则
//FilterType.CUSTOM,只用自定义规则
public class MainConfig {

    //Ioc容器中注入bean对象
    @Bean("person")
    public Person person1(){
        return new Person("allen","man");
    }



}