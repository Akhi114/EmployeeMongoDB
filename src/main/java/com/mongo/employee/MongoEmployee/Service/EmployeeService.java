package com.mongo.employee.MongoEmployee.Service;

import com.mongo.employee.MongoEmployee.Model.Employee;
import com.mongo.employee.MongoEmployee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return repository.findById(id);
    }
}
