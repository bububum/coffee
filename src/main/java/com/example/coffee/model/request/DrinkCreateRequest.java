package com.example.coffee.model.request;

import com.example.coffee.model.DTO.IngredientDTO;
import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.entity.Ingredient;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DrinkCreateRequest {

    String name;
    Integer price;
    Integer size;

    DrinkType drinkType;
    List<IngredientDTO> ingredients;
}
