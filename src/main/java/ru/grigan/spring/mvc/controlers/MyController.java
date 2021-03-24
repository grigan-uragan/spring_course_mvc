package ru.grigan.spring.mvc.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.grigan.spring.mvc.models.Employee;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-det-view";
        } else {
            return "show-emp-det-view";
        }
    }
}
