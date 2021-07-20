package com.chinasoft.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasoft.common.utils.PageUtils;
import com.chinasoft.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 11:19:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

