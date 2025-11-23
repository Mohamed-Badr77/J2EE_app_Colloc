package com.example.serviceproperty.locaimmo.serviceproperty.service;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Property;

import java.util.List;

public interface IServiceProperty {

    List<Property> findAll();

    Property findById(Long id);

    Property create(Property property);

    Property update(Long id, Property property);

    void delete(Long id);
}
