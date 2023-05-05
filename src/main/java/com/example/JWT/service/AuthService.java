package com.example.JWT.service;

import com.example.JWT.form.LoginForm;
import com.example.JWT.form.SigninForm;
import com.example.JWT.jwt.JwtHolderDTO;

public interface AuthService {

    void register(SigninForm form);

    JwtHolderDTO login(LoginForm form );

}
