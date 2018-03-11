package com.d3ifcool.parkin;


import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    ImageButton floatbtn;
    Button btn_hapus1;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        floatbtn = (ImageButton)v.findViewById(R.id.test);
        btn_hapus1 = (Button)v.findViewById(R.id.btn_hapus1);
        final BlankFragment blankFragment = new BlankFragment();
        floatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ChangeFragment();
            }
        });

        
        btn_hapus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setMessage("Yakin Akan Di Hapus?")
                    .setPositiveButton("ok", null)
                    .setNegativeButton("Cancel",null);
            AlertDialog alert = builder.create();
            alert.show();
            }
        });

        return v;
    }
    private void ChangeFragment(){
    getFragmentManager().beginTransaction().replace(R.id.frame_parkir,new MainFragment()).addToBackStack(null).commit();
    }
}
