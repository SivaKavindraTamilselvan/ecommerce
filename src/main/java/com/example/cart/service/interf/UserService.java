package com.example.cart.service.interf;

import com.example.cart.dto.LoginRequest;
import com.example.cart.dto.Response;
import com.example.cart.dto.UserDto;
import com.example.cart.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
