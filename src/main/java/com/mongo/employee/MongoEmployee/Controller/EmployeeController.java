package com.mongo.employee.MongoEmployee.Controller;

import com.mongo.employee.MongoEmployee.Model.Employee;
import com.mongo.employee.MongoEmployee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Save Employee
    @PostMapping("/add")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    // Get all Employees
    @GetMapping("/displayAll")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployee();
    }

    // Get Employee by Id
    @GetMapping("/display/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return service.getEmployeeById(id);
    }
}
