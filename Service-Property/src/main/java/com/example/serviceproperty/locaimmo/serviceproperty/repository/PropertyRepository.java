package com.example.serviceproperty.locaimmo.serviceproperty.repository;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
