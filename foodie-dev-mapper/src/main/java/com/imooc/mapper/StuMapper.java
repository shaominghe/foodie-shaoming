package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.Stu;
import com.imooc.pojo.StuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper extends MyMapper<Stu> {
    int countByExample(StuExample example);

    int deleteByExample(StuExample example);

    List<Stu> selectByExample(StuExample example);

    int updateByExampleSelective(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByExample(@Param("record") Stu record, @Param("example") StuExample example);
}