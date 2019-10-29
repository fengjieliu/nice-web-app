package com.fengjie.nice.user.service.api;

import com.fengjie.nice.user.service.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

public interface IUserServiceApi {

    UserDTO detial(@Param("id") Long id);
}
