package com.hao.persistence.controller;

import com.hao.persistence.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: haoprogrammer
 * @date: 2019/2/14 14:50
 * @version: 1.0
 */
@Controller
public class BookController {

  @Autowired
  private BookService bookService;
}