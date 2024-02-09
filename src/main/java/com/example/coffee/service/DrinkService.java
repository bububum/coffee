package com.example.coffee.service;

import com.example.coffee.model.DTO.DrinkDTO;
import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.request.DrinkCreateRequest;

import java.util.List;

public interface DrinkService {

    DrinkDTO create(DrinkCreateRequest request);
    DrinkDTO save(Drink drink);
    DrinkDTO getById(Long id, int languageOrdinal);
    List<DrinkDTO> getAll();
    List<DrinkDTO> getByType(DrinkType drinkType, int languageOrdinal);
    List<DrinkDTO> getByName(String name, int languageOrdinal);
    List<DrinkDTO> filter(DrinkType drinkType, Integer priceFrom, Integer priceTo);
}
