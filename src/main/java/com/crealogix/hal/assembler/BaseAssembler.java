package com.crealogix.hal.assembler;

import com.crealogix.hal.api.AccountController;
import com.crealogix.hal.api.ResourceController;
import com.crealogix.hal.dtos.AccountResource;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.io.Serializable;
import java.lang.reflect.Method;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by Marinko on 11.07.2017.
 */
public abstract class BaseAssembler<T extends Identifiable<Integer>, D extends ResourceSupport> extends ResourceAssemblerSupport<T, D> {

    private final Class<D> resourceType;
    private final Class<?> controllerClass;

    public BaseAssembler(Class<?> controllerClass, Class<D> resourceType) {
        super(controllerClass, resourceType);
        this.resourceType = resourceType;
        this.controllerClass = controllerClass;
    }

    @Override
    public D toResource(T entity) {
        Method method = null;
        try {
            method = this.controllerClass.getMethod("getById",Integer.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        D instance = instantiateResource(entity);
        if(method == null){
            return instance;
        }
        instance.add(linkTo(method,entity.getId()).withSelfRel());
        return instance;
    }
}
