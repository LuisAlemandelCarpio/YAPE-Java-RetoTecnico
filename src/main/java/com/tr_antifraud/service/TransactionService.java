package com.tr_antifraud.service;

//package br.com.dv.antifraud.service.transaction;

//import br.com.dv.antifraud.dto.transaction.TransactionResponse;
//import br.com.dv.antifraud.dto.transaction.TransactionRequest;
//import br.com.dv.antifraud.dto.transaction.TransactionOutcome;

import java.util.List;

import com.tr_antifraud.dto.transaction.TransactionOutcome;
import com.tr_antifraud.dto.transaction.TransactionRequest;
import com.tr_antifraud.model.Product;
import com.tr_antifraud.model.Transaction;

public interface TransactionService {
	
	List<Transaction> findAll();
	Transaction findById(int id);
    int deleteBydId(int id);
    int save(Transaction item);
    int update(int id, Transaction item);
	
    Transaction processTransaction(TransactionRequest request);

    //List<TransactionResponse> getTransactionHistory();

    //List<TransactionResponse> getTransactionHistoryByCardNumber(String cardNumber);

}
