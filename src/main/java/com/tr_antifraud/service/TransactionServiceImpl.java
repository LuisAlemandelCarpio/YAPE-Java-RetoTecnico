package com.tr_antifraud.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tr_antifraud.dto.transaction.TransactionOutcome;
import com.tr_antifraud.dto.transaction.TransactionRequest;
import com.tr_antifraud.mapper.ProductMapper;
import com.tr_antifraud.model.Product;
import com.tr_antifraud.model.Transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//import static br.com.dv.antifraud.constants.AntifraudSystemConstants.TRANSACTIONS_NOT_FOUND_MESSAGE;

@Service
public class TransactionServiceImpl implements TransactionService {

	private Transaction result = null;
	result.initialize_counter();
	
    @Override
	public List<Transaction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBydId(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(Transaction item) {
		// TODO Auto-generated method stub
		result.increment_counting_transactions();
		result.getClass().getField("status").setInt(item, 200);
	    return 0;	
	}

	@Override
	public int update(int id, Transaction item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public Transaction processTransaction(TransactionRequest request) {
		// TODO Auto-generated method stub
		if(result.count_transactions > 100) {
			result.get_MessageError();
			return result;
	    }
	    else
	    	result.get_OK();
	    	return result;
		return null;
	}

}