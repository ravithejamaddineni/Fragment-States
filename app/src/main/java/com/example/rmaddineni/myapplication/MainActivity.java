package com.example.rmaddineni.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private FragmentManager mFragmentManger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.start_activity_button).setOnClickListener(this);
        mFragmentManger = getSupportFragmentManager();

        Fragment first;
        // surprisingly the fragmnets which are added are getting retained even if the configuration is changed so no need to add them again
        if(mFragmentManger.findFragmentByTag("First Fragment")!=null) {
            first = mFragmentManger.findFragmentByTag("First Fragment");
        }else{
            first = new MyFragment1();
            mFragmentManger.beginTransaction().replace(R.id.container, first, "First Fragment").commit();
        }

        Log.d(TAG, "onCreate: ");
    }

    @Override
    public void onClick(View v) {
       if(v.getId() == R.id.button){
           mFragmentManger.beginTransaction().replace(R.id.container,new MyFragment2(),"Second Fragment").addToBackStack(null).commit();
       }else if(v.getId() == R.id.start_activity_button){
           Intent i =  new Intent(this,Main2Activity.class);
           startActivity(i);
       }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}
