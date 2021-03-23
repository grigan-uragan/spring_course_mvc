package ru.grigan.spring.mvc.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-emp-det-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails() {
        return "show-emp-det-view";
    }
}
