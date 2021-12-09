package com.example.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toastmodule.ToastClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastClass.simpletoast(getApplicationContext(),"hi");
    }
}