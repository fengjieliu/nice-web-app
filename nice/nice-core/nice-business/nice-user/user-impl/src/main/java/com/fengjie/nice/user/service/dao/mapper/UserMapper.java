package com.fengjie.nice.user.service.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.fengjie.nice.user.service.dao.entity.UserEntity;
import com.fengjie.nice.user.service.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<UserEntity> {
    UserDTO detailById(@Param("id") Long id);
}
