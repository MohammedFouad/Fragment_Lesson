package com.app.smart.lessonfrag.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.app.smart.lessonfrag.R;
import com.app.smart.lessonfrag.fragments.Fragment1;
import com.app.smart.lessonfrag.fragments.Fragment2;
import com.app.smart.lessonfrag.fragments.Fragment3;
import com.app.smart.lessonfrag.Adpators.sectionsStatePagerAdapter;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private sectionsStatePagerAdapter msectionsStatePagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "OnCreate: started:");

        msectionsStatePagerAdapter = new sectionsStatePagerAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);

        //setup pager
        setupViewPager(mViewPager);



    }

    private void setupViewPager(ViewPager viewPager){
        sectionsStatePagerAdapter adapter = new sectionsStatePagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Fragment1(), "Fragment1");
        adapter.addFragment(new Fragment2(), "Fragment2");
        adapter.addFragment(new Fragment3(), "Fragment3");

        viewPager.setAdapter(adapter);

    }

    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
