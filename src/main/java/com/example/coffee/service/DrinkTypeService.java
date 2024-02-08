package com.example.coffee.service;

import com.example.coffee.model.DTO.DrinkDTO;
import com.example.coffee.model.DTO.DrinkTypeDTO;
import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.request.DrinkCreateRequest;
import com.example.coffee.model.request.DrinkTypeCreateRequest;

import java.util.List;

public interface DrinkTypeService {

    DrinkTypeDTO create(DrinkTypeCreateRequest request);
    DrinkTypeDTO save(DrinkType drinkType);
    DrinkTypeDTO getById(Long id, int languageOrdinal);
    List<DrinkTypeDTO> getAll();
}
