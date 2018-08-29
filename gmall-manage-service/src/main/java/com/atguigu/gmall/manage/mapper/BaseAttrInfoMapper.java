package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.BaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-24 18:25
 */
public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {
    // 根据三级分类Id进行查询 List<BaseAttrInfo>
    List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(Long catalog3Id);
}
