package com.cesya.controller;

import com.cesya.dto.FoodDto;
import com.cesya.entity.FoodEntity;
import com.cesya.exception.CustomException;
import com.cesya.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/food", produces = "application/json")
public class FoodController {

    @Autowired
    IFoodService foodService;

   @PostMapping(value = "createOrUpdate")
    public FoodEntity create(@RequestBody FoodDto foodDto) throws CustomException{
       return foodService.createOrUpdate(foodDto);
   }
    @RequestMapping(value = "allList",method = RequestMethod.GET)
    public List<FoodEntity> getAllList(){
        return foodService.getAllList();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id) throws CustomException {
        return foodService.deleteById(id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public FoodEntity getById(@PathVariable Long id){
        return  foodService.getById(id);
    }

    @RequestMapping(value = "/search/{search}",method = RequestMethod.GET)
    public List<FoodEntity> search(@PathVariable String search){
        return foodService.search(search);
    }






}
