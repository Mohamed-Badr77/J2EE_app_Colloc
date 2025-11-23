package com.example.serviceproperty.locaimmo.serviceproperty.mapper;

import com.example.serviceproperty.locaimmo.serviceproperty.domain.dto.PhotoDto;
import com.example.serviceproperty.locaimmo.serviceproperty.domain.entity.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhotoMapper {

    @Mapping(source = "ad.id", target = "adId")
    PhotoDto toDto(Photo photo);

    @Mapping(target = "ad", ignore = true)
    Photo toEntity(PhotoDto dto);

    List<PhotoDto> toDtoList(List<Photo> photos);
}
