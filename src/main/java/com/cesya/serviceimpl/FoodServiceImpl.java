package com.cesya.serviceimpl;

import com.cesya.dao.IFoodDao;
import com.cesya.dto.FoodDto;
import com.cesya.entity.FoodEntity;
import com.cesya.exception.CustomException;
import com.cesya.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private IFoodDao foodDao;


    @Override
    public List<FoodEntity> getAllList() {
        return getAllList();
    }

    @Override
    public FoodEntity createOrUpdate(FoodDto foodDto, Long userId) throws CustomException {
        return null;
    }

    @Override
    public String deletById(Long id, Long userId) throws CustomException {
        return null;
    }

    @Override
    public FoodEntity getById(Long id) {
        return null;
    }

    @Override
    public List<FoodEntity> search(String search) {
        return null;
    }

    @Override
    public FoodEntity newCreateOrUpdate(MultipartFile file, String json, Long userId) throws CustomException {
        return null;
    }
}
