package com.makhabatusen.sunlounges.service.impl;


import com.makhabatusen.sunlounges.model.dto.GuestDto;
import com.makhabatusen.sunlounges.model.dto.ReservationDto;

import com.makhabatusen.sunlounges.model.entity.Reservation;
import com.makhabatusen.sunlounges.model.mapper.ReservationMapper;
import com.makhabatusen.sunlounges.model.request.ReservationRequest;
import com.makhabatusen.sunlounges.repository.ReservationRepository;
import com.makhabatusen.sunlounges.service.ReservationService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReservationServiceImpl implements ReservationService {

    @NonNull ReservationRepository reservationRepository;


    @Override
    public ReservationDto create(ReservationRequest request) {
        return ReservationMapper.INSTANCE.toDto(
                reservationRepository
                        .save(Reservation
                                .builder()
                                .reservationTime(request.getReservationTime())
                                .sunLoungers(request.getSunLoungers())
                                .build()));
    }
}
