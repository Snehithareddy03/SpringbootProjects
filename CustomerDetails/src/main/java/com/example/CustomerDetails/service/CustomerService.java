package com.example.CustomerDetails.service;

import com.example.CustomerDetails.dto.CustomerDTO;
import com.example.CustomerDetails.entity.CustomerEntity;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customerdto);
}
