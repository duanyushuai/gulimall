package com.example.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-23 16:48:57
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

