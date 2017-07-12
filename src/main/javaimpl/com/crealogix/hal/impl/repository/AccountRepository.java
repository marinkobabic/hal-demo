package com.crealogix.hal.impl.repository;

import com.crealogix.hal.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

/**
 * Created by Marinko on 11.07.2017.
 */
@Component
public class AccountRepository {

    public Account getById(Integer id){
        Optional<Account> first = getAll().stream().filter(a -> a.getId() == id).findFirst();
        if(first.isPresent()){
            return first.get();
        }
        return null;
    }

    public Collection<Account> getAll(){
        ArrayList<Account> all = new ArrayList<>();

        Account account = new Account();
        account.setId(15);
        account.setAccountNumber("thisismyibanof15");
        account.setName("account15");
        all.add(account);

        account = new Account();
        account.setId(20);
        account.setAccountNumber("myibanof20");
        account.setName("account20");
        all.add(account);

        return all;
    }
}
