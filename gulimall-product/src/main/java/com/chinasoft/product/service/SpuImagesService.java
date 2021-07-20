package com.chinasoft.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasoft.common.utils.PageUtils;
import com.chinasoft.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author vanceChen
 * @email chen_wangsheng@sina.com
 * @date 2021-07-19 11:19:03
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

