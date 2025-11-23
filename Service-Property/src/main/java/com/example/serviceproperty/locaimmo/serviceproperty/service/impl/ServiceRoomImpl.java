package com.example.serviceproperty.locaimmo.serviceproperty.service.impl;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Room;
import com.example.serviceproperty.locaimmo.serviceproperty.repository.RoomRepository;
import com.example.serviceproperty.locaimmo.serviceproperty.service.IServiceRoom;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceRoomImpl implements IServiceRoom {

    private final RoomRepository roomRepository;

    public ServiceRoomImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Room findById(Long id) {
        return roomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Room not found with id " + id));
    }

    @Override
    public Room create(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room update(Long id, Room room) {
        Room existing = findById(id);
        existing.setSuperficie(room.getSuperficie());
        existing.setPrix(room.getPrix());
        existing.setDisponibilite(room.getDisponibilite());
        existing.setProperty(room.getProperty());
        return roomRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
