package com.bank.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerId")
    private int customerId;
    @Column(name="customerName")
    private String customerName;
    @Column(name="aadhar")
    private int aadhar;
    @Column(name="profession")
    private String profession;
    @Column(name="incomeRange")
    private int incomeRange;
    @Column(name="password")
    private int  password;
    @Column(name="bankName")
    private String bankName;
    @Column(name="availableLoans")
    private int availableLoans;
    @Column(name="loanEligibility")
    private int loanEligibility;
    @Column(name="accntId",insertable = false,updatable = false)
    private int accntId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accntId", referencedColumnName = "accountId")
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAadhar() {
        return aadhar;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getIncomeRange() {
        return incomeRange;
    }

    public void setIncomeRange(int incomeRange) {
        this.incomeRange = incomeRange;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAvailableLoans() {
        return availableLoans;
    }

    public void setAvailableLoans(int availableLoans) {
        this.availableLoans = availableLoans;
    }

    public int getLoanEligibility() {
        return loanEligibility;
    }

    public void setLoanEligibility(int loanEligibility) {
        this.loanEligibility = loanEligibility;
    }

    public int getAccntId() {
        return accntId;
    }

    public void setAccntId(int accntId) {
        this.accntId = accntId;
    }
}
