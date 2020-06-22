package com.example.onlinefoodorder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String foodname;
    private int numberofplates;
    private long phonenumber;
    private float priceperplate;

    public Food(){


    }

//    public Food(Integer id, String foodname, int numberofplates, int phonenumber){
//
//        getFoodname(foodname);
//        getNumberofplates(numberofplates);
//        getPhonenumber(phonenumber);
//        getPriceperplate(priceperplate);
//        getId(id);
//
//
//    }

    public float getPriceperplate(float priceperplate) {
        return this.priceperplate;
    }

    public void setPriceperplate(float priceperplate) {
        this.priceperplate = priceperplate;
    }

    public Integer getId(Integer id) {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public void setNumberofplates(int numberofplates) {
        this.numberofplates = numberofplates;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFoodname(String foodname) {
        return this.foodname;
    }

    public int getNumberofplates(int numberofplates) {
        return this.numberofplates;
    }

    public long getPhonenumber(int phonenumber) {
        return this.phonenumber;
    }
}
