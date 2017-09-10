package com.example.android.slidenerdfragmenttransaction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 9/9/2017.
 */

public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("AAAAA", "Fragment A onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AAAAA", "Fragment A onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Log.d("AAAAA", "Fragment A onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("AAAAA", "Fragment A onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("AAAAA", "Fragment A onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("AAAAA", "Fragment A onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("AAAAA", "Fragment A onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("AAAAA", "Fragment A onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("AAAAA", "Fragment A onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("AAAAA", "Fragment A onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("AAAAA", "Fragment A onDetach");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("AAAAA", "Fragment A onSaveInstanceState");
    }
}
