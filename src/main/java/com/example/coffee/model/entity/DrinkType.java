package com.example.coffee.model.entity;

import com.example.coffee.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_drink_type")
public class DrinkType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDateTime createdDate;
    @Column(name = "updated_date")
    LocalDateTime updatedDate;

    @Enumerated(EnumType.STRING)
    Status status;

    @Column(name = "name")
    String name;
}
