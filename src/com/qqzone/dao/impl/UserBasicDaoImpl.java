package com.qqzone.dao.impl;

import com.myssm.basedao.BaseDAO;
import com.qqzone.dao.UserBasicDao;
import com.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author rkwpro
 * @email rkwpro@163.com
 * @create 2022-06-18 20:59
 */
public class UserBasicDaoImpl extends BaseDAO<UserBasic> implements UserBasicDao {

    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        String sql = "select * from t_user_basic where loginId = ? and pwd = ? ";
        return super.load(sql,loginId,pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "select fid from t_friend where uid = ?";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer Id) {
        String sql = "select * from t_user_basic where id = ?";
        return load(sql,Id);
    }
}
