package com.bank.service;

import com.bank.dao.CustomerDao;
import com.bank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpln implements UserService{
    @Autowired
    CustomerDao customerDao;
    public List<Customer> getAllCustomer(){

        return customerDao.getAllCustomer();
    }
   public List<Customer> find(int customerId, String password){
        return customerDao.find(customerId,password);
   }
}
