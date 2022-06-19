package com.qqzone.pojo;

import java.sql.Date;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 18:17
 */
public class UserDetail {
    private Integer id;
    private String realName;
    private String email;
    private Date birth;
    private String star;

    public UserDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
}
