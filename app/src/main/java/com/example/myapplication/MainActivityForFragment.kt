package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityForFragment : AppCompatActivity() {
    Button firstFragmentBtn, secondFragmentBtn
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_for_fragment)


        firstFragmentBtn = (Button) findViewById(R.id.firstFragmentBtn)
        secondFragmentBtn = (Button) findViewById(R.id.secondFragmentBtn)
    }
}