package com.chinasoft.coupon.dao;

import com.chinasoft.coupon.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 17:27:03
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
