package com.example.serviceproperty.locaimmo.serviceproperty.mapper;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.dto.ProprietaireDto;
import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Proprietaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProprietaireMapper {

    @Mapping(target = "id", source = "id")
    ProprietaireDto toDto(Proprietaire proprietaire);

    @Mapping(target = "properties", ignore = true)
    Proprietaire toEntity(ProprietaireDto dto);

    List<ProprietaireDto> toDtoList(List<Proprietaire> proprietaires);
}
