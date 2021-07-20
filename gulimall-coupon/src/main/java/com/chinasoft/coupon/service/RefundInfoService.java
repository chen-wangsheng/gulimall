package com.chinasoft.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasoft.common.utils.PageUtils;
import com.chinasoft.coupon.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 17:27:03
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

