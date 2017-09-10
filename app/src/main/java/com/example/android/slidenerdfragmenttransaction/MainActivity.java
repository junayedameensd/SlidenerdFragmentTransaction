package com.example.android.slidenerdfragmenttransaction;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mManager = getFragmentManager();
    }

    public void addA(View view) {

        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.group, f1, "A");
        transaction.commit();
    }

    public void addB(View view) {

        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.group, f2, "B");
        transaction.commit();
    }

    public void removeA(View view) {

        FragmentA fragmentA = (FragmentA) mManager.findFragmentByTag("A");
        FragmentTransaction transaction = mManager.beginTransaction();
        if (fragmentA != null) {
            transaction.remove(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A not added", Toast.LENGTH_SHORT).show();
        }

    }

    public void removeB(View view) {

        FragmentB fragmentB = (FragmentB) mManager.findFragmentByTag("B");
        FragmentTransaction transaction = mManager.beginTransaction();
        if (fragmentB != null) {
            transaction.remove(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B not added", Toast.LENGTH_SHORT).show();
        }

    }

    public void attachA(View view) {

        FragmentA fragmentA = (FragmentA) mManager.findFragmentByTag("A");
        FragmentTransaction transaction = mManager.beginTransaction();
        if (fragmentA != null) {
            transaction.attach(fragmentA);
            transaction.commit();
        }
    }

    public void attachB(View view) {
        FragmentB fragmentB = (FragmentB) mManager.findFragmentByTag("B");
        FragmentTransaction transaction = mManager.beginTransaction();
        if (fragmentB != null) {
            transaction.attach(fragmentB);
            transaction.commit();
        }
    }

    public void detachA(View view) {

        FragmentA fragmentA = (FragmentA) mManager.findFragmentByTag("A");
        FragmentTransaction transaction = mManager.beginTransaction();
        if (fragmentA != null) {
            transaction.detach(fragmentA);
            transaction.commit();
        }

    }

    public void detachB(View view) {
        FragmentB fragmentB = (FragmentB) mManager.findFragmentByTag("B");
        FragmentTransaction transaction = mManager.beginTransaction();
        if (fragmentB != null) {
            transaction.detach(fragmentB);
            transaction.commit();
        }

    }

    public void replaceAwithB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.replace(R.id.group, fragmentB, "B");
        transaction.commit();
    }

    public void replaceBwithA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.replace(R.id.group, fragmentA, "B");
        transaction.commit();

    }
}
