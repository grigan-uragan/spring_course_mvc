package ru.grigan.spring.mvc.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

//    @RequestMapping("/showDetails")
//    public String showDetails() {
//        return "show-emp-det-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String name = request.getParameter("employeeName");
        String result = "Mr. " + name;
        model.addAttribute("attributeName", result);
        return "show-emp-det-view";
    }
}
