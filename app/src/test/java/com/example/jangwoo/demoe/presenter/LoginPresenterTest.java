package com.example.jangwoo.demoe.presenter;

import com.example.jangwoo.demoe.repository.LoginRepository;
import com.example.jangwoo.demoe.view.LoginView;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    LoginRepository mockReposiotry;
    @Mock
    LoginView mockView;

    LoginPresenter presenter;

    @Before
    public void setUp(){
        presenter = new LoginPresenterImpl(mockView,mockReposiotry);
    }

    @Test
    public void shouldloginSucess() {
        Assert.assertEquals(1,1);
        when(mockReposiotry.login("jangwoo","123")).thenReturn(true);
        presenter.login("jangwoo","123");
        verify(mockView).successLogin();
    }

    @Test
    public void shouldloginSucessWithPhoneAsNumber(){
        presenter.login("","123");
        verify(mockView).showMessage(anyString());
    }
}