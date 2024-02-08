package com.example.coffee.model.DTO;

import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.entity.Ingredient;
import com.example.coffee.model.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
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
public class DrinkDTO {

    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;

    Status status;

    String name;
    Integer price;
    Integer size;

    DrinkTypeDTO drinkTypeDTO;
    List<IngredientDTO> ingredientsDTO;

}
