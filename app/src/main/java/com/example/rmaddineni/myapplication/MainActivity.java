package com.example.rmaddineni.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new MyFragment1(),"First Fragment").commit();
    }

    @Override
    public void onClick(View v) {
       if(v.getId() == R.id.button){
           getSupportFragmentManager().beginTransaction().replace(R.id.container,new MyFragment2(),"Second Fragment").addToBackStack(null).commit();
       }
    }




}
