package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author xiaos
 * @create 2018-08-23 21:14
 */
@Controller
public class AttrManageController {
    @Reference
    private ManageService manageService;


    @RequestMapping(value = "/attrListPage" )
    public String attrListPage(){
        return "attrListPage";
    }

    /**
     * 查询所有的一级分类内容
     * @return
     */
    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getBaseCatalog1(){
        List<BaseCatalog1> baseCatalog1List = manageService.getCatalog1();
        return  baseCatalog1List ;
    }
    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getBaseCatalog2(String catalog1Id){
        List<BaseCatalog2> baseCatalog2List = manageService.getCatalog2(catalog1Id);
        return  baseCatalog2List ;
    }
    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getBaseCatalog3(String catalog2Id){
        List<BaseCatalog3> baseCatalog3List = manageService.getCatalog3(catalog2Id);
        return  baseCatalog3List ;
    }
    /***
     * 获得属性列表
     * @param
     * @return
     */
    @RequestMapping("/attrInfoList")
    @ResponseBody
    public List<BaseAttrInfo>  attrInfoList (String catalog3Id){
        List<BaseAttrInfo> attrList = manageService.getAttrList(catalog3Id);
        return attrList;
    }
    @RequestMapping("/getAttrValueList")
    @ResponseBody
    public List<BaseAttrValue> getAttrValueList(String attrId){
        BaseAttrInfo baseAttrInfo = manageService.getAttrValueList(attrId);
        return baseAttrInfo.getAttrValueList();
    }
    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo){
        manageService.saveAttrInfo(baseAttrInfo);

    }
    @RequestMapping("/delAttrInfo")
    @ResponseBody
    public void delAttrInfo(String attrId){
        manageService.delAttrInfo(attrId);

    }
}
