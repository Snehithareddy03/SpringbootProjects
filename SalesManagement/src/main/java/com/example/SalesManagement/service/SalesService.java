package com.example.SalesManagement.service;

import com.example.SalesManagement.dto.SalesDTO;
import com.example.SalesManagement.entity.SalesEntity;

public interface SalesService {
    SalesDTO createSales(SalesDTO salesdto);
    SalesEntity getSales(Long salesId);
    SalesDTO updateSales(Long salesId,SalesDTO salesdto);
    void deleteSales(Long salesId);
}
