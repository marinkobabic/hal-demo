package com.crealogix.hal.impl.applicationservice;

import com.crealogix.hal.applicationservice.AccountApplicationService;
import com.crealogix.hal.impl.domain.DomainAccount;
import com.crealogix.hal.model.Account;
import com.crealogix.hal.impl.repository.AccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

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

        DomainAccount domainAccount = this.accountRepository.getById(accountId);
        return CopyAccount(domainAccount);
    }

    private Account CopyAccount(DomainAccount accountToCopy){
        Account account = new Account();
        BeanUtils.copyProperties(accountToCopy, account);
        return account;
    }

    @Override
    public Collection<Account> getAll() {
        return this.accountRepository.getAll().stream().map(a -> this.CopyAccount(a)).collect(Collectors.toList());
    }

}
