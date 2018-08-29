package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.SkuInfo;
import com.atguigu.gmall.bean.SpuImage;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-28 18:08
 */
public interface SkuInfoService {

    public List<SpuImage> getSpuImage(String spuId);

    void saveSku(SkuInfo skuInfo);
}
