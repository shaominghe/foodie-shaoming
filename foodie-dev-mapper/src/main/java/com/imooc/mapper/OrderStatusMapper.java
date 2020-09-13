package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.OrderStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderStatusMapper extends MyMapper<OrderStatus> {
    int countByExample(OrderStatusExample example);

    int deleteByExample(OrderStatusExample example);

    List<OrderStatus> selectByExample(OrderStatusExample example);

    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);
}