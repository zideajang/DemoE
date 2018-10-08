package com.example.jangwoo.demoe.fp.adapter;

public class MakeshiftOven extends WoodFire implements Oven {
    @Override
    public Food cook(Food food) {
        Burnt<Food> nastyFood = burn(food);

//        return nastyFood.scrapeOffBurnBits();

        return null;
    }
}
