package com.example.coffee.model.entity;

import com.example.coffee.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_ingredient")
public class Ingredient {

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
