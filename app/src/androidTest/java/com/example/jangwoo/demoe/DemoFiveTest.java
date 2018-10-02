package com.example.jangwoo.demoe;

import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.jangwoo.demoe.models.Tut;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class DemoFiveTest {

    @Rule
    public ActivityTestRule<DemoFiveActivity> activityRule = new ActivityTestRule<>(DemoFiveActivity.class);

    @Test
    public void clickItem() {
        onView(withId(R.id.demo_five_textView))
                .check(matches(not(isDisplayed())));

        onData(withValue("kotlin"))
                .inAdapterView(withId(R.id.demo_five_listview))
                .perform(click());

        onView(withId(R.id.demo_five_textView))
                .check(matches(withText("kotlin")))
                .check(matches(isDisplayed()));
    }

    public static Matcher<Object> withValue(final String value) {
        return new BoundedMatcher<Object, Tut>(Tut.class) {
            @Override
            public void describeTo(Description description) {
                description.appendText("has value " + value);
            }
            @Override
            public boolean matchesSafely(Tut item) {
                return item.getTitle().equals(value);
            }
        };
    }
}
