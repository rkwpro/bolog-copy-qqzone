package com.qqzone.dao;

import com.qqzone.pojo.UserBasic;

import java.util.*;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 20:20
 */
public interface UserBasicDao {
    public com.qqzone.pojo.UserBasic getUserBasic(String loginId , String pwd);
    public List<UserBasic> getUserBasicList(UserBasic userBasic);
    UserBasic getUserBasicById(Integer Id);

}
