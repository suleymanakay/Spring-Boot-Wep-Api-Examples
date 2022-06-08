package com.sakay.bankapp.service;

import com.sakay.bankapp.model.Bank;
import com.sakay.bankapp.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service   // Bussines katmanında çalışacak bir bean oluşumu için.
public class BankServiceImpl implements BankService {
    @Autowired
    private BankRepository bankRepository;
    @Override
    public Bank save(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public List<Bank> findAllBank() {
        return bankRepository.findAll();
    }

    @Override
    public Bank update(Bank a, long id) {
        Bank bank=bankRepository.getById(id);
        bank.setName(a.getName());
        bank.setAddress(a.getAddress());
        bank.setUsername(a.getUsername());
        bank.setEmail(a.getEmail());
        bank.setLocation(a.getLocation());
        return bankRepository.save(bank);
    }

    @Override
    public void delete(long id) {
        bankRepository.deleteById(id);
    }

}
