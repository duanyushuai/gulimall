package com.example.product.dao;

import com.example.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-22 21:34:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
