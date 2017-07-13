package com.crealogix.hal.impl.repository;

import com.crealogix.hal.impl.domain.DomainAccount;
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

    public DomainAccount getById(Integer id){
        Optional<DomainAccount> first = getAll().stream().filter(a -> a.getId() == id).findFirst();
        if(first.isPresent()){
            return first.get();
        }
        return null;
    }

    public Collection<DomainAccount> getAll(){
        ArrayList<DomainAccount> all = new ArrayList<>();

        DomainAccount account = new DomainAccount();
        account.setId(15);
        account.setAccountNumber("thisismyibanof15");
        account.setName("account15");
        all.add(account);

        account = new DomainAccount();
        account.setId(20);
        account.setAccountNumber("myibanof20");
        account.setName("account20");
        all.add(account);

        return all;
    }
}
