package com.xuanzhe.springbootproj.controller;

import java.lang.ProcessBuilder.Redirect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
public class loginController {
  @RequestMapping("/user/login")
  public String login(@RequestParam("username") String username, @RequestParam String password, Model model){
    if(!(StringUtils.isEmpty(username)&&"123456".equals(password))){
      return "redirect:/main.html";
    }
    else{
      model.addAttribute("msg","Incorrect username and password");
      return "index";
    }
  }
}