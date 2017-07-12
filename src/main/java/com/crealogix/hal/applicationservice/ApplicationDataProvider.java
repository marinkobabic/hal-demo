package com.crealogix.hal.applicationservice;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Marinko on 12.07.2017.
 */
public interface ApplicationDataProvider<D extends ResourceSupport> {
    D getResourceById(Integer id);
    Collection<D> getAllResources();
}
