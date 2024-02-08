package com.example.coffee.Mapper;

import com.example.coffee.model.DTO.DrinkDTO;
import com.example.coffee.model.entity.Drink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkMapper extends BaseMapper<Drink, DrinkDTO>{

    DrinkMapper INSTANCE = Mappers.getMapper(DrinkMapper.class);
}
