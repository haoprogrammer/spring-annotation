package com.hao.persistence.config;

import com.hao.persistence.condition.MyConditional;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;

import static org.junit.Assert.*;

public class MainConfigTmportTest {

  private AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
      MainConfigTmport.class);

  @Test
  public void person() {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
        MainConfigTmport.class);
    Object person = annotationConfigApplicationContext.getBean("person");
    Object person2 = annotationConfigApplicationContext.getBean("person");

    System.out.println(person == person2);
  }

  @Test
  public void conditionTest() {

    printBeans(annotationConfigApplicationContext);
  }

  public void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
    String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
    for (String str : beanDefinitionNames) {
      System.out.println(str);
    }

  }
}