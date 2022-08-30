package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class UserController {

    @GetMapping("/user/add")
    public String displayAddUserForm(){
        return "user/add";
    }

    @PostMapping("/user/add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify){
        if(user.getPassword() == verify){
            return "user/index";
        }
        return "user/add";
    }

}
