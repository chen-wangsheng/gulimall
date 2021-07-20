package com.chinasoft.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasoft.common.utils.PageUtils;
import com.chinasoft.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 11:19:03
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

