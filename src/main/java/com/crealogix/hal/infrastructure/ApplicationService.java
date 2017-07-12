package com.crealogix.hal.infrastructure;

import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.Collection;

/**
 * Created by Marinko on 12.07.2017.
 */
public interface ApplicationService<T extends Identifiable<Integer>>
{
    T getById(Integer accountId);
    Collection<T> getAll();
}
