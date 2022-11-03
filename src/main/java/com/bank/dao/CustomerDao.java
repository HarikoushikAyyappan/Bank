package com.bank.dao;

import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.model.Loan;
import com.bank.model.Officer;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerDao {
    List<Customer> getAllCustomer();
    List<Customer> find(int customerId, int password);

    List<Account> getAccountDetails();
    Account updateAccount(Account account);
    List<Officer> search(int officerId, String password);
    public List<Loan> getAllLoans();
    void delete(int uniqueId);

}
