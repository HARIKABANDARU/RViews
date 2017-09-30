package com.example.harika.assignment4;

import android.support.annotation.BoolRes;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.ScaleInAnimator;

public class RecyclerViewFragment extends Fragment {
    MyRecyclerViewAdapter rviewAdatper;
    MovieData mData = new MovieData();;
    RecyclerView recList;
    public onIClickListener mListenr;
    Button ClearAll;
    Button SelectAll;
    Button Delete;
    Button Sort;
    HashMap<String,Boolean> item;
    public interface onIClickListener{
        public void onListItemSelected(int position,HashMap<String,?> movie);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle SavedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recycler_view,container,false);
        recList = (RecyclerView) rootView.findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(mLayoutManager);
        rviewAdatper = new MyRecyclerViewAdapter(getActivity(),mData.getMoviesList());
        recList.setAdapter(rviewAdatper);
        mListenr = (onIClickListener)getContext();
        rviewAdatper.setOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(View v,int position)
            {
                HashMap<String,?> movie = mData.getItem(position);
                mListenr.onListItemSelected(position,movie);
            }
            @Override
            public void onItemLongClick(View v,int position)
            {
                List<Map<String,?>> movieList = mData.getMoviesList();
                Log.d("sie",String.valueOf(movieList.size()));
                HashMap<String,?> movie = (HashMap<String,?>)mData.getItem(position).clone();
                movieList.add(position,movie);
                Log.d("after adding sie",String.valueOf(movieList.size()));
                rviewAdatper.notifyItemInserted(position);

            }
        });
        itemAnimation();
        adapterAnimattion();
        ClearAll = (Button)rootView.findViewById(R.id.clear);
        ClearAll.setOnClickListener(new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v){
                        for(int i = 0;i<rviewAdatper.getItemCount();i++) {
                            item = (HashMap<String, Boolean>) mData.getItem(i);
                            item.put("selection", false);
                        }

                    }
                });
        SelectAll = (Button)rootView.findViewById(R.id.select);
        SelectAll.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < rviewAdatper.getItemCount(); i++) {
                    Log.d("inside select all ", String.valueOf(i));
                    item = (HashMap<String, Boolean>) mData.getItem(i);
                    item.put("selection", true);
                }
            }
        });
        Delete = (Button)rootView.findViewById(R.id.delete);
        Delete.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v){
                for(int i = rviewAdatper.getItemCount()-1;i>=0;i--)
                {
                    item = (HashMap<String,Boolean>)mData.getItem(i);
                    boolean b = item.get("selection");
                    Log.d("boolvalue",String.valueOf(b));
                    if(b == true)
                    {
                        mData.moviesList.remove(item);
                        rviewAdatper.notifyItemRemoved(i);
                    }
                }
            }
        });
        Sort = (Button)rootView.findViewById(R.id.sort);
       Sort.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v){
                List<Map<String,?>> mList = mData.getMoviesList();
                Collections.sort(mList, new Comparator<Map<String, ?>>() {
                    @Override
                    public int compare(Map<String, ?> stringMap, Map<String, ?> t1) {
                        Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(stringMap.get("release"));
                    }
                });
            }
        });
        return rootView;
    }
  /*  public void addItem(int position,HashMap<String,?> movie)
    {
        List<Map<String,?>> movieList = (List<Map<String,?>>)mData;
        movieList.add(position,movie);
        Log.d("value",String.valueOf(movieList.size()));
    }*/
    private void defaultAnimations(){
        DefaultItemAnimator animator = new DefaultItemAnimator();
        animator.setAddDuration(5000);
        animator.setRemoveDuration(100);
        recList.setItemAnimator(animator);
    }
    private void itemAnimation(){
        ScaleInAnimator animator = new ScaleInAnimator();
        animator.setInterpolator(new OvershootInterpolator());
        animator.setAddDuration(300);
        animator.setRemoveDuration(300);
        recList.setItemAnimator(animator);
    }

    private void adapterAnimattion(){
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(rviewAdatper);
        ScaleInAnimationAdapter scaleAdapter = new ScaleInAnimationAdapter(rviewAdatper);
        recList.setAdapter(scaleAdapter);
    }
}

