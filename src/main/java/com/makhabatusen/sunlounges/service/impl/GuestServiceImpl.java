package com.makhabatusen.sunlounges.service.impl;

import com.makhabatusen.sunlounges.model.dto.GuestDto;
import com.makhabatusen.sunlounges.model.entity.Guest;
import com.makhabatusen.sunlounges.model.mapper.GuestMapper;
import com.makhabatusen.sunlounges.model.request.CreateGuestRequest;
import com.makhabatusen.sunlounges.model.responce.GuestResponse;
import com.makhabatusen.sunlounges.repository.GuestRepository;
import com.makhabatusen.sunlounges.service.GuestService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GuestServiceImpl implements GuestService {


    @NonNull GuestRepository guestRepository;


    @Override
    public GuestDto create(CreateGuestRequest request) {
        return GuestMapper.INSTANCE.toDto(
                guestRepository
                        .save(Guest
                                .builder()
                                .name(request.getName())
                                .isWithGroup(request.getIsWithGroup())
                                .groupId(request.getGroupId())
                                .build()));
    }

//    @Override
//    public GuestResponse getById(Long id) {
//        return null;
//    }
}
