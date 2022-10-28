package com.bank.service;

import com.bank.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List <Customer> getAllCustomer();
    List<Customer> find(int customerId, String password);
}
