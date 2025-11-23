package com.example.serviceproperty.locaimmo.serviceproperty.service;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Proprietaire;

import java.util.List;

public interface IServiceProprietaire {

    List<Proprietaire> findAll();

    Proprietaire findById(Long id);

    Proprietaire create(Proprietaire proprietaire);

    Proprietaire update(Long id, Proprietaire proprietaire);

    void delete(Long id);
}
