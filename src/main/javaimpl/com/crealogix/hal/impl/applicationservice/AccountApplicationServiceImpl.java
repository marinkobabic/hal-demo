package com.crealogix.hal.impl.applicationservice;

import com.crealogix.hal.applicationservice.AccountApplicationService;
import com.crealogix.hal.model.Account;
import com.crealogix.hal.impl.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Marinko on 11.07.2017.
 */
@Service
public class AccountApplicationServiceImpl implements AccountApplicationService {

    private AccountRepository accountRepository;

    public AccountApplicationServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getById(Integer accountId) {
        return this.accountRepository.getById(accountId);
    }

    @Override
    public Collection<Account> getAll() {
        return this.accountRepository.getAll();
    }

}
