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
    List<Drink> findDrinksByName(String name);

    @Query(value = "SELECT d FROM Drink d " +
            "WHERE (:drinkTypeId IS NULL OR d.drinkType.id = :drinkTypeId) " +
            "AND (:priceFrom IS NULL OR d.price >= :priceFrom) " +
            "AND (:priceTo IS NULL OR d.price <= :priceTo)", nativeQuery = true)
    List<Drink> filter(Long drinkTypeId, Integer priceFrom, Integer priceTo);

}
