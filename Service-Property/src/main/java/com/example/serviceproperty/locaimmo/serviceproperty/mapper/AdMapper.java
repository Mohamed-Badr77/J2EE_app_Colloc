package com.example.serviceproperty.locaimmo.serviceproperty.mapper;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.dto.AdDto;
import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Ad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdMapper {

    @Mapping(source = "room.id", target = "roomId")
    AdDto toDto(Ad ad);

    @Mapping(target = "room", ignore = true)
    @Mapping(target = "photos", ignore = true)
    Ad toEntity(AdDto dto);

    List<AdDto> toDtoList(List<Ad> ads);
}
