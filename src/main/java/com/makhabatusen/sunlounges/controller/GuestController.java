package com.makhabatusen.sunlounges.controller;


import com.makhabatusen.sunlounges.model.request.CreateGuestRequest;
import com.makhabatusen.sunlounges.service.GuestService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/guest")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class GuestController {

    @NonNull GuestService guestService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@Validated @RequestBody CreateGuestRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(guestService.create(request));
    }

//    @GetMapping("/get/{id}") // http://localhost:8001/api/v1/guest/get/
//    public ResponseEntity<?> getById(@PathVariable Long id) {
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(guestService.getById(id));
//    }
}
