package com.example.task_individu_item.utils.exception;

public enum GlobalErrorMapping {
    SYSTEM_ERROR("-1", "Error silahkan kontak tim kami"),
    SUCCESS("0", "SUCCESS"),
    ERROR("1", "ERROR"),
    ID_ALREADY_EXISTS("IEG-0012", "User dengan ID tersebut ada di database, beri ID lain."),
    ITEM_ID_ALREADY_EXISTS("IEG-0013", "Item dengan ID tersebut ada di database, beri ID lain."),
    ;


    public final String code;
    public final String message;

    GlobalErrorMapping(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
