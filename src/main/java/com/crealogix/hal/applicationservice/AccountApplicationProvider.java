package com.crealogix.hal.applicationservice;

import com.crealogix.hal.assembler.AccountResource;
import com.crealogix.hal.assembler.AccountResourceAssembler;
import com.crealogix.hal.infrastructure.ApplicationDataProvider;
import com.crealogix.hal.model.Account;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2017 by Crealogix AG, E-Banking. All rights reserved.
 * Created by Crealogix user mbab on 12.07.2017.
 */
@Service
public class AccountApplicationProvider extends ApplicationDataProvider<Account,AccountApplicationService,AccountResource,AccountResourceAssembler> {
    public AccountApplicationProvider(AccountApplicationService applicationService, AccountResourceAssembler assembler) {
        super(applicationService, assembler);
    }
}
