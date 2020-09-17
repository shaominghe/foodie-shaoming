package com.imooc.mapper;

import com.imooc.pojo.ItemsParam;
import com.imooc.pojo.ItemsParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsParamMapper {
    int countByExample(ItemsParamExample example);

    int deleteByExample(ItemsParamExample example);

    int deleteByPrimaryKey(String id);

    int insert(ItemsParam record);

    int insertSelective(ItemsParam record);

    List<ItemsParam> selectByExample(ItemsParamExample example);

    ItemsParam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemsParam record, @Param("example") ItemsParamExample example);

    int updateByExample(@Param("record") ItemsParam record, @Param("example") ItemsParamExample example);

    int updateByPrimaryKeySelective(ItemsParam record);

    int updateByPrimaryKey(ItemsParam record);
}