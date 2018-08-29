package com.atguigu.gmall.usermanage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.usermanage.mapper.UserAddressMapper;
import com.atguigu.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-22 20:41
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoMapper userInfoMapper;
   @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> getAllAddress() {
        return userAddressMapper.selectAll();
    }

    @Override
    public List<UserInfo> getUserInfoList() {
      List<UserInfo> userInfoList = userInfoMapper.selectAll();
        return userInfoList;
    }

    @Override
    public int insertUser(UserInfo userInfo) {
        return  userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public int deleteUserById(String userId) {
        return  userInfoMapper.deleteByPrimaryKey(userId);

    }

    @Override
    public int updateUserById(String userId, UserInfo userInfo) {
      return  userInfoMapper.updateByPrimaryKeySelective(userInfo);

    }

    @Override
    public UserInfo getUserInfoById(String userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<UserInfo> getUserInfoListForLike(String selectStr, String likeStr) {

        Example example = new Example(UserInfo.class);
        likeStr = "%"+likeStr+"%";
        example.createCriteria().andLike(selectStr,likeStr);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        System.out.println(likeStr+"--->"+selectStr);
        return userInfoList;
    }


}
