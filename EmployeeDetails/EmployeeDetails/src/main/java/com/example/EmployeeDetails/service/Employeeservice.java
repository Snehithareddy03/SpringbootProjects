package com.example.EmployeeDetails.service;

import com.example.EmployeeDetails.dto.Employeedto;
import com.example.EmployeeDetails.entity.Employee;

public interface Employeeservice {
    Employeedto saveEmployee(Employeedto employeedto);
    Employee getEmployee(Long employeeid);
}
