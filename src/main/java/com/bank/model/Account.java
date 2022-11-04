package com.bank.model;
import javax.persistence.*;
import java.util.List;
import java.sql.Blob;

@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accountId")
    private int accountId;
    @Column(name="accountType")
    private String accountType;
    @Column(name="accountDeposit")
    private int accountDeposit;
    @Column(name="rateOfInterest")
    private float rateOfInterest;
    @Column(name="maturityAmount")
    private int maturityAmount;
    @Column(name="withdrawalAmount")
    private int withdrawalAmount;
    @Column(name="availableBalance")
    private int availableBalance;
    @Column(name="custId")
    private int custId;
    @OneToOne(targetEntity = Customer.class)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "loan",
            joinColumns = @JoinColumn(name="loan_accountId")
           // inverseJoinColumns = @JoinColumn(name="loan_loanId")
    )
    public List<Loan> loanList;

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }



    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

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
}
