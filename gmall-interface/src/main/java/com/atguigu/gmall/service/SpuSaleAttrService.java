package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.SpuSaleAttr;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-28 21:32
 */
public interface SpuSaleAttrService {

    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId);
}
