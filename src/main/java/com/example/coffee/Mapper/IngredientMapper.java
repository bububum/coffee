package com.example.coffee.Mapper;

import com.example.coffee.model.DTO.IngredientDTO;
import com.example.coffee.model.entity.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper extends BaseMapper<Ingredient, IngredientDTO> {

    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

}
