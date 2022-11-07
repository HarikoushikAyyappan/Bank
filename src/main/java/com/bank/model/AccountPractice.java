package com.bank.model;

import javax.persistence.*;

@Entity
@Table(name="accountpractice")
public class AccountPractice {
    @Id
    @Column(name="accountId")
    private int accountId;
    @Column(name="amount")
    private int amount;
@ManyToOne
private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
