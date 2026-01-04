package com.example.CustomerDetails.controller;

import com.example.CustomerDetails.dto.CustomerDTO;
import com.example.CustomerDetails.entity.CustomerEntity;
import com.example.CustomerDetails.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerEntity> getCustomer(@PathVariable Long customerId){
        CustomerEntity getCustomer = customerservice.getCustomer(customerId);
        return new ResponseEntity<>(getCustomer,HttpStatus.OK);
    }
    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable Long customerId,@RequestBody CustomerDTO customerdto){
        CustomerDTO updateCustomer = customerservice.updateCustomer(customerId,customerdto);
        return new ResponseEntity<>(updateCustomer,HttpStatus.CREATED);
    }
}
