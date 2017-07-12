package com.crealogix.hal.infrastructure;

import com.crealogix.hal.infrastructure.EntityResource;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.lang.reflect.Method;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Copyright (c) 2017 by Crealogix AG, E-Banking. All rights reserved.
 * Created by Crealogix user mbab on 12.07.2017.
 */
public abstract class ResourceAssembler<T extends Identifiable<Integer>, D extends EntityResource<T>> extends ResourceAssemblerSupport<T,D> {
    private final Class<?> controllerClass;

    public ResourceAssembler(Class<?> controllerClass, Class<D> resourceType) {
        super(controllerClass, resourceType);
        this.controllerClass = controllerClass;
    }

    @Override
    public D toResource(T entity) {
        D accountResource = instantiateResource(entity);
        accountResource.setEntity(entity);
        Method method;
        try {
            method = this.controllerClass.getMethod("getById",Integer.class);
            accountResource.add(linkTo(method,entity.getId()).withSelfRel());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return accountResource;
    }
}
