package com.example.rmaddineni.myapplication;

import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rmaddineni on 11/30/15.
 */
public  class MyFragment2 extends Fragment implements View.OnClickListener {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("MyFragment2", "onAttach: ");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyFragment2", "onCreate: ");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("RAVI------>", "onCreateView:Second");
        View v = inflater.inflate(R.layout.second_fragment, null);
        v.findViewById(R.id.button2).setOnClickListener(this);
        return v;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("MyFragment2", "onActivityCreated: ");
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        //super.onViewStateRestored(savedInstanceState);
        Log.d("MyFragment2", "onViewStateRestored: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("MyFragment2", "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("MyFragment2", "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("MyFragment2", "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("MyFragment2", "onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("MyFragment2", "onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyFragment2", "onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("MyFragment2", "onDetach: ");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button2){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new MyFragment1(), "third").addToBackStack(null).commit();
        }
    }
}
