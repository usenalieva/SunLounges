package com.makhabatusen.sunlounges.model.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_sun_lounger")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SunLounger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    Long id;

    @Column(name="is_occupied", nullable = false)
    Boolean isOccupied;


//    @Column(name = "start_time",  columnDefinition = "TIMESTAMP DEFAULT NOW()")
//    LocalDateTime startTime;
//
//    @Column(name = "end_time",  columnDefinition = "TIMESTAMP")
//    LocalDateTime endTime;

//    @PrePersist
//    private void onCreate() {
//        startTime = LocalDateTime.now();
//    }


}
