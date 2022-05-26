package com.makhabatusen.sunlounges.model.mapper;

import com.makhabatusen.sunlounges.model.dto.ReservationDto;
import com.makhabatusen.sunlounges.model.entity.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper extends BaseMapper<Reservation, ReservationDto>{

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

}
