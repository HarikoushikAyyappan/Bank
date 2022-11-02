package com.bank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="loan")
public class Loan {
    @Id
    private int loanId;
    private int loanAmount;

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
