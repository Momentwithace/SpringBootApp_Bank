package com.example.bank.dto.requests;

import lombok.Data;


@Data
public class AccountDto {
    private String bankNo;
    private String customerId;
    private String accountName;
    private String pin;
    private String accountType;
}
