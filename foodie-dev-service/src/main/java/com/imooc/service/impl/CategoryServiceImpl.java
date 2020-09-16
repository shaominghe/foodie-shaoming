package com.imooc.service.impl;

import com.imooc.mapper.CategoryMapper;
import com.imooc.pojo.Category;
import com.imooc.pojo.CategoryExample;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
   public  List<Category> queryAllRootCategory(){
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andTypeEqualTo(1);
        return   categoryMapper.selectByExample(categoryExample);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Category>  getSubCatList(Integer rootCatId){
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andTypeEqualTo(rootCatId);
        return   categoryMapper.selectByExample(categoryExample);
    }
 }
