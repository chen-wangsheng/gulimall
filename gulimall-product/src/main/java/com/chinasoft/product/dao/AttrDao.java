package com.chinasoft.product.dao;

import com.chinasoft.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 11:19:04
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
