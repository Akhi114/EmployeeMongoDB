package com.mongo.employee.MongoEmployee.Controller;

import com.mongo.employee.MongoEmployee.Model.Employee;
import com.mongo.employee.MongoEmployee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeViewController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        List<Employee> employees = service.getAllEmployee();
        model.addAttribute("employees", employees);
        return "index";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        service.addEmployee(employee);
        return "redirect:/";  // Redirects back to the landing page
    }
}
