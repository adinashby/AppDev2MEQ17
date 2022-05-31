package com.example.week6part1espresso;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule
            = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    private String mName = "Tony";

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testUserInputScenario() {
        // input some text in the edit
        Espresso.onView(withId(R.id.editTextToChange)).perform(typeText(mName));

        // close soft keyboard
        Espresso.closeSoftKeyboard();

        // perform button click
        Espresso.onView(withId(R.id.btnChange)).perform(click());

        // checking the text in the textview
        Espresso.onView(withId(R.id.textViewChangedText)).check(matches(withText(mName)));
    }

    @After
    public void tearDown() throws Exception {

    }
}

