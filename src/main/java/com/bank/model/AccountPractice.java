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
private CustomerPractice customerPractice;

    public CustomerPractice getCustomerPractice() {
        return customerPractice;
    }

    public void setCustomerPractice(CustomerPractice customerPractice) {
        this.customerPractice = customerPractice;
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
