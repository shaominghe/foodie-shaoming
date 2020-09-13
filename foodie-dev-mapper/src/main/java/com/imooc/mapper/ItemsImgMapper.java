package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.ItemsImg;
import com.imooc.pojo.ItemsImgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsImgMapper extends MyMapper<ItemsImg> {
    int countByExample(ItemsImgExample example);

    int deleteByExample(ItemsImgExample example);

    List<ItemsImg> selectByExample(ItemsImgExample example);

    int updateByExampleSelective(@Param("record") ItemsImg record, @Param("example") ItemsImgExample example);

    int updateByExample(@Param("record") ItemsImg record, @Param("example") ItemsImgExample example);
}