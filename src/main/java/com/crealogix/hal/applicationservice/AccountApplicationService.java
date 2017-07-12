package com.crealogix.hal.applicationservice;

import com.crealogix.hal.assembler.AccountBaseAssembler;
import com.crealogix.hal.dtos.AccountResource;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.Collection;

/**
 * Created by Marinko on 11.07.2017.
 */
public abstract class AccountApplicationService<T extends Identifiable<Integer>, A extends ResourceAssemblerSupport<T,AccountResource>>
        extends BaseApplicationService<T, AccountResource, A>
{

    public AccountApplicationService(Class<A> assemblerType) {
        super(assemblerType);
    }
}
