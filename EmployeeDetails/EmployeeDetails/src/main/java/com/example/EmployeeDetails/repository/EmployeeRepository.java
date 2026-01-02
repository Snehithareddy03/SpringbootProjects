package com.example.EmployeeDetails.repository;

import com.example.EmployeeDetails.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByemployeeid(Long employeeid);
}
