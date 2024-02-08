package com.example.coffee.Mapper;

import com.example.coffee.model.DTO.DrinkTypeDTO;
import com.example.coffee.model.entity.DrinkType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkTypeMapper extends BaseMapper<DrinkType, DrinkTypeDTO> {

    DrinkTypeMapper INSTANCE = Mappers.getMapper(DrinkTypeMapper.class);
}