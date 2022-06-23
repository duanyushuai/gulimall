package com.example.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-23 16:51:52
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

