package com.bank.dao;

import com.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerDaoImpln implements CustomerDao{
    @Autowired
    CustomerRepository customerRepository;
    @Transactional
    public List getAllCustomer(){
        return customerRepository.findAll();
    }
}
