package com.mahmoud.bank.loans.repository;


import com.mahmoud.bank.loans.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoansRepository extends JpaRepository<LoanEntity , Long> {

}
