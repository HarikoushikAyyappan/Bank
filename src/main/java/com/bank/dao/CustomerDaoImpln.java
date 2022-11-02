package com.bank.dao;

import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.repository.AccountDetails;
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
   @Autowired
   AccountDetails accountDetailsRepository;
    @Transactional
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    @Transactional
    public List<Customer> find(int customerId, int password) {
        return loginCustomer.find(customerId,password);
    }
    @Transactional
    public List<Account> getAccountDetails() {
        return accountDetailsRepository.findAll();
    }
    @Transactional
    public Account updateAccount(Account account){
        return accountDetailsRepository.save(account);
    }

    }

