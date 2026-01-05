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
        CustomerEntity createdCustomer =  repo.save(customer);

        CustomerDTO createCustomer = new CustomerDTO(
                createdCustomer.getCustomerId(),
                createdCustomer.getName(),
                createdCustomer.getNumber(),
                createdCustomer.getAmount()
        );
        return createCustomer;
    }
    public CustomerEntity getCustomer(Long customerId){
        return repo.findBycustomerId(customerId);
    }
    public CustomerDTO updateCustomer(Long customerId,CustomerDTO customerdto){
        CustomerEntity customer= repo.findBycustomerId(customerId);
        customer.setAmount(customerdto.getAmount());
        customer.setName(customerdto.getName());
        customer.setNumber(customerdto.getNumber());
        CustomerEntity updated = repo.save(customer);
        return new CustomerDTO(
                updated.getCustomerId(),
                updated.getName(),
                updated.getNumber(),
                updated.getAmount()
        );
    }
    public void deleteCustomer(Long customerId){
        CustomerEntity deleted = repo.findBycustomerId(customerId);
        repo.delete(deleted);
    }
}
