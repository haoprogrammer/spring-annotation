package com.hao.persistence.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: haoprogrammer
 * @date: 2019/2/15 16:44
 * @version: 1.0
 */
//自定义逻辑需要返回的组件
public class MyImportSelector implements ImportSelector {

  //返回值，就是导入到容器中组件的全类名
  //AnnotationMetadata，当前标注@Import注解的类的所有注解信息
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //importingClassMetadata,方法不要返回null值

    return new String[]{"com.hao.persistence.entity.Red"};
  }
}