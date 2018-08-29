package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-22 21:00
 */
public interface UserInfoService {

    List<UserAddress> getAllAddress() ;

    List<UserInfo> getUserInfoList();

    int insertUser(UserInfo userInfo);

    int deleteUserById(String userId);

    int updateUserById(String userId ,UserInfo userInfo);

    UserInfo getUserInfoById(String userId);

    public List<UserInfo> getUserInfoListForLike(String selectStr,String likeStr);
}
