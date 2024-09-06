package com.tr_antifraud.antifraud.constants;

public final class AntifraudSystemConstants {

    private AntifraudSystemConstants() {
        throw new UnsupportedOperationException();
    }

    public static final String STATUS_DELETED_SUCCESSFULLY = "Deleted successfully!";
    public static final String STATUS_LOCKED = "locked";
    public static final String STATUS_UNLOCKED = "unlocked";
    public static final String TRANSACTION_LIMIT_REACHED = "The limit of the number of transactions is reached";
    
    public static final String EXTERNALIDDEBIT_REQUIRED_MESSAGE = "ExternalIdDebit is required.";
    public static final String EXTERNALIDCREDIT_REQUIRED_MESSAGE = "ExternalIdCredit is required.";
    public static final String VALUE_REQUIRED_MESSAGE = "Value is required.";
}
