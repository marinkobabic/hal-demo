package com.crealogix.hal.infrastructure;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;

/**
 * Copyright (c) 2017 by Crealogix AG, E-Banking. All rights reserved.
 * Created by Crealogix user mbab on 12.07.2017.
 */
public class EntityResource<T> extends ResourceSupport {

    @JsonUnwrapped
    private T entity;

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
