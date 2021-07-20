package com.chinasoft.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasoft.common.utils.PageUtils;
import com.chinasoft.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 11:19:03
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

