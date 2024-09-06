package com.tr_antifraud.controller;
import com.tr_antifraud.dto.transaction.TransactionOutcome;
import com.tr_antifraud.dto.transaction.TransactionRequest;
import com.tr_antifraud.model.Transaction;
import com.tr_antifraud.service.TransactionService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service = null;
    
    @GetMapping
    public List<Transaction> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Transaction findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody Transaction transaction){
        return service.save(transaction);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id")int id, @RequestBody Transaction transaction){
        return service.update(id, transaction);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") int id){
        return service.deleteBydId(id);
    }
    
    @GetMapping("/{id}")
    public Transaction processTransaction(@PathVariable("id")int id, @RequestBody TransactionRequest request){
        return service.processTransaction(request);
    }
    
    
}
