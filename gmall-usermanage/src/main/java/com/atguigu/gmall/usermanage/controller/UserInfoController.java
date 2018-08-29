package com.atguigu.gmall.usermanage.controller;

import com.atguigu.gmall.service.UserInfoService;
import com.atguigu.gmall.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-22 18:10
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping(value = "/getAllUserList" ,method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> getAllUserInfo(){
       return  userInfoService.getUserInfoList();
    }
    /**
     * 根据Id查询用户
     */
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public UserInfo getUserInfoById(String userId){
       return userInfoService.getUserInfoById(userId);
    }
    /**
     * 根据id删除用户
     */
    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    public int deleteUserInfo(String userId){
        return userInfoService.deleteUserById(userId);
    }

    /**
     * 根据用户Id修改用户
     */
    @RequestMapping(value = "/updateUserById", method = RequestMethod.POST)
    @ResponseBody
    public int updateUserInfoById(UserInfo userInfo) {
        return  userInfoService.updateUserById(userInfo.getId(),userInfo);

    }

    /**
     * 插入用户
     * @param userInfo
     */
    @RequestMapping(value = "/insertUser",method = RequestMethod.PUT)
    @ResponseBody
    public int insertUser(UserInfo userInfo){
        return  userInfoService.insertUser(userInfo);
    }


    @RequestMapping(value = "/getUserListLike/{selectStr}/{likeStr}")
    @ResponseBody
    public List<UserInfo> getUserListLike(@PathVariable("selectStr") String selectStr , @PathVariable("likeStr") String likeStr){
       return  userInfoService.getUserInfoListForLike(selectStr , likeStr);
    }
}
