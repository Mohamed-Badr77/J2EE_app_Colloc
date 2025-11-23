package com.example.serviceproperty.locaimmo.serviceproperty.domain.mapper;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.dto.RoomDto;
import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    @Mapping(source = "property.id", target = "propertyId")
    RoomDto toDto(Room room);

    @Mapping(target = "property", ignore = true)
    @Mapping(target = "ads", ignore = true)
    Room toEntity(RoomDto dto);

    List<RoomDto> toDtoList(List<Room> rooms);
}
