package com.example.CustomerDetails.controller;

import com.example.CustomerDetails.dto.CustomerDTO;
import com.example.CustomerDetails.entity.CustomerEntity;
import com.example.CustomerDetails.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {
    @Autowired
    private CustomerService customerservice;

    @PostMapping("/saveCustomer")
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerdto){
        CustomerDTO createdCustomer = customerservice.createCustomer(customerdto);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }
}
