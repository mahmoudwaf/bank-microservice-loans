package com.mahmoud.bank.loans.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Setter
@Getter
@Entity
@Table(name = "loans")
public class LoanEntity {

    @Id
    @GeneratedValue
    private long loanId;

    private long accountId;

    private Date createDate;

}
