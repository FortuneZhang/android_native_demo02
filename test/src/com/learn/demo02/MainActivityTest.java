package com.learn.demo02;

import android.test.ActivityInstrumentationTestCase2;

import com.learn.demo02.MainActivity;


/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.learn.demo02.MainActivityTest \
 * com.learn.demo02.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.learn.demo02", MainActivity.class);
    }

}
