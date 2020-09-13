package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.Users;
import com.imooc.pojo.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper extends MyMapper<Users> {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    List<Users> selectByExample(UsersExample example);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}