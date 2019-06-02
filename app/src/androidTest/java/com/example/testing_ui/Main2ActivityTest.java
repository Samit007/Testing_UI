package com.example.testing_ui;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class Main2ActivityTest {

    @Rule
    public ActivityTestRule<Main2Activity>
    testRule=new ActivityTestRule<>(Main2Activity.class);

    @Test
    public  void checkNos()
    {
        onView(withId(R.id.etOne))
                .perform(typeText("12"));
        onView(withId(R.id.etTwo))
                .perform(typeText("10"));
        onView(withId(R.id.btnSum))
                .perform(click());

        onView(withId(R.id.tvResult))
                .check(matches(withText("22")));
    }

}
