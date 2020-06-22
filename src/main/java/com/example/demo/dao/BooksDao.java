package com.example.demo.dao;

import com.example.demo.entity.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;

import java.awt.print.Book;
import java.util.List;

/**
 * (Books)表数据库访问层
 *
 * @author makejava
 * @since 2020-01-29 14:49:16
 */
@Mapper
public interface BooksDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    List<Books> queryById();

    Boolean add(Books boks);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Books> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param books 实例对象
     * @return 对象列表
     */
    List<Books> queryAll(Books books);

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 影响行数
     */
    int insert(Books books);

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 影响行数
     */
    int update(Books books);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById(@Param("id") Integer id);

    /*
    * 登陆
    * */
    Books login(@Param("name") String name,@Param("age") String age);
}