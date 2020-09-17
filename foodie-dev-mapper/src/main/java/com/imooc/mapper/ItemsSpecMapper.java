package com.imooc.mapper;

import com.imooc.pojo.ItemsSpec;
import com.imooc.pojo.ItemsSpecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsSpecMapper {
    int countByExample(ItemsSpecExample example);

    int deleteByExample(ItemsSpecExample example);

    int deleteByPrimaryKey(String id);

    int insert(ItemsSpec record);

    int insertSelective(ItemsSpec record);

    List<ItemsSpec> selectByExample(ItemsSpecExample example);

    ItemsSpec selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemsSpec record, @Param("example") ItemsSpecExample example);

    int updateByExample(@Param("record") ItemsSpec record, @Param("example") ItemsSpecExample example);

    int updateByPrimaryKeySelective(ItemsSpec record);

    int updateByPrimaryKey(ItemsSpec record);
}