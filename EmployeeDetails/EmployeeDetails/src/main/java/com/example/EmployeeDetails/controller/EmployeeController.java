package com.example.EmployeeDetails.controller;

import com.example.EmployeeDetails.dto.Employeedto;
import com.example.EmployeeDetails.entity.Employee;
import com.example.EmployeeDetails.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {
    @Autowired
    private Employeeservice employeeservice;
    @PostMapping("")
    public ResponseEntity<Employeedto> saveEmployee(@RequestBody Employeedto employeedto){
        Employeedto saveEmployee = employeeservice.saveEmployee(employeedto);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/{employeeid}")
    public ResponseEntity <Employee> findEmployee(@PathVariable Long employeeid){
        Employee employee = employeeservice.getEmployee(employeeid);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
    @PutMapping("/{employeeid}")
    public ResponseEntity<Employeedto> updateEmployee(@PathVariable Long employeeid,@RequestBody Employeedto employeedto){
        Employeedto UPDATED = employeeservice.updateEmployee(employeeid,employeedto);
        return  ResponseEntity.ok(UPDATED);
    }
    @DeleteMapping("/{employeeid}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long employeeid){
        employeeservice.deleteEmployee(employeeid);
        return ResponseEntity.ok("employee details deleted ");
    }
}
