package com.example.coffee.Mapper;

import java.util.List;

public interface BaseMapper <E, D> {


    E toEntity(D d);

    D toDTO(E e);

    List<E> toEntities(List<D> dtos);

    List<D> toDTOS(List<E> entities);
}