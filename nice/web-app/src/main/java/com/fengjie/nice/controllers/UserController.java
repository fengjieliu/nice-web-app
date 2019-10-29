package com.fengjie.nice.controllers;

import com.fengjie.nice.user.service.api.IUserServiceApi;
import com.fengjie.nice.user.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private IUserServiceApi iUserServiceApi;

    @GetMapping("detail")
    public UserDTO UserDetail(){
        return iUserServiceApi.detial(1l);
    }
}
