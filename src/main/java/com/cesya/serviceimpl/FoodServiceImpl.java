package com.cesya.serviceimpl;

import com.cesya.dao.IFoodDao;
import com.cesya.dto.FoodDto;
import com.cesya.entity.FoodEntity;
import com.cesya.exception.CustomException;
import com.cesya.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Service
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private IFoodDao foodDao;



    @Override
    public List<FoodEntity> getAllList() {
        List<FoodEntity> foods = foodDao.getAllList();
        return foods;
    }

    @Override
    public FoodEntity createOrUpdate(FoodDto foodDto) throws CustomException {
        FoodEntity foodEntity = null;
        if(foodDto.getId() != null){
            foodEntity = foodDao.getById(foodDto.getId());
        }else{
            foodEntity = new FoodEntity();
            foodEntity.setCreateDate(new Date());
        }
        foodEntity.setTitle(foodDto.getTitle());
        foodEntity.setDescription(foodDto.getDescription());
        foodEntity.setPoint(foodDto.getPoint());
        foodEntity.setFoodDetails(foodDto.getFoodDetails());
        return foodDao.createOrUpdate(foodEntity);
    }

    @Override
    public String deleteById(Long id) throws CustomException {
        FoodEntity food= foodDao.getById(id);
        if(foodDao.getById(id) != null){
            int result = foodDao.removeById(id);
            return result ==1 ? "işlem başarılı !" : "işlem başarısız.";
        }
        return "işlem başarısız";
    }

    @Override
    public FoodEntity getById(Long id) {
        FoodEntity food = foodDao.getById(id);
        return food;
    }

    @Override
    public List<FoodEntity> search(String search) {
        return foodDao.search(search);
    }

/*    @Override
    public FoodEntity newCreateOrUpdate(MultipartFile file, String json, Long userId) throws CustomException {
        return null;
    }*/
}
