package com.example.jangwoo.demoe.presenter;

public class ValuatorChain implements Valuator {
    private Valuator next;

    public ValuatorChain(Valuator next) {
        this.next = next;
    }

    @Override
    public boolean evaluate(User user) {
        return next.evaluate(user);
    }
}
