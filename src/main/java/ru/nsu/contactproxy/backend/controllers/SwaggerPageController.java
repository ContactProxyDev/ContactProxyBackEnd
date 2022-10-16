package ru.nsu.contactproxy.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to OpenAPI api documentation
 */
@Controller
public class SwaggerPageController {

    @RequestMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
    }

}