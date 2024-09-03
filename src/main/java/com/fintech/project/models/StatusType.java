package com.fintech.project.models;

public enum StatusType {
    BLOCKED("1"),
    ALLOWED("2"),
    VICTORY("3");

    private final String code;

    StatusType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}