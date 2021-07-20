package com.chinasoft.coupon.dao;

import com.chinasoft.coupon.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 17:27:04
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
