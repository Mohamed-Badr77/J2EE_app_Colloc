package com.example.serviceproperty.locaimmo.serviceproperty.service.impl;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Property;
import com.example.serviceproperty.locaimmo.serviceproperty.repository.PropertyRepository;
import com.example.serviceproperty.locaimmo.serviceproperty.service.IServiceProperty;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicePropertyImpl implements IServiceProperty {

    private final PropertyRepository propertyRepository;

    public ServicePropertyImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Property findById(Long id) {
        return propertyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PropertyRepository not found with id " + id));
    }

    @Override
    public Property create(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Property update(Long id, Property property) {
        Property existing = findById(id);
        existing.setAdresse(property.getAdresse());
        existing.setVille(property.getVille());
        existing.setLatitude(property.getLatitude());
        existing.setLongitude(property.getLongitude());
        existing.setDescription(property.getDescription());
        existing.setRules(property.getRules());
        existing.setProprietaire(property.getProprietaire());
        return propertyRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        propertyRepository.deleteById(id);
    }
}
