package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="officer")
public class Officer {
    @Id
    private int officerId;
    @Column(name="officerName")
    private String officerName;
    @Column(name="designation")
    private String designation;
    @Column(name="password")
    private  String password;

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
