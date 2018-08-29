package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author xiaos
 * @create 2018-08-27 12:55
 */
public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr> {
    // 写方法 ：根据spuId 查询SpuSaleAttr。 ..获取数据的时候使用get ,如果跟db进行交互查询select
    List<SpuSaleAttr> selectSpuSaleAttrList(Long spuId);
}
