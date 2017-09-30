package com.example.harika.assignment4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    public interface coverPage{
        public void loadCoverPage(int index);
    }
    Button aboutMe;
    Button viewPager;
    Fragment AboutMe;
    private coverPage interfaceImplmentor;

    private FragmentTransaction fragmentTransaction;
    public final static String MAIN_FRAGMENT_TAG="MAIN_FRAGMENT";


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        this.interfaceImplmentor=(coverPage)context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
    /*    aboutMe = (Button)rootView.findViewById(R.id.AboutMe);
        aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                AboutMe = new AboutMe();
                fragmentTransaction.replace(R.id.container,AboutMe,MAIN_FRAGMENT_TAG);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });*/

        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstancsState)
    {
        super.onActivityCreated(savedInstancsState);
        aboutMe=(Button)getActivity().findViewById(R.id.AboutMe);
        viewPager = (Button)getActivity().findViewById(R.id.ViewPager);

        aboutMe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View virew){
                interfaceImplmentor.loadCoverPage(1);
            }
        });
        viewPager.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View virew){
                interfaceImplmentor.loadCoverPage(2);
            }
        });

    }

    // TODO: Rename method, update argument and hook method into UI event

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
