package com.bank.repository;

import com.bank.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoanRepository extends JpaRepository<Loan,Integer> {
    @Query(nativeQuery = true,value = "DELETE FROM LOAN WHERE uniqueId=?")
    void delete(@Param("uniqueId")int uniqueId);
}
