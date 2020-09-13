package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.Items;
import com.imooc.pojo.ItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsMapper extends MyMapper<Items> {
    int countByExample(ItemsExample example);

    int deleteByExample(ItemsExample example);

    List<Items> selectByExampleWithBLOBs(ItemsExample example);

    List<Items> selectByExample(ItemsExample example);

    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);
}