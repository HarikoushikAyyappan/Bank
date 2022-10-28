package com.bank.dao;

import com.bank.model.Customer;
import com.bank.repository.CustomerRepository;
import com.bank.repository.LoginCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerDaoImpln implements CustomerDao{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
     LoginCustomerRepository loginCustomer;
    @Transactional
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    @Transactional
    public List<Customer> find(int customerId, String password) {
        return loginCustomer.find(customerId,password);
    }
}
