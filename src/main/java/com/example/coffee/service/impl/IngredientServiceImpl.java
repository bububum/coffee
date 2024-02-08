package com.example.coffee.service.impl;

import com.example.coffee.Mapper.DrinkMapper;
import com.example.coffee.Mapper.IngredientMapper;
import com.example.coffee.dao.IngredientRepository;
import com.example.coffee.exception.NotFoundException;
import com.example.coffee.model.DTO.IngredientDTO;
import com.example.coffee.model.entity.Ingredient;
import com.example.coffee.model.enums.Status;
import com.example.coffee.model.request.IngredientCreateRequest;
import com.example.coffee.service.IngredientService;
import com.example.coffee.utils.Language;
import com.example.coffee.utils.ResourceBundleLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository repository;

    @Override
    public IngredientDTO create(IngredientCreateRequest request) {

        Ingredient ingredient = Ingredient.builder()
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .name(request.getName())
                .status(Status.ACTIVE)
                .build();

        save(ingredient);

        return IngredientMapper.INSTANCE.toDTO(ingredient);
    }

    @Override
    public IngredientDTO save(Ingredient ingredient) {
        return IngredientMapper.INSTANCE.toDTO(repository.save(ingredient));
    }

    @Override
    public IngredientDTO getById(Long id, int languageOrdinal) {
        Language language = Language.getLanguage(languageOrdinal);

        return IngredientMapper.INSTANCE.toDTO(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(ResourceBundleLanguage.periodMessage(language, "entityNotFound"))));
    }

    @Override
    public List<IngredientDTO> getAll() {
        return IngredientMapper.INSTANCE.toDTOS(repository.findAll());
    }
}
