package com.example.jangwoo.demoe.presenter;

public class UsernameEmptyValuate extends ValuatorChain {

    public UsernameEmptyValuate(Valuator next) {
        super(next);
    }

    @Override
    public boolean evaluate(User user) {
        return user.getUsername().isEmpty();
    }
}
