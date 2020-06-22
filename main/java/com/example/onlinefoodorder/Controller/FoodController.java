package com.example.onlinefoodorder.Controller;

import com.example.onlinefoodorder.Service.FoodService;
import com.example.onlinefoodorder.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired             //Annotation is used in other to inject an instance of the bellow class
    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/foods")
    public List<Food> listAllFood(){
        return foodService.listAll();
    }

    @PostMapping("/buy")
    public void insertFood(Food food){
        foodService.save(food);
    }
}
