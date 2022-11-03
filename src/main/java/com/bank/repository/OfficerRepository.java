package com.bank.repository;

import com.bank.model.Officer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OfficerRepository extends JpaRepository<Officer, Integer> {
    @Query(value = "SELECT c FROM Officer c WHERE c.officerId=?1 AND c.password=?2")
    List<Officer> search(@Param("officerId") int officerId, @Param("password") String password);
}



