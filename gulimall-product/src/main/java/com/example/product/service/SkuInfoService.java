package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-22 21:34:48
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

