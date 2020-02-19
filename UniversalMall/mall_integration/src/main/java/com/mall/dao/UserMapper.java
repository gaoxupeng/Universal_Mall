package com.mall.dao;

import com.mall.model.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author gxp
 * @since 2020-02-19
 */
@Mapper
public interface UserMapper extends BaseMapper<TbUser> {

}
