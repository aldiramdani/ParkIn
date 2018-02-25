package com.d3ifcool.parkin;


import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    ImageButton floatbtn;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        floatbtn = (ImageButton)v.findViewById(R.id.test);
        final BlankFragment blankFragment = new BlankFragment();
        floatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ChangeFragment();
            }
        });
        return v;

    }
    private void ChangeFragment(){
    getFragmentManager().beginTransaction().replace(R.id.frame_parkir,new MainFragment()).addToBackStack(null).commit();
    }
}
