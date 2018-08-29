package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-22 23:09
 */
@Controller
public class OrderController {

/*      @Autowired
//    @Reference
    private UserAddressService userAddressService;*/
    @Reference
    private UserInfoService userInfoService;

    /**
     * 查询所有的用户地址
     * @return
     */
    @RequestMapping("/getAllAddress")
    @ResponseBody
    public List<UserAddress> getAllAddress(){
       return userInfoService.getAllAddress();
    }

}
