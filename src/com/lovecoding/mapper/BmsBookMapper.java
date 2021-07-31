package com.lovecoding.mapper;

import com.lovecoding.pojo.BmsBook;

public interface BmsBookMapper {

    Integer deleteBookById(Integer id);

    BmsBook getBookById(int i);
}
