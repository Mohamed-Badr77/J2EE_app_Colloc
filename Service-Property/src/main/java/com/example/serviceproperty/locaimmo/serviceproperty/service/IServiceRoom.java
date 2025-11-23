package com.example.serviceproperty.locaimmo.serviceproperty.service;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Room;

import java.util.List;

public interface IServiceRoom {

    List<Room> findAll();

    Room findById(Long id);

    Room create(Room room);

    Room update(Long id, Room room);

    void delete(Long id);
}
