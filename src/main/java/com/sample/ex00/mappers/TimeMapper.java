package com.sample.ex00.mappers;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("select now() ")
    //String getNow();
    String getTime();
}
