package com.example.CustomerDetails.service.impl;

import com.example.CustomerDetails.dto.CustomerDTO;
import com.example.CustomerDetails.entity.CustomerEntity;
import com.example.CustomerDetails.repository.CustomerRepository;
import com.example.CustomerDetails.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceimpl implements CustomerService {
    @Autowired
    private CustomerRepository repo;
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerdto){
        CustomerEntity customer = new CustomerEntity(
                customerdto.getCustomerId(),
                customerdto.getName(),
                customerdto.getNumber(),
                customerdto.getAmount()
        );
        CustomerEntity createdCustomer = (CustomerEntity) repo.save(customer);

        CustomerDTO createCustomer = new CustomerDTO(
                createdCustomer.getCustomerId(),
                createdCustomer.getName(),
                createdCustomer.getNumber(),
                createdCustomer.getAmount()
        );
        return createCustomer;
    }
}
