package com.example.EmployeeDetails.service.impl;

import com.example.EmployeeDetails.dto.Employeedto;
import com.example.EmployeeDetails.entity.Employee;
import com.example.EmployeeDetails.repository.EmployeeRepository;
import com.example.EmployeeDetails.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements Employeeservice {
    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employeedto saveEmployee(Employeedto employeedto){
        Employee employee = new Employee(
                employeedto.getEmployeeid(),
                employeedto.getName(),
                employeedto.getSalary()
        );
        Employee savedEmployee = (Employee) repository.save(employee);

        Employeedto saveemployee= new Employeedto(
                savedEmployee.getEmployeeid(),
                savedEmployee.getName(),
                savedEmployee.getSalary()
        );
        return saveemployee;
    }
    public Employee getEmployee(Long employeeid){
        return repository.findById(employeeid)
                .orElseThrow(()-> new RuntimeException("employee details not found"));
    }
    //public Employeedto updateEmployee(Long emp)
}
