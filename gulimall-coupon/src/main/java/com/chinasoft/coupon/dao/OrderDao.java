package com.chinasoft.coupon.dao;

import com.chinasoft.coupon.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 17:27:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
