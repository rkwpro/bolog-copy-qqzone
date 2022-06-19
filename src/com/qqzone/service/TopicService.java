package com.qqzone.service;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-19 9:24
 */
import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;

import java.util.List;
public interface TopicService {

    List<Topic> getTopicList(UserBasic userBasic);
}
