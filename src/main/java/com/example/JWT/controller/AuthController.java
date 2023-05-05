package com.example.JWT.controller;

import com.example.JWT.form.LoginForm;
import com.example.JWT.form.SigninForm;
import com.example.JWT.jwt.JwtHolderDTO;
import com.example.JWT.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController( AuthService authService) {
        this.authService = authService;
    }
    @CrossOrigin
    @PostMapping("/register")
    public void register(@RequestBody @Valid SigninForm form) throws Exception{
        authService.register( form );
    }
    @CrossOrigin
    @PostMapping("/sign_in")
    public JwtHolderDTO login(@RequestBody @Valid LoginForm form){
        return authService.login( form );
    }

}