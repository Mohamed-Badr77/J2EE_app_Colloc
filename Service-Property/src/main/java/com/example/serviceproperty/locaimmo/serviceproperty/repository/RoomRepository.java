package com.example.serviceproperty.locaimmo.serviceproperty.repository;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}