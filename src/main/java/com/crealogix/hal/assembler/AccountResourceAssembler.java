package com.crealogix.hal.assembler;

import com.crealogix.hal.api.AccountController;
import com.crealogix.hal.model.Account;
import com.crealogix.hal.infrastructure.ResourceAssembler;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright (c) 2017 by Crealogix AG, E-Banking. All rights reserved.
 * Created by Crealogix user mbab on 12.07.2017.
 */
@Component
public class AccountResourceAssembler extends ResourceAssembler<Account,AccountResource> {
    public AccountResourceAssembler() {
        super(AccountController.class, AccountResource.class);
    }
}
