package com.bank.service;

import com.bank.model.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public interface UserService {
    List <Customer> getAllCustomer();
    List<Customer> find(int customerId, int password);

    List<Account> getAccountDetails();
    Account updateAccount(Account account);
    List<Officer> search(int officerId, String password);
    List<Loan> getAllLoans();
    void delete(int loanId);
    Loan updateLoan(Loan loan);
    List<AccountPractice> getAll();



}
