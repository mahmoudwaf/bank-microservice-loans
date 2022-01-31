package com.mahmoud.bank.loans.service;

import com.mahmoud.bank.loans.entity.LoanEntity;
import com.mahmoud.bank.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansService {
    @Autowired
    LoansRepository repository;

    public LoanEntity saveLoan(LoanEntity entity){
        return  repository.save(entity);
    }

    public LoanEntity getLoanEntity(long loanId){
        return (LoanEntity) repository.findById(loanId).get();
    }

    public List<LoanEntity> getLoans(){
        return repository.findAll();
    }
}
