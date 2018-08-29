package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.SpuSaleAttr;
import com.atguigu.gmall.manage.mapper.SpuSaleAttrMapper;
import com.atguigu.gmall.service.SpuSaleAttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-28 21:32
 */
@Service
public class SpuSaleAttrServiceImpl implements SpuSaleAttrService {
    @Autowired
    private SpuSaleAttrMapper spuSaleAttrMapper;


    @Override
    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId) {

        return spuSaleAttrMapper.selectSpuSaleAttrList(Long.parseLong(spuId));
    }
}
