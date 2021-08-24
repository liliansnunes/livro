package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestedMethod;

    @Controller
public class HomeController{
    @RequestMapping(method=RequestedMethod.GET)
    public String index(){
        return "home/index.jsp";
    }
}