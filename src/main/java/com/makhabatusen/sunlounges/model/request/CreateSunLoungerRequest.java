package com.makhabatusen.sunlounges.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateSunLoungerRequest {

    Boolean isOccupied;
//    LocalDateTime startTime;
//    LocalDateTime endTime;

}
