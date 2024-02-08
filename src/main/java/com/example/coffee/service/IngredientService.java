package com.example.coffee.service;

import com.example.coffee.model.DTO.DrinkDTO;
import com.example.coffee.model.DTO.IngredientDTO;
import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.entity.Ingredient;
import com.example.coffee.model.request.DrinkCreateRequest;
import com.example.coffee.model.request.IngredientCreateRequest;

import java.util.List;

public interface IngredientService {

    IngredientDTO create(IngredientCreateRequest request);
    IngredientDTO save(Ingredient ingredient);
    IngredientDTO getById(Long id, int languageOrdinal);
    List<IngredientDTO> getAll();
}
