package com.example.jangwoo.demoe.presenter;

public class UsernameShouldContainsJCharacater extends ValuatorChain {

    public UsernameShouldContainsJCharacater(Valuator next) {
        super(next);
    }

    @Override
    public boolean evaluate(User user) {
        if( user.getUsername().contains("j")){
            return super.evaluate(user);
        }

        return false;
    }
}
