package com.hao.persistence.entity;

/**
 * @author: haoprogrammer
 * @date: 2019/2/12 20:23
 * @version: 1.0
 */
public class Person {

  private String name;
  private String sex;

  public Person() {
  }

  public Person(String name, String sex) {
    this.name = name;
    this.sex = sex;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public String getSex() {
    return sex;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", sex='" + sex + '\'' +
        '}';
  }

}