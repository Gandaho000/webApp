package com.davisassociatescpa.webApp.models;

public enum taskType {

    Payroll("Payroll"),
    Administrative("Administrative"),
    Accounting("Accounting");

    private final String name;

    taskType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}



