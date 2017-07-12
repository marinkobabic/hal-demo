package com.crealogix.hal.api;

/**
 * Created by Marinko on 12.07.2017.
 */
public interface ResourceController<D> {
    D getById(Integer integer);
}
