package com.example.serviceproperty.locaimmo.serviceproperty.service.impl;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Proprietaire;
import com.example.serviceproperty.locaimmo.serviceproperty.repository.ProprietaireRepository;
import com.example.serviceproperty.locaimmo.serviceproperty.service.IServiceProprietaire;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceProprietaireImpl implements IServiceProprietaire {

    private final ProprietaireRepository proprietaireRepository;

    public ServiceProprietaireImpl(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Proprietaire> findAll() {
        return proprietaireRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Proprietaire findById(Long id) {
        return proprietaireRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proprietaire not found with id " + id));
    }

    @Override
    public Proprietaire create(Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }

    @Override
    public Proprietaire update(Long id, Proprietaire proprietaire) {
        Proprietaire existing = findById(id);
        // pour l’instant il n’y a que l’id, donc rien à copier
        return proprietaireRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        proprietaireRepository.deleteById(id);
    }
}
