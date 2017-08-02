package com.example.qenawi.jokelipandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityAndroidLip extends AppCompatActivity {
TextView view1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_lip);
        view1=(TextView) findViewById(R.id.textView);
        try
        {
            view1.setText(getIntent().getExtras().getString(getString(R.string.joke)));
        }catch (Exception ignore){}


    }
}
