package com.example.coffee.service.impl;

import com.example.coffee.Mapper.DrinkMapper;
import com.example.coffee.Mapper.IngredientMapper;
import com.example.coffee.dao.DrinkRepository;
import com.example.coffee.exception.NotFoundException;
import com.example.coffee.model.DTO.DrinkDTO;
import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.enums.Status;
import com.example.coffee.model.request.DrinkCreateRequest;
import com.example.coffee.service.DrinkService;
import com.example.coffee.utils.Language;
import com.example.coffee.utils.ResourceBundleLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkServiceImpl implements DrinkService {

    private final DrinkRepository repository;

    @Override
    public DrinkDTO create(DrinkCreateRequest request) {
        Drink drink = Drink.builder()
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .name(request.getName())
                .price(request.getPrice())
                .size(request.getSize())
                .status(Status.ACTIVE)
                .drinkType(request.getDrinkType())
                .ingredients(IngredientMapper.INSTANCE.toEntities(request.getIngredients()))
                .build();

        save(drink);

        return DrinkMapper.INSTANCE.toDTO(drink);
    }

    @Override
    public DrinkDTO save(Drink drink) {
        return DrinkMapper.INSTANCE.toDTO(repository.save(drink));
    }

    @Override
    public DrinkDTO getById(Long id, int languageOrdinal) {
        Language language = Language.getLanguage(languageOrdinal);

        return DrinkMapper.INSTANCE.toDTO(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(ResourceBundleLanguage.periodMessage(language, "entityNotFound"))));
    }

    @Override
    public List<DrinkDTO> getAll() {
        return DrinkMapper.INSTANCE.toDTOS(repository.findAll());
    }

    @Override
    public List<DrinkDTO> getByType(DrinkType drinkType, int languageOrdinal) {

        return DrinkMapper.INSTANCE.toDTOS(repository.findDrinksByDrinkType(drinkType));
    }
}
