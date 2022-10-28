package com.bank.dao;

import com.bank.model.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getAllCustomer();
    List<Customer> find(int customerId, String password);
}
