package com.fengjie.nice.user.service.impl;

import com.fengjie.nice.user.service.api.IUserServiceApi;
import com.fengjie.nice.user.service.dao.mapper.UserMapper;
import com.fengjie.nice.user.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserServiceApi {

    @Autowired
    private UserMapper userMapper;

    public UserDTO detial(Long id) {
        UserDTO user = null;
        if (id != null) {
            user = userMapper.detailById(id);
        }
        return user;
    }
}
