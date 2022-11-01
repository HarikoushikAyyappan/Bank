package com.bank.service;

import com.bank.dao.CustomerDao;
import com.bank.model.Account;
import com.bank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class UserServiceImpln implements UserService{
    @Autowired
    CustomerDao customerDao;
    public List<Customer> getAllCustomer(){

        return customerDao.getAllCustomer();
    }
   public List<Customer> find(int customerId, int password){
        return customerDao.find(customerId,password);
   }

    public List<Account> getAccountDetails(){
        return customerDao.getAccountDetails();
    }
   public Account updateAccount(Account account){
        return customerDao.updateAccount( account);
   }


}
