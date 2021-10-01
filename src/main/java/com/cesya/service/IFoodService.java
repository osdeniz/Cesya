package com.cesya.service;

import com.cesya.dto.FoodDto;
import com.cesya.entity.FoodEntity;
import com.cesya.exception.CustomException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IFoodService {

    List<FoodEntity> getAllList();

    FoodEntity createOrUpdate(FoodDto foodDto) throws CustomException;

    String deleteById(Long id) throws CustomException;

    FoodEntity getById(Long id);

    List<FoodEntity> search(String search);

//    FoodEntity newCreateOrUpdate(MultipartFile file,String json,Long userId) throws CustomException;


}
