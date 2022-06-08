package com.sakay.bankapp.service;

import com.sakay.bankapp.model.Bank;

import java.util.List;

public interface BankService {
    Bank save(Bank bank);

    List<Bank> findAllBank();

    Bank update(Bank a, long id);

    void delete(long id);



}
