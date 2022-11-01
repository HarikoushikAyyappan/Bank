package com.bank.repository;

import com.bank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoginCustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(nativeQuery = false,value = "SELECT c FROM Customer c WHERE c.customerId=?1 AND c.password=?2")
    List<Customer> find(@Param("customerId") int customerId, @Param("password") int password);

}
