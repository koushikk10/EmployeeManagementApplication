package com.koushik.employee.services;

import com.koushik.employee.model.Employee;

import java.util.List;

//Business logic
public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
