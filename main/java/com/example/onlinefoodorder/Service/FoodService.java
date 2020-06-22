package com.example.onlinefoodorder.Service;

import com.example.onlinefoodorder.Dao.FoodDao;
import com.example.onlinefoodorder.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodDao foodDao;

 public FoodService(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    public List<Food> listAll(){
        return foodDao.findAll();
    };

    public Food get(Integer id){
        return foodDao.findById(id).get();
    }

    public void save(Food food){
        foodDao.save(food);
    }
    public void delete(Integer id){
        foodDao.deleteById(id);
    }
}
