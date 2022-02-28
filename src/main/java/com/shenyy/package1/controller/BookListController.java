package com.shenyy.package1.controller;

import com.shenyy.package1.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController //@RestController组合注解代替@Controller和@ResponseBody
public class BookListController {
    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setAuthor("罗贯中");
        b1.setName("三国演义");
        b1.setPublicationDate(new Date());

        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("曹雪芹");
        b2.setName("红楼梦");
        b2.setPublicationDate(new Date());

        books.add(b1);
        books.add(b2);
// 以上构建返回数据

// 创建返回ModelAndView，设直视图名为books，返回数据为所创建的List集合
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
