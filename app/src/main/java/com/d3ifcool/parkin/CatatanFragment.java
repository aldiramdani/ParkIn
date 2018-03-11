package com.d3ifcool.parkin;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CatatanFragment extends Fragment {

    Button btn_bagi,btn_hapus1;

    public CatatanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_catatan, container, false);
        btn_bagi = (Button)v.findViewById(R.id.btn_bagi);
        btn_hapus1 = (Button)v.findViewById(R.id.btn_hapus1);
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
        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
        return v;
    }

}
