package com.bank.dao;

import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.model.Loan;
import com.bank.model.Officer;
import com.bank.repository.*;
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
   @Autowired
    OfficerRepository officerRepository;
   @Autowired
    LoanRepository loanRepository;
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
    @Transactional
    public List<Officer> search(int officerId, String password) {
        return officerRepository.search(officerId,password);
    }
    @Transactional
    public List<Loan> getAllLoans(){
        return loanRepository.findAll();
    }
    @Transactional
    public void delete(int loanId){
         loanRepository.deleteById(loanId);
    }
    @Transactional
    public Loan updateLoan(Loan loan){
        return loanRepository.save(loan);
    }
    @Transactional
    public Customer getCustomerById(int customerId){
        return customerRepository.findById(customerId).get();
    }
    @Transactional
    public Account getAccountById(int accountId){
        return accountDetailsRepository.findById(accountId).get();
    }
    @Transactional
    public Customer save(Customer uploadFile){
        return customerRepository.save(uploadFile);
    }


    }

