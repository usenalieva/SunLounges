package com.makhabatusen.sunlounges.model.responce;

import com.makhabatusen.sunlounges.model.entity.SunLounger;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReservationResponse {
    Long id;
    Long reservationTime;
    List<SunLounger> sunLoungers;
}
