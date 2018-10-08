package com.example.jangwoo.demoe.fp.abfactory;

import java.util.function.Function;

public class AnotherBakery implements Function<Topping, Pastry>{
    @Override
    public Pastry apply(Topping topping) {
        return new DanishPastry(topping);
    }
}
