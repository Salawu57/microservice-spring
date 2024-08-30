package com.salawuBabatunde.account.service.impl;

import com.salawuBabatunde.account.dto.CustomerDto;
import com.salawuBabatunde.account.repository.AccountRepository;
import com.salawuBabatunde.account.repository.CustomerRepository;
import com.salawuBabatunde.account.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }

    @Override
    public CustomerDto fetchAccount(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateAccount(CustomerDto customerDto) {
        return false;
    }

    @Override
    public boolean deleteAccount(String mobileNumber) {
        return false;
    }
}
