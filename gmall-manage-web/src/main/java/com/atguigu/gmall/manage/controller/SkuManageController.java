package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.SkuInfo;
import com.atguigu.gmall.bean.SpuImage;
import com.atguigu.gmall.bean.SpuSaleAttr;
import com.atguigu.gmall.service.SkuInfoService;
import com.atguigu.gmall.service.SpuSaleAttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-28 19:17
 */
@Controller
public class SkuManageController {
    @Reference
    private SkuInfoService skuInfoService;
    @Reference
    private SpuSaleAttrService spuSaleAttrService;

    @RequestMapping("/spuImageList")
    @ResponseBody
    public List<SpuImage> getspuImageList(String spuId){
        return skuInfoService.getSpuImage(spuId);
    }


    @RequestMapping("/spuSaleAttrList")
    @ResponseBody
    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId){
        List<SpuSaleAttr> spuSaleAttrList = spuSaleAttrService.getSpuSaleAttrList(spuId);
        return spuSaleAttrList;
    }

    @RequestMapping(value = "saveSku",method = RequestMethod.POST)
    @ResponseBody
    public void saveSku(SkuInfo skuInfo){
        skuInfoService.saveSku(skuInfo);
    }
}
