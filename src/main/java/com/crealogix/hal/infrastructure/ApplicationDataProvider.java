package com.crealogix.hal.infrastructure;

import com.crealogix.hal.infrastructure.ApplicationService;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.Collection;

/**
 * Created by Marinko on 12.07.2017.
 */
public class ApplicationDataProvider<T extends Identifiable<Integer>,S extends ApplicationService<T>, D extends ResourceSupport, A extends ResourceAssemblerSupport<T,D>> {

    private S applicationService;
    private final A assembler;

    public ApplicationDataProvider(S applicationService, A assembler){
        this.applicationService = applicationService;
        this.assembler = assembler;
    }
    public D getResourceById(Integer id){
        T entity = this.applicationService.getById(id);
        return this.assembler.toResource(entity);
    }

    public Collection<D> getAllResources(){
        Collection<T> entities = this.applicationService.getAll();
        return this.assembler.toResources(entities);
    }
}
