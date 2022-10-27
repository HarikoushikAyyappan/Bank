package com.bank.service;

import com.bank.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpln implements UserService{
    @Autowired
    CustomerDao customerDao;
    public List getAllCustomer(){

        return customerDao.getAllCustomer();
    }
}
