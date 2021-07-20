package com.chinasoft.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasoft.common.utils.PageUtils;
import com.chinasoft.coupon.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 17:27:04
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

