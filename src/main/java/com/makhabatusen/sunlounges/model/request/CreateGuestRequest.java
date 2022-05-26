package com.makhabatusen.sunlounges.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateGuestRequest {

    String name;
    Long groupId;
    Boolean isWithGroup;
}
