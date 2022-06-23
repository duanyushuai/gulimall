package com.example.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-23 15:54:52
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

