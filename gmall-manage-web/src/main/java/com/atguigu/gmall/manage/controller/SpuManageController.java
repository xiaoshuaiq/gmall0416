package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuInfo;
import com.atguigu.gmall.service.SpuInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-25 19:43
 */
@Controller
public class SpuManageController {

    @Reference
    private SpuInfoService spuInfoService;

    @RequestMapping("/spuListPage")
    public String getSpuListPage(){
        return "spuListPage";
    }

    @RequestMapping("/spuList")
    @ResponseBody
    public List<SpuInfo> getSpuInfoListByCatalog3Id(String catalog3Id){
        SpuInfo spuInfo = new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);
        List<SpuInfo> spuInfoList = spuInfoService.getSpuInfoList(spuInfo);
        return spuInfoList;
    }

    @RequestMapping("/baseSaleAttrList")
    @ResponseBody
    public List<BaseSaleAttr> getBaseSaleAttr(){
        return spuInfoService.getBaseSaleAttr();
    }
    @RequestMapping("/saveSpuInfo")
    @ResponseBody
    public  void saveSpuInfo(SpuInfo spuInfo){
        spuInfoService.saveSpuInfo(spuInfo);
    }

}
