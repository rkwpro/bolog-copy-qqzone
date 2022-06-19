package com.qqzone.dao;

import com.qqzone.pojo.Reply;
import com.qqzone.pojo.Topic;

import java.util.*;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 20:34
 */
public interface ReplyDao {
    //获取指定日志的回复列表
    List<Reply> getReplyList(Topic topic);
    void addReply(Reply reply);
    void delReply(Integer id);


}
