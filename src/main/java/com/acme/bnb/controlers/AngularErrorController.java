package com.acme.bnb.controlers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularErrorController implements ErrorController  {

    @RequestMapping("/error")
    public String handleError() {
        return "forward:/index.html";
    }
}
