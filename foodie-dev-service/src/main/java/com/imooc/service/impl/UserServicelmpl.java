package com.imooc.service.impl;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.pojo.UsersExample;
import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.DateUtil;
import com.imooc.utils.MD5Utils;
import com.imooc.utils.enums.Sex;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class UserServicelmpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    private Sid sid;


    private static final String USER_FACE = "http://122.152.205.72:88/group1/M00/00/05/CpoxxFw_8_qAIlFXAAAcIhVPdSg994.png";

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username){
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        Users users = usersMapper.selectOneByExample(usersExample);
       return  users==null ? false : true;
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users queryUserForLogin(String username, String password) {

//        try {
//            Thread.sleep(2500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);
        userCriteria.andEqualTo("password", password);

        Users result = usersMapper.selectOneByExample(userExample);

        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Users createUser(UserBO userBO){
        Users user = new Users();

        try {
            String userId = sid.nextShort();
            user.setUsername(userBO.getUsername());
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
            user.setUpdatedTime(new Date());
            user.setNickname(userBO.getUsername());
            user.setFace(USER_FACE);
            // 默认性别为 保密
            user.setSex(Sex.secret.type);
            user.setBirthday(DateUtil.stringToDate("1900-01-01"));

            user.setCreatedTime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        usersMapper.insert(user);

        return user;
    }
}
