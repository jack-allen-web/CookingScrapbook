package com.jacksapps.cookingscrapbook.repository;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String username, String password) {
        return username.equalsIgnoreCase("jackallen")
                && password.equals("1234");
    }
}
