package com.example.jangwoo.demoe.presenter;

import com.example.jangwoo.demoe.repository.LoginRepository;
import com.example.jangwoo.demoe.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter{

    LoginView loginView;
    LoginRepository repository;

    public LoginPresenterImpl(LoginView loginView, LoginRepository repository) {
        this.loginView = loginView;
        this.repository = repository;
    }

    @Override
    public void login(String username, String password) {
        Valuator emptyValuate = new UsernameEmptyValuate();
        ValuatorChain valuatorChain = new ValuatorChain(emptyValuate);

        System.out.println(valuatorChain.evaluate(new User(username)));
        if(valuatorChain.evaluate(new User(username))){
            loginView.showMessage("empty username");
            return;
        }

        if(repository.login(username,password)){
            loginView.successLogin();
        }else {
            loginView.failLogin();
        }
    }

    @Override
    public void logout(String username) {

    }
}
