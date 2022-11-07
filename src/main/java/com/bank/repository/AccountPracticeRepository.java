package com.bank.repository;

import com.bank.model.AccountPractice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountPracticeRepository extends JpaRepository<AccountPractice,Integer> {
}
