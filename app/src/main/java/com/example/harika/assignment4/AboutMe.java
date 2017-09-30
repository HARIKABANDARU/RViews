package com.example.harika.assignment4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AboutMe.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AboutMe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutMe extends android.support.v4.app.Fragment {

    public AboutMe() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_me, container, false);
    }


}
