package com.bank.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
@SecondaryTable(name="account")
public class Customer {
    @Id
    @Column(updatable = false, nullable = false)
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
    @Column(name="accntId")
    private int accntId;
    @Column(table="account")
    private int accountId;
    @Column(table="account")
    private String accountType;
    @Column(table="account")
    private int accountDeposit;
    @Column(table="account")
    private float rateOfInterest;
    @Column(table="account")
    private int maturityAmount;
    @Column(table="account")
    private int withdrawalAmount;
    @Column(table="account")
    private int availableBalance;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountDeposit() {
        return accountDeposit;
    }

    public void setAccountDeposit(int accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(int maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
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
