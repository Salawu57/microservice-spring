package com.salawuBabatunde.account.mapper;

import com.salawuBabatunde.account.dto.AccountsDto;
import com.salawuBabatunde.account.entity.Account;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Account account, AccountsDto accountsDto){
        accountsDto.setAccountNumber(account.getAccountNumber());
        accountsDto.setAccountType(account.getAccountType());
        accountsDto.setBranchAddress(account.getBranchAddress());
        return accountsDto;
    }

    public static  Account mapToAccount(AccountsDto accountsDto, Account account){
        account.setAccountNumber(accountsDto.getAccountNumber());
        account.setAccountType(accountsDto.getAccountType());
        account.setBranchAddress(accountsDto.getBranchAddress());
        return account;

    }
}
