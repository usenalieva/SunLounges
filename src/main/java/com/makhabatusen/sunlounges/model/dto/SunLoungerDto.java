package com.makhabatusen.sunlounges.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SunLoungerDto {

    Long id;
    Boolean isOccupied;
//    LocalDateTime startTime;
//    LocalDateTime endTime;


}
