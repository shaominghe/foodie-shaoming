package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.ItemsParam;
import com.imooc.pojo.ItemsParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsParamMapper extends MyMapper<ItemsParam> {
    int countByExample(ItemsParamExample example);

    int deleteByExample(ItemsParamExample example);

    List<ItemsParam> selectByExample(ItemsParamExample example);

    int updateByExampleSelective(@Param("record") ItemsParam record, @Param("example") ItemsParamExample example);

    int updateByExample(@Param("record") ItemsParam record, @Param("example") ItemsParamExample example);
}