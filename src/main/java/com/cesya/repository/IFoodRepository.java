package com.cesya.repository;

import com.cesya.entity.FoodEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IFoodRepository extends CrudRepository<FoodEntity, Long> {

    List<FoodEntity> findAll();

    List<FoodEntity> findByTitleContainingOrDescriptionContaining(String title, String description);
}
