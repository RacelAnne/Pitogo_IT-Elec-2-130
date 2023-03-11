package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivityFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button firstFragmentBtn, secondFragmentBtn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        firstFragmentBtn = (Button) findViewById(R.id.firstFragmentBtn);
        secondFragmentBtn = (Button) findViewById(R.id.secondFragmentBtn);
    }
}