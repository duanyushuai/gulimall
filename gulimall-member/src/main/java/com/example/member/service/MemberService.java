package com.example.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author duan
 * @email sunlightcs@gmail.com
 * @date 2022-06-23 16:20:43
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

