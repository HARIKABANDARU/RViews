package com.example.harika.assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecyclerViewActivity extends AppCompatActivity implements MyRecyclerViewAdapter.OnItemClickListener{
    MyRecyclerViewAdapter rviewAdatper;
    MovieData mData;
    RecyclerView recList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler_view);
        recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(mLayoutManager);
        mData = new MovieData();
        rviewAdatper = new MyRecyclerViewAdapter(this,mData.getMoviesList());
        recList.setAdapter(rviewAdatper);
        rviewAdatper.setOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(View v, int position){
                HashMap<String,?> movie = (HashMap<String,?>)mData.getItem(position);
              //  mListener.onListItemSelected(position,movie);
            }
            @Override
            public void onItemLongClick(View v,int position)
            {
                addItem(position,(HashMap) ((HashMap)mData.getItem(position)).clone());
                rviewAdatper.notifyItemInserted(position);
            }
        });
        defaultAnimations();
    }
    public void addItem(int position,HashMap<String,?> movie)
    {
        List<Map<String,?>> movieList = (List<Map<String,?>>)mData;
        movieList.add(position,movie);
    }
    private void defaultAnimations(){
        DefaultItemAnimator animator = new DefaultItemAnimator();
        animator.setAddDuration(5000);
        animator.setRemoveDuration(100);
        recList.setItemAnimator(animator);
    }
    private void itemAnimation(){

    }

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void onItemLongClick(View view, int position) {

    }
}

