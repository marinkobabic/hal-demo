package com.crealogix.hal.applicationservice;

import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.Collection;

/**
 * Created by Marinko on 12.07.2017.
 */
public interface ApplicationService<T extends Identifiable<Integer>,D extends ResourceSupport, A extends ResourceAssemblerSupport<T,D>> {
    T getById(Integer accountId);
    Collection<T> getAll();
}
