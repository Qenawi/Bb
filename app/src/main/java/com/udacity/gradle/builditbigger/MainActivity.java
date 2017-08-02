package com.udacity.gradle.builditbigger;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.JavaLipMain;
public class MainActivity extends AppCompatActivity {

    JavaLipMain OP = new JavaLipMain();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJokeOnclick(View view)
    {
        new Async(this).execute();
    }
}
