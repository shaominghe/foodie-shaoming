package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.UserAddress;
import com.imooc.pojo.UserAddressExample;
import com.imooc.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAddressMapper extends MyMapper<UserAddress> {
    int countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    List<UserAddress> selectByExample(UserAddressExample example);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);
}