package com.makhabatusen.sunlounges.service;

import com.makhabatusen.sunlounges.model.dto.ReservationDto;

import com.makhabatusen.sunlounges.model.request.ReservationRequest;

public interface ReservationService {
    ReservationDto create(ReservationRequest request);
}
