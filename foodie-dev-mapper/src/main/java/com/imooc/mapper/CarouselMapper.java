package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.Carousel;
import com.imooc.pojo.CarouselExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface CarouselMapper<T> extends MyMapper<Carousel> {
    int countByExample(CarouselExample example);

    int deleteByExample(CarouselExample example);

    List<Carousel> selectByExample(CarouselExample example);

    int updateByExampleSelective(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByExample(@Param("record") Carousel record, @Param("example") CarouselExample example);
}