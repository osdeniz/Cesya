package com.cesya.dao;

import com.cesya.dto.FoodDto;
import com.cesya.entity.FoodEntity;
import com.cesya.exception.CustomException;

import java.util.List;

public interface IFoodDao {

    List<FoodEntity> getAllList();

    FoodEntity createOrUpdate(FoodEntity foodEntity);

    FoodEntity getById(Long id);

    int removeById(Long id);

    List<FoodEntity> search(String search);





}
