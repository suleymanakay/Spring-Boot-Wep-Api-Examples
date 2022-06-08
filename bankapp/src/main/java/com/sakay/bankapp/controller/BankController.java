package com.sakay.bankapp.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sakay.bankapp.model.Bank;
import com.sakay.bankapp.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bank" )
@RequiredArgsConstructor
public  class BankController {

    private final BankService bankService;
    @PostMapping
    public Bank create(@RequestBody Bank b){return bankService.save(b);}

    @GetMapping
    public List<Bank> getAllBanks(){return bankService.findAllBank();}

    @PutMapping("/update/{id}") //localhost:8080/bank/update/1
    public Bank update(@RequestBody Bank a,@PathVariable("id") long id){
        return bankService.update(a,id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id){bankService.delete(id);}

}
