package com.example.serviceproperty.locaimmo.serviceproperty.service;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Ad;

import java.util.List;

public interface IServiceAd {

    List<Ad> findAll();

    Ad findById(Long id);

    Ad create(Ad ad);

    Ad update(Long id, Ad ad);

    void delete(Long id);
}
