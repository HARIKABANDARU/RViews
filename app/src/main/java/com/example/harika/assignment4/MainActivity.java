package com.example.harika.assignment4;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.facebook.drawee.backends.pipeline.Fresco;
public class MainActivity extends AppCompatActivity implements MainFragment.coverPage {
    MainFragment mainFragment;
    private FragmentTransaction fragmentTransaction;
    public final static String MAIN_FRAGMENT_TAG = "MAIN_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fresco.initialize(this);

        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            mainFragment = new MainFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.containermain, mainFragment)
                    .commit();
        }
    }

    @Override
    public void loadCoverPage(int index) {
        if (index == 1) {
            AboutMe AboutMe = new AboutMe();
            getSupportFragmentManager().beginTransaction().replace(R.id.containermain, AboutMe).addToBackStack(null).commit();
        } else if (index == 2) {
            Intent lIntent = new Intent(MainActivity.this, RecycleViewActivity.class);
            startActivity(lIntent);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionalmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.coverPage:
                AboutMe AboutMe = new AboutMe();
                getSupportFragmentManager().beginTransaction().replace(R.id.containermain, AboutMe).addToBackStack(null).commit();
                return true;
            case R.id.recycleview:
                Intent vPager = new Intent(this,RecycleViewActivity.class);
                startActivity(vPager);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentByTag("MAIN_FRAGMENT") != null) {
            Log.d("Back Button","Back pressed");
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

}
