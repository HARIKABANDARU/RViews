package com.example.harika.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import java.util.HashMap;

public class RecycleViewActivity extends AppCompatActivity implements RecyclerViewFragment.onIClickListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        RecyclerViewFragment rFragment = new RecyclerViewFragment();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, rFragment).addToBackStack(null).commit();
        }

        // MovieDetailFragment mfragment = new MovieDetailFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.container,mfragment).commit();
    }



    @Override
    public void onResume() {
        super.onResume();
    }

        @Override
    public void onListItemSelected(int position, HashMap<String, ?> movie) {

        getSupportFragmentManager().beginTransaction().replace(R.id.container,MovieDetailFragment.newInstance(movie)).addToBackStack(null).commit();
    }
}
