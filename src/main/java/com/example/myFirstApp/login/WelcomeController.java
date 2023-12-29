package com.example.myFirstApp.login;

import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.slf4j.Logger;

@Controller
public class WelcomeController {
    private Logger logger = LoggerFactory.getLogger(getClass()); //        logger.info(name);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String goToWelcomePage(ModelMap modelMap){ //@RequestParam String name, ModelMap model
        modelMap.put("name",getLoggedInUsername());

        return "welcomePage";
    }
    private String getLoggedInUsername(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();

    }

}


//    @RequestMapping(value = "login",method = RequestMethod.POST)
//    public String goToWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap modelMap){
//        if(authenticationService.authenticate(name,password)){
//            modelMap.put("name",name);
//            return "welcomePage";
//        }
//        modelMap.put("errorMessage","invalid Credentials");
//        return "login";
//    }