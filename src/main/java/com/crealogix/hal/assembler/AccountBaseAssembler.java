package com.crealogix.hal.assembler;

import com.crealogix.hal.api.AccountController;
import com.crealogix.hal.api.ResourceController;
import com.crealogix.hal.dtos.AccountResource;
import com.crealogix.hal.impl.model.Account;
import org.springframework.hateoas.Identifiable;


/**
 * Created by Marinko on 12.07.2017.
 */
public abstract class AccountBaseAssembler<T extends Identifiable<Integer>> extends BaseAssembler<T,AccountResource> {
    public AccountBaseAssembler(Class<AccountResource> resourceType) {
        super(AccountController.class, resourceType);
    }
}
