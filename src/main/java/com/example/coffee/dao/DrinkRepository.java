package com.example.coffee.dao;

import com.example.coffee.model.entity.Drink;
import com.example.coffee.model.entity.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {

    List<Drink> findDrinksByDrinkType(DrinkType drinkType);
}
