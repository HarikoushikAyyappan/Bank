package com.bank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customerpractice")
public class CustomerPractice {
    @Id
    @Column(name="customerId")
    private int customerId;
    @Column(name="name")
    private String name;
 @OneToMany
 private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
