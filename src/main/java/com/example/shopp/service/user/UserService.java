package com.example.shopp.service.user;

import com.example.shopp.dto.UserCreateDto;
import com.example.shopp.entity.user.User;
import com.example.shopp.service.BaseService;

public interface UserService extends BaseService<User> {

    User SignIn(String email, String password);

    User SignUp(UserCreateDto userCreateDto);

}
