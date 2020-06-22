package com.example.demo.controller;

import com.example.demo.entity.Books;
import com.example.demo.service.BooksService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.util.List;

/**
 * (Books)表控制层
 *
 * @author makejava
 * @since 2020-01-29 14:49:16
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*",maxAge = 3600)
public class BooksController {
    /**
     * 服务对象
     */
    @Resource
    private BooksService booksService;

    /**
     * 通过主键查询单条数据
     *
     */
    @GetMapping("/selected")
    public List<Books> selectOne() {
        return booksService.queryById();
    }


    @GetMapping("/login")
    public Boolean login(@RequestParam("name") String name,@RequestParam("age") String age) {
        return this.booksService.login(name,age);
    }

    @PostMapping("/add")
    public Books add(@RequestBody Books boks) {
        return this.booksService.add(boks);
    }


    @PostMapping("/update")
    public Books update(@RequestBody Books boks) {
        return this.booksService.update(boks);
    }


    @PostMapping("/delete")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        return this.booksService.deleteById(id);
    }

    @PostMapping("/selectAll")
    public List<Books> selectAll() {
        return this.booksService.queryAllByLimit(0,3);
    }
}