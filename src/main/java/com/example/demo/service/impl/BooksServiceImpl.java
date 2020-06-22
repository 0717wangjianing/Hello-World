package com.example.demo.service.impl;

import com.example.demo.entity.Books;
import com.example.demo.dao.BooksDao;
import com.example.demo.service.BooksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Books)表服务实现类
 *
 * @author makejava
 * @since 2020-01-29 14:49:16
 */
@Service("booksService")
public class BooksServiceImpl implements BooksService {
    @Resource
    private BooksDao booksDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    @Override
    public List<Books> queryById() {
        return booksDao.queryById();
    }

    /*
    * 登陆
    * */
    @Override public Boolean login(String name, String age) {
        Books ros=booksDao.login(name,age);
        return ros != null?true :false;
    }
    @Override
    public Books add(Books boks){
        booksDao.add(boks);
        return boks;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Books> queryAllByLimit(int offset, int limit) {
        return this.booksDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    @Override
    public Books insert(Books books) {
        this.booksDao.insert(books);
        return books;
    }

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    @Override
    public Books update(Books books) {
        this.booksDao.update(books);
        return books;
    }

    /**
     * 通过主键删除数据
     *
     * @param bookid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bookid) {
        return this.booksDao.deleteById(bookid) > 0;
    }
}