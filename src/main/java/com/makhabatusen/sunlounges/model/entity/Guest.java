package com.makhabatusen.sunlounges.model.entity;


import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_guest")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    Long id;

    @Column(name = "guest_name", nullable = false, length = 100)
    String name;

    @Column(name="group_id")
    Long groupId;

    @Column(name="is_with_group", nullable = false)
    Boolean isWithGroup;

}
