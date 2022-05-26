package com.makhabatusen.sunlounges.model.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_reservations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    Long id;


    // TODO vremenno
    @Column(name = "reservation_time")
    Long reservationTime;

    @ToString.Exclude
    @ManyToMany
    @JoinTable(name = "tb_reservation",
            joinColumns = @JoinColumn(name = "sun_lounger_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "guest_id", referencedColumnName = "id"))
    List<SunLounger> sunLoungers;



}
