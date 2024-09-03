package com.fintech.project.models;

public enum AccountsType {
    CHECKING(1),
    SAVINGS(2),
    BUSINESS(3),
    STUDENT(4),
    FIXED_DEPOSIT(5),
    CREDIT(6),
    INVESTMENT(7),
    RETIREMENT(8);

    private final int code;

    AccountsType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
