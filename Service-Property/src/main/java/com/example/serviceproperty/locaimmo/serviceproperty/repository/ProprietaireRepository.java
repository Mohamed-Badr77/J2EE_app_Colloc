package com.example.serviceproperty.locaimmo.serviceproperty.repository;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {
}

