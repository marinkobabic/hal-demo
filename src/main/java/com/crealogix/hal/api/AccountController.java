package com.crealogix.hal.api;

import com.crealogix.hal.applicationservice.AccountApplicationProvider;
import com.crealogix.hal.assembler.AccountResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Marinko on 11.07.2017.
 */
@RestController
public class AccountController {

    private final AccountApplicationProvider applicationDataProvider;

    public AccountController(AccountApplicationProvider applicationDataProvider){

        this.applicationDataProvider = applicationDataProvider;
    }

    @RequestMapping("/accounts")
    public Collection<AccountResource> getAll(){
        return this.applicationDataProvider.getAllResources();
    }

    @RequestMapping("/accounts/{id}")
    public AccountResource getById(@PathVariable(required = true,name = "id") Integer id){
        return this.applicationDataProvider.getResourceById(id);
    }
}
