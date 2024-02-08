package com.example.coffee.controller;

import com.example.coffee.model.request.DrinkCreateRequest;
import com.example.coffee.model.request.DrinkTypeCreateRequest;
import com.example.coffee.service.DrinkService;
import com.example.coffee.service.DrinkTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/drink_type")
@RequiredArgsConstructor
public class DrinkTypeController {

    private final DrinkTypeService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DrinkTypeCreateRequest request){
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
}
