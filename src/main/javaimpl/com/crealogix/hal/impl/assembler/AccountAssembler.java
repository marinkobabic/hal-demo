package com.crealogix.hal.impl.assembler;

import com.crealogix.hal.api.AccountController;
import com.crealogix.hal.assembler.AccountBaseAssembler;
import com.crealogix.hal.dtos.AccountResource;
import com.crealogix.hal.impl.model.Account;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by Marinko on 11.07.2017.
 */
@Component
public class AccountAssembler extends AccountBaseAssembler<Account> {

    public AccountAssembler() {
        super(AccountResource.class);
    }

    @Override
    public AccountResource toResource(Account account) {
        AccountResource accountResource = super.toResource(account);
        accountResource.setAccountNumber(account.getAccountNumber());
        accountResource.setName(account.getName());

        return accountResource;
    }
}
