package com.makhabatusen.sunlounges.model.request;


import com.makhabatusen.sunlounges.model.entity.SunLounger;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReservationRequest {

    Long reservationTime;
    List<SunLounger> sunLoungers;
}
