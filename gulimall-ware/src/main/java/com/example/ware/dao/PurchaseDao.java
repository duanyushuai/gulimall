package com.example.ware.dao;

import com.example.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-23 16:51:53
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
