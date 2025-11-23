package com.example.serviceproperty.locaimmo.serviceproperty.service.impl;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Ad;
import com.example.serviceproperty.locaimmo.serviceproperty.repository.AdRepository;
import com.example.serviceproperty.locaimmo.serviceproperty.service.IServiceAd;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceAdImpl implements IServiceAd {

    private final AdRepository adRepository;

    public ServiceAdImpl(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> findAll() {
        return adRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Ad findById(Long id) {
        return adRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ad not found with id " + id));
    }

    @Override
    public Ad create(Ad ad) {
        return adRepository.save(ad);
    }

    @Override
    public Ad update(Long id, Ad ad) {
        Ad existing = findById(id);
        existing.setTitre(ad.getTitre());
        existing.setDescription(ad.getDescription());
        existing.setDatePublication(ad.getDatePublication());
        existing.setRoom(ad.getRoom());
        return adRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        adRepository.deleteById(id);
    }
}
