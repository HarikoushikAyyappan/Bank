package com.bank.model;

import javax.persistence.*;
import java.util.List;
import java.sql.Blob;

@Entity
@Table(name="loan")
public class Loan {
    @Id
    @Column(name="loanId",insertable = false,updatable = false)
    private int loanId;
    @Column(name="loanAmount")
    private int loanAmount;
    @Column(name="acntId")
    private int acntId;

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    @Column(name="uniqueId")
    private int uniqueId;

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }


    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
}
