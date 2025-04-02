package com.mongo.employee.MongoEmployee.Repository;

import com.mongo.employee.MongoEmployee.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
