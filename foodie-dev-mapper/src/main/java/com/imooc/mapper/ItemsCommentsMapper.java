package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.ItemsComments;
import com.imooc.pojo.ItemsCommentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsCommentsMapper extends MyMapper<ItemsComments> {
    int countByExample(ItemsCommentsExample example);

    int deleteByExample(ItemsCommentsExample example);

    List<ItemsComments> selectByExample(ItemsCommentsExample example);

    int updateByExampleSelective(@Param("record") ItemsComments record, @Param("example") ItemsCommentsExample example);

    int updateByExample(@Param("record") ItemsComments record, @Param("example") ItemsCommentsExample example);
}