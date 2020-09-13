package com.imooc.service;

import com.imooc.pojo.Stu;

public interface StuService {
     Stu getStuInfo(int id);
     void saveStu();
     void updateStu(int id);
     void saveChildren();
     void saveParent();

}
