package com.chinasoft.product.dao;

import com.chinasoft.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 11:19:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}