package com.crealogix.hal.model;

import org.springframework.hateoas.Identifiable;

/**
 * Created by Marinko on 11.07.2017.
 */
public class Account implements Identifiable<Integer> {
    private Integer id;
    private String accountNumber;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
