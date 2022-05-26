package com.makhabatusen.sunlounges.controller;


import com.makhabatusen.sunlounges.model.request.CreateGuestRequest;
import com.makhabatusen.sunlounges.model.request.CreateSunLoungerRequest;
import com.makhabatusen.sunlounges.service.GuestService;
import com.makhabatusen.sunlounges.service.SunLoungerService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sunlounger")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SunLoungerController {

    @NonNull SunLoungerService sunLoungerService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody CreateSunLoungerRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(sunLoungerService.create(request));
    }

}
