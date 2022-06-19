package com.qqzone.dao;
import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;

import java.util.*;
/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 20:28
 */
public interface TopicDao {
    public List<Topic> getTopicList(UserBasic user);
    public void addTopic(Topic topic);
    public void delTopic(Topic topic);
    Topic getTopic(Integer id);

}
