package com.crealogix.hal.model;

import java.util.Date;

/**
 * Created by Marinko on 11.07.2017.
 */
public class Payment {
    private Integer id;
    private Float amount;
    private Integer accountId;
    private Date  valuta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getValuta() {
        return valuta;
    }

    public void setValuta(Date valuta) {
        this.valuta = valuta;
    }
}
