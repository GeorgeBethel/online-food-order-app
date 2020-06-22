package com.example.onlinefoodorder.Dao;

import com.example.onlinefoodorder.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodDao extends JpaRepository<Food, Integer> {



}
