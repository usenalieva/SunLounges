package com.makhabatusen.sunlounges.service.impl;

import com.makhabatusen.sunlounges.model.dto.SunLoungerDto;
import com.makhabatusen.sunlounges.model.entity.SunLounger;
import com.makhabatusen.sunlounges.model.mapper.SunLoungerMapper;
import com.makhabatusen.sunlounges.model.request.CreateSunLoungerRequest;
import com.makhabatusen.sunlounges.repository.SunLoungerRepository;
import com.makhabatusen.sunlounges.service.SunLoungerService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SunLoungerServiceImpl implements SunLoungerService {

    @NonNull SunLoungerRepository sunLoungerRepository;

    @Override
    public SunLoungerDto create(CreateSunLoungerRequest request) {
        return SunLoungerMapper.INSTANCE.toDto(
                sunLoungerRepository
                        .save(SunLounger.builder()
                                        .isOccupied(request.getIsOccupied())
//                                        .startTime(request.getStartTime())
//                                        .endTime(request.getEndTime())
                                        .build()));
    }
}
