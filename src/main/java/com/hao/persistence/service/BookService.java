package com.hao.persistence.service;

import com.hao.persistence.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: haoprogrammer
 * @date: 2019/2/14 14:50
 * @version: 1.0
 */
@Service
public class BookService {

  @Autowired
  private BookDao bookDao;
}