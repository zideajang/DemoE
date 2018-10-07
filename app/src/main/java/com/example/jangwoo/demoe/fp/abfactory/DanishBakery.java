package com.example.jangwoo.demoe.fp.abfactory;

public class DanishBakery implements Bakery {
    @Override
    public Pastry bakePastry(Topping topping) {
        return new DanishPastry(topping);
    }

    @Override
    public Cake bakeCake() {
        return new Blekage();
    }
}
