package com.example.bank.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Account {
    @Id
    private String id;
    private String accountName;
    private String pin;
    private AccountTypes accountType;
    private String dateCreated;
    @DBRef
    private List<TransactionHistory> transactionHistory = new ArrayList<>();
    public boolean pinIsValid(String pin){
        return this.pin.equals(pin);
    }
    public Account(){}
    public Account(String accountName, AccountTypes accountType){
        this.accountName = accountName;
        this.accountType = accountType;
    }
}
