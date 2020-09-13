package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.OrderItems;
import com.imooc.pojo.OrderItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemsMapper extends MyMapper<OrderItems> {
    int countByExample(OrderItemsExample example);

    int deleteByExample(OrderItemsExample example);

    List<OrderItems> selectByExample(OrderItemsExample example);

    int updateByExampleSelective(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    int updateByExample(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);
}