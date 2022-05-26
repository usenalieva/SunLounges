package com.makhabatusen.sunlounges.model.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GuestDto implements Serializable {

    Long id;
    String name;
    Long groupId;
    Boolean isWithGroup;
}
