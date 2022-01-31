package com.mahmoud.bank.loans.controller;

import com.mahmoud.bank.loans.entity.LoanEntity;
import com.mahmoud.bank.loans.service.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @Autowired
    LoansService loansService;
    @GetMapping("")
    public String home(){
        return "Welcome to loans microservice";
    }

    @PostMapping
    public LoanEntity saveLoan(@RequestBody LoanEntity loanEntity){
        return loansService.saveLoan(loanEntity);
    }

    @GetMapping("/{loanid}")
    public LoanEntity getLoan(@PathVariable("loanid") long loanId){
        return loansService.getLoanEntity(loanId);
    }

    @GetMapping("/getAllLoans")
    public List<LoanEntity> getAllLoans(){
        return loansService.getLoans();
    }
}
