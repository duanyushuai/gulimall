package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-22 21:34:49
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

