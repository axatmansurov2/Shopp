package com.example.shopp.controller;

import com.example.shopp.entity.user.User;
import com.example.shopp.repository.UserRepository;
import com.example.shopp.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private UserService userService;


    @GetMapping("/sign-in")
    public String SignIn(
            @RequestParam String email,
            @RequestParam String password,
            Model model
    ){
        User user = userService.SignIn(email, password);
        if(user!= null){
          model.addAttribute("userId",user.getId());
          return "menu";
      }
        return "sign-in";
    }



}
