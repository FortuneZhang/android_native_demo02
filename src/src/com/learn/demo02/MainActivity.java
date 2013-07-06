package com.learn.demo02;

import android.app.Activity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        SharedPreferences sp = getSharedPreferences("", 0);
    }
}
