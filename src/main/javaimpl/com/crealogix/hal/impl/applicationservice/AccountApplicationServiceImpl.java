package com.crealogix.hal.impl.applicationservice;

import com.crealogix.hal.applicationservice.AccountApplicationService;
import com.crealogix.hal.dtos.AccountResource;
import com.crealogix.hal.impl.assembler.AccountAssembler;
import com.crealogix.hal.impl.model.Account;
import com.crealogix.hal.impl.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Marinko on 11.07.2017.
 */
@Service
public class AccountApplicationServiceImpl extends AccountApplicationService<Account, AccountAssembler> {

    private AccountRepository accountRepository;

    public AccountApplicationServiceImpl(AccountRepository accountRepository) {
        super(AccountAssembler.class);
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
