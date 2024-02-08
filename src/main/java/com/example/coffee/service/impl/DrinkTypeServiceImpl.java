package com.example.coffee.service.impl;

import com.example.coffee.Mapper.DrinkMapper;
import com.example.coffee.Mapper.DrinkTypeMapper;
import com.example.coffee.dao.DrinkTypeRepository;
import com.example.coffee.exception.NotFoundException;
import com.example.coffee.model.DTO.DrinkTypeDTO;
import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.enums.Status;
import com.example.coffee.model.request.DrinkTypeCreateRequest;
import com.example.coffee.service.DrinkTypeService;
import com.example.coffee.utils.Language;
import com.example.coffee.utils.ResourceBundleLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkTypeServiceImpl implements DrinkTypeService {

    private final DrinkTypeRepository repository;

    @Override
    public DrinkTypeDTO create(DrinkTypeCreateRequest request) {

        DrinkType drinkType = DrinkType.builder()
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .name(request.getName())
                .status(Status.ACTIVE)
                .build();

        save(drinkType);

        return DrinkTypeMapper.INSTANCE.toDTO(drinkType);
    }

    @Override
    public DrinkTypeDTO save(DrinkType drinkType) {
        return DrinkTypeMapper
                .INSTANCE.toDTO(repository.save(drinkType));
    }

    @Override
    public DrinkTypeDTO getById(Long id, int languageOrdinal) {
        Language language = Language.getLanguage(languageOrdinal);

        return DrinkTypeMapper.INSTANCE.toDTO(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(ResourceBundleLanguage.periodMessage(language, "entityNotFound"))));
    }

    @Override
    public List<DrinkTypeDTO> getAll() {
        return DrinkTypeMapper.INSTANCE.toDTOS(repository.findAll());
    }
}
