package com.huan.dubbo.controller;

import com.huan.dubbo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yh
 * @date 2021-07-20 11:49
 * Utils: Intellij Idea
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    public String Test(Model model){
        String str = userService.hello("world");

        model.addAttribute("hello",str);
        return "test";
    }
}
