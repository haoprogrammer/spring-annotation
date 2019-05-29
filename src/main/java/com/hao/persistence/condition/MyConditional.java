package com.hao.persistence.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: haoprogrammer
 * @date: 2019/2/15 15:51
 * @version: 1.0
 */
public class MyConditional implements Condition {

  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    //1.获取到ioc使用的beanFactory
    ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
    //2.获取类加载器
    ClassLoader classLoader = context.getClassLoader();
    //3.获取当前环境信息
    Environment environment = context.getEnvironment();
    //4.获取bean定义的注册类
    BeanDefinitionRegistry registry = context.getRegistry();

    String env = environment.getProperty("os.name");
    System.out.println("系统环境为：" + env);
    boolean person = registry.containsBeanDefinition("person");
    //系统是windows环境,才能加载Bean到spring容器中
    if (env.contains("linux")) {
      return true;
    }
    return false;
  }
}