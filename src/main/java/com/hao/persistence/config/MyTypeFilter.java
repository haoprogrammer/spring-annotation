package com.hao.persistence.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import javax.swing.text.TabableView;
import java.io.IOException;

/**
 * @author: haoprogrammer
 * @date: 2019/2/14 17:12
 * @version: 1.0
 */
public class MyTypeFilter implements TypeFilter {

  /**
   * @description:
   * @param: [metadataReader, 读取到当前正在扫描的类的信息 metadataReaderFactory,可以获取到其他类信息
   * @return: boolean
   * @auther: haoprogrammer
   * @date: 2019/2/14 17:13
   */
  public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
      throws IOException {
    //获取当前类注解的信息
    AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
    //获取当前正在扫描的类的信息
    ClassMetadata classMetadata = metadataReader.getClassMetadata();
    //获取当前类资源
    Resource resource = metadataReader.getResource();
    String className = classMetadata.getClassName();
    System.out.println("MyTypeFilter:" + className);

    if (className.contains("er")) {
      return true;
    }

    return false;
  }
}