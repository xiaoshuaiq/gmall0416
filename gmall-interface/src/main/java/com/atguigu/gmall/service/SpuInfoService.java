package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuInfo;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-25 20:39
 */
public interface SpuInfoService {

    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    public List<BaseSaleAttr> getBaseSaleAttr();

    void saveSpuInfo(SpuInfo spuInfo);
}
