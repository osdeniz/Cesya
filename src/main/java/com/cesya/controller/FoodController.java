package com.cesya.controller;

import com.cesya.dto.FoodDto;
import com.cesya.entity.FoodEntity;
import com.cesya.exception.CustomException;
import com.cesya.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/food", produces = "application/json")
public class FoodController {

    @Autowired
    IFoodService foodService;

   @PostMapping(value = "createOrUpdate")
    public FoodEntity create(@RequestParam("userId") Long userId, @RequestBody FoodDto foodDto) throws CustomException{
       return foodService.createOrUpdate(foodDto,userId)
   }






}
