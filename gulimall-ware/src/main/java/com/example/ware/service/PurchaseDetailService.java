package com.example.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-23 16:51:53
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

