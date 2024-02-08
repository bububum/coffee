package com.example.coffee.model.DTO;

import com.example.coffee.model.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
public class DrinkTypeDTO {

    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;

    Status status;

    String name;
}
