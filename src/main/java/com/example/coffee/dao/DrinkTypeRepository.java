package com.example.coffee.dao;

import com.example.coffee.model.entity.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkTypeRepository extends JpaRepository<DrinkType, Long> {
}
