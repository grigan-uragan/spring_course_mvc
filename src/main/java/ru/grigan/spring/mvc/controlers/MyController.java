package ru.grigan.spring.mvc.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.grigan.spring.mvc.models.Employee;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-det-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails() {
//        return "show-emp-det-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails(HttpServletRequest request, Model model) {
//        String name = request.getParameter("employeeName");
//        String result = "Mr. " + name;
//        model.addAttribute("attributeName", result);
//        return "show-emp-det-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee") Employee employee) {
        return "show-emp-det-view";
    }
}
