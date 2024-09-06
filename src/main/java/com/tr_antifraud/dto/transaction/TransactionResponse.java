package com.tr_antifraud.dto.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;

public record TransactionResponse(
        
        Long id,
        Integer status,
        String transactionStatus,
        String accountExternalIdDebit,
        String accountExternalIdCredit,
        Integer transferTypeId,
        String value,
        String createdAt,
        Integer count_transactions
) {
}
