package com.app.smart.lessonfrag.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.app.smart.lessonfrag.Activities.MainActivity;
import com.app.smart.lessonfrag.R;
import com.app.smart.lessonfrag.Activities.SecondActivity;

public class Fragment2 extends Fragment{

    private static final String TAG = "Fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2_layout, container,false);

        btnNavFrag1 = view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = view.findViewById(R.id.btnNavFrag3);
        btnNavSecondActivity = view.findViewById(R.id.btnNavFrag4);

        Log.d(TAG,"onCreateView: started.");

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Going to Fragment1", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Going to Fragment2", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Going to Fragment3", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Going to Fragment1", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getActivity(),SecondActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
