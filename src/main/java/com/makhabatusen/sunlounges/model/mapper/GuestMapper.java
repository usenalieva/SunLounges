package com.makhabatusen.sunlounges.model.mapper;

import com.makhabatusen.sunlounges.model.dto.GuestDto;
import com.makhabatusen.sunlounges.model.entity.Guest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface GuestMapper extends BaseMapper<Guest, GuestDto> {
    GuestMapper INSTANCE = Mappers.getMapper(GuestMapper.class);
}
