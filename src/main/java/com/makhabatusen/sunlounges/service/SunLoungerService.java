package com.makhabatusen.sunlounges.service;

import com.makhabatusen.sunlounges.model.dto.SunLoungerDto;
import com.makhabatusen.sunlounges.model.request.CreateSunLoungerRequest;

public interface SunLoungerService {

    SunLoungerDto create(CreateSunLoungerRequest request);
}
