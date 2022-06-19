package com.qqzone.controller;

import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;
import com.qqzone.service.TopicService;
import com.qqzone.service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-19 9:56
 */
public class UserController {
    private UserBasicService userBasicService ;
    private TopicService topicService;
    public String login(String loginId, String pwd , HttpSession session){
        UserBasic userBasic = userBasicService.login(loginId, pwd);



        if(userBasic!=null){
            List<UserBasic> friendList = userBasicService.getFriendList(userBasic);
            List<Topic> topicList = topicService.getTopicList(userBasic);
            userBasic.setFriendList(friendList);
            session.setAttribute("userBasic",userBasic);

            return "index";
        }
        else{
            return "login";
        }

    }
}
