package com.example.coffee.controller;


import com.example.coffee.model.DTO.DrinkDTO;
import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.entity.DrinkType;
import com.example.coffee.model.request.DrinkCreateRequest;
import com.example.coffee.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drink")
@RequiredArgsConstructor
public class DrinkController {

    private final DrinkService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DrinkCreateRequest request){
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/getById")
    public ResponseEntity<?> getById(@RequestParam Long id, @RequestHeader int languageOrdinal){
        return ResponseEntity.ok(service.getById(id, languageOrdinal));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/type")
    public ResponseEntity<?> getByType(@RequestBody DrinkType drinkType,@RequestHeader int languageOrdinal) {
        return  ResponseEntity.ok(service.getByType(drinkType, languageOrdinal));
    }
}
