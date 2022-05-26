package com.makhabatusen.sunlounges.model.responce;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GuestResponse {

    Long id;
    String name;
    Long groupId;
    Boolean isWithGroup;
}
