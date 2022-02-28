package com.shenyy.package1.controller;

import com.shenyy.package1.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {
    @Autowired
    Book book;
    @GetMapping("/book")
    public String book(){
        book.setPublicationDate(new Date());
        return book.toString();
    }
}
