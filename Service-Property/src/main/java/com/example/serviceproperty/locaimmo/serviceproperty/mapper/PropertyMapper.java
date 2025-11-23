package com.example.serviceproperty.locaimmo.serviceproperty.domain.mapper;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.dto.PropertyDto;
import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Property;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertyMapper {

    @Mapping(source = "proprietaire.id", target = "proprietaireId")
    PropertyDto toDto(Property property);

    @Mapping(target = "proprietaire", ignore = true)
    @Mapping(target = "rooms", ignore = true)
    Property toEntity(PropertyDto dto);

    List<PropertyDto> toDtoList(List<Property> properties);
}
