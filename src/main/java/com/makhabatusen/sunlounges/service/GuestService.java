package com.makhabatusen.sunlounges.service;

import com.makhabatusen.sunlounges.model.dto.GuestDto;
import com.makhabatusen.sunlounges.model.request.CreateGuestRequest;
import com.makhabatusen.sunlounges.model.responce.GuestResponse;

public interface GuestService {

    GuestDto create(CreateGuestRequest request);
  //  GuestResponse getById(Long id);

}
