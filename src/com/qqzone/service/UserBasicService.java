package com.qqzone.service;
import com.qqzone.pojo.*;


import java.util.*;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-19 2:01
 */
public interface UserBasicService {
    UserBasic login(String loginId,String pwd);
    List<UserBasic> getFriendList(UserBasic userBasic);

}
