package com.atguigu.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaos
 * @create 2018-08-23 20:00
 */
@Controller
public class ManageController {
    @RequestMapping(value = "/index" )
    public String index(){
        return "index";
    }


}

