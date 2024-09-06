package com.tr_antifraud.model;

//import br.com.dv.antifraud.enums.TransactionResult;
//import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {

    private Long id;
    private Integer status;
    private String transactionStatus;
    private String accountExternalIdDebit;
    private String accountExternalIdCredit;
    private Integer transferTypeId;
    private String value;
    private String createdAt;
    public Integer count_transactions;
    
    public void initialize_counter () {
    	this.count_transactions = 0;
    }
    
    public void increment_counting_transactions () {
    	this.count_transactions += 1;
    }
    
    public void get_MessageError () {
    	this.transactionStatus = "ERROR: Limite de transacciones superadas";
    }
    
    public void get_OK () {
    	this.transactionStatus = "OK: transaccion correcta";
    }
}