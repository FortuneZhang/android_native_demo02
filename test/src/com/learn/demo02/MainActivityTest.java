package com.learn.demo02;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;


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

    private MainActivity mainActivity = null;
    private MainActivity activity;
    private TextView helloText;

    public MainActivityTest() {
        super("com.learn.demo02", MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);
        activity = getActivity();
        helloText = (TextView) activity.findViewById(R.id.hello_text);
    }

    public void test_pre_conditions() {

        assertEquals(helloText.getText(),"Hello World, MainActivity");

    }







//    @Override
//    protected void setUp() throws Exception {
//        try {
//            super.setUp();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        Intent intent = new Intent();
//
//        intent.setClassName("com.learn.demo01", MainActivity.class.getName());
//
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        mainActivity = (MainActivity) getInstrumentation().startActivitySync(intent);
//
//
//    }


}
