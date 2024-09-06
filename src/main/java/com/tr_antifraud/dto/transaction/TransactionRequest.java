package com.tr_antifraud.dto.transaction;

import jakarta.annotation.Nonnull;

import static com.tr_antifraud.antifraud.constants.AntifraudSystemConstants.EXTERNALIDDEBIT_REQUIRED_MESSAGE;
import static com.tr_antifraud.antifraud.constants.AntifraudSystemConstants.EXTERNALIDCREDIT_REQUIRED_MESSAGE;
import static com.tr_antifraud.antifraud.constants.AntifraudSystemConstants.VALUE_REQUIRED_MESSAGE;


public record TransactionRequest(
        
		Long id,
		//@Nonnull(message = EXTERNALIDDEBIT_REQUIRED_MESSAGE)
        String accountExternalIdDebit,
        //@Nonnull(message = EXTERNALIDCREDIT_REQUIRED_MESSAGE)
        String accountExternalIdCredit,
        //@Nonnull(message = VALUE_REQUIRED_MESSAGE)
        String value
	
) {
}
