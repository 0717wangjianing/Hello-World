package com.example.demo.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Books)实体类
 *
 * @author makejava
 * @since 2020-01-29 14:49:16
 */
@Data
public class Books implements Serializable {
    private static final long serialVersionUID = 760483195773383315L;

    private Integer id;

    private String name;

    private Integer age;

    private String email;

}