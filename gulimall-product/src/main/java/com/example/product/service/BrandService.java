package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-22 21:34:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

