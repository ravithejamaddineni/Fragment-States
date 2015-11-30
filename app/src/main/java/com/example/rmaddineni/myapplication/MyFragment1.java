package com.example.rmaddineni.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rmaddineni on 11/30/15.
 */
public class MyFragment1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("RAVI------>", "onCreateView:First");
        return inflater.inflate(R.layout.first_fragment, null);

    }
}
