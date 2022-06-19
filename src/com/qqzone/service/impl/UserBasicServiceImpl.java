package com.qqzone.service.impl;

import com.qqzone.dao.UserBasicDao;
import com.qqzone.pojo.*;
import com.qqzone.service.UserBasicService;

import java.util.List;
import java.util.*;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-19 2:06
 */
public class UserBasicServiceImpl implements UserBasicService {
    private UserBasicDao userBasicDao = null;
    @Override
    public UserBasic login(String loginId, String pwd) {
        //
        UserBasic userBasic = userBasicDao.getUserBasic(loginId, pwd);
//        UserBasic userBasic = userBasicDao.getUserBasic(loginId, pwd);
        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        List<UserBasic> userBasicList = userBasicDao.getUserBasicList(userBasic);
        List<UserBasic> friendList = new ArrayList<>(userBasicList.size());
        for(int i = 0; i < userBasicList.size() ; i ++){
            UserBasic friend = userBasicList.get(i);
            userBasicDao.getUserBasicById(friend.getId());
            friendList.add(friend);
        }
        return friendList;
    }
}
