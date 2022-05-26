package com.makhabatusen.sunlounges.model.dto;


import com.makhabatusen.sunlounges.model.entity.SunLounger;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReservationDto implements Serializable {

    Long id;
    Long reservationTime;
    List<SunLounger> sunLoungers;
}
