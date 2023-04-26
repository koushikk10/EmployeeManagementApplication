package com.koushik.employee.services;

import com.koushik.employee.model.Employee;

import java.util.List;

//Business logic
public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
