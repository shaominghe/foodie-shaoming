package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.ItemsSpec;
import com.imooc.pojo.ItemsSpecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsSpecMapper extends MyMapper<ItemsSpec> {
    int countByExample(ItemsSpecExample example);

    int deleteByExample(ItemsSpecExample example);

    List<ItemsSpec> selectByExample(ItemsSpecExample example);

    int updateByExampleSelective(@Param("record") ItemsSpec record, @Param("example") ItemsSpecExample example);

    int updateByExample(@Param("record") ItemsSpec record, @Param("example") ItemsSpecExample example);
}