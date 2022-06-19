package com.qqzone.service.impl;

import com.qqzone.dao.TopicDao;
import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;
import com.qqzone.service.TopicService;

import java.util.List;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-19 9:30
 */
public class TopicServiceImpl implements TopicService {
    private TopicDao topicDao = null;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDao.getTopicList(userBasic);

    }
}
