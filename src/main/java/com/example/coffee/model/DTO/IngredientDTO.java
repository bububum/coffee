package com.example.coffee.model.DTO;

import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.enums.Status;
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
public class IngredientDTO {

    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;

    Status status;

    String name;
}
