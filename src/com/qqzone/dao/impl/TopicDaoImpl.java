package com.qqzone.dao.impl;
import com.myssm.basedao.BaseDAO;
import com.qqzone.dao.TopicDao;
import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;

import java.util.*;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 22:19
 */
public class TopicDaoImpl extends BaseDAO<Topic> implements TopicDao {

    @Override
    public List<Topic> getTopicList(UserBasic user) {
        String sql = "select * from t_topic where author = ?";
        return super.executeQuery(sql,user.getId());
    }

    @Override
    public void addTopic(Topic topic) {
        String sql = "";
    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic(Integer id) {
        return null;
    }
}
