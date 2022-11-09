package com.bank.service;

import com.bank.dao.CustomerDao;
import com.bank.model.*;;
import com.bank.repository.AccountPracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpln implements UserService{
    @Autowired
    CustomerDao customerDao;
    @Autowired
    AccountPracticeRepository acnt;

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
        return customerDao.updateAccount(account);
   }
    public List<Officer> search(int officerId, String password){
        return customerDao.search(officerId,password);
    }
    public List<Loan> getAllLoans(){
        return customerDao.getAllLoans();
    }


    public void delete(int loanId) {
        customerDao.delete(loanId);
    }
    public Loan updateLoan(Loan loan){
        return customerDao.updateLoan(loan);
    }

    public AccountPractice getAll(int accountId){
     return acnt.findById(accountId).get();
    }
    public Customer getCustomerById(int customerId){
        return customerDao.getCustomerById(customerId);
    }
    public Account getAccountById(int accountId){
        return customerDao.getAccountById(accountId);
    }
    }




