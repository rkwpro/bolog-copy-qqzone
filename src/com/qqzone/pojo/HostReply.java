package com.qqzone.pojo;

import java.util.Date;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 18:19
 */
public class HostReply {
    private Integer id;
    private String content;
    private Date hostReplyDate;
    private UserBasic author;
    private Reply reply;

    public HostReply() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getHostReplyDate() {
        return hostReplyDate;
    }

    public void setHostReplyDate(Date hostReplyDate) {
        this.hostReplyDate = hostReplyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}
