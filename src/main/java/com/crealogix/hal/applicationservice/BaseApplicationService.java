package com.crealogix.hal.applicationservice;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.Collection;

/**
 * Created by Marinko on 11.07.2017.
 */
public abstract class BaseApplicationService<T extends Identifiable<Integer>,D extends ResourceSupport, A extends ResourceAssemblerSupport<T,D>>
        implements ApplicationService<T,D,A>, ApplicationDataProvider<D>
{
    private Class<A> assemblerType;
    private A assemblerInstance;

    public BaseApplicationService(Class<A> assemblerType){

        this.assemblerType = assemblerType;
    }
    @Override
    public D getResourceById(Integer id) {
        T entity = this.getById(id);
        return this.getAssembler().toResource(entity);
    }

    private A getAssembler(){
        if(assemblerInstance == null){
            assemblerInstance = BeanUtils.instantiateClass(this.assemblerType);
        }
        return assemblerInstance;
    }

    @Override
    public Collection<D> getAllResources() {
        Collection<T> all = this.getAll();
        return this.getAssembler().toResources(all);
    }
}
