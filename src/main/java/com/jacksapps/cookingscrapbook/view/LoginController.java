package com.jacksapps.cookingscrapbook.view;

import com.jacksapps.cookingscrapbook.repository.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login")
    public String showLoginPage(ModelMap model) {
        return "login";
    }

//    @GetMapping(value = "/login")
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
//        boolean isValidUser = loginService.validateUser(name, password);
//
//        if (!isValidUser) {
//            model.put("error message", "Invalid Credentials");
//            return "login";
//        }
//
//        model.put("name", name);
//        model.put("password", password);
//
//        return "welcome";
//    }
}
