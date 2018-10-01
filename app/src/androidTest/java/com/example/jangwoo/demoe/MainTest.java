package com.example.jangwoo.demoe;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;


@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testChatId(){
        onView(withId(R.id.main_app_name_textView)).check(matches(isDisplayed()));
//        onView(withText("小马编程")).check(matches(isDisplayed()));
        onView(withId(R.id.main_home_button))
                .perform(click())
                .check(matches(not(isEnabled())));


    }

    @Test
    public void toolbarTitle(){
//        CharSequence title = InstrumentationRegistry
//                .getTargetContext().getString(R.string.my_title)
    }

    @After
    public void tearDown() throws Exception{

    }
}
