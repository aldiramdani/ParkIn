package com.d3ifcool.parkin;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditFragment extends Fragment {
ImageView btnback_update;

    public EditFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_edit, container, false);
        btnback_update = (ImageView)v.findViewById(R.id.btnback_update);
        btnback_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getContext(),"Sudah TerUpdate",Toast.LENGTH_SHORT);
            ChangeFramentEdit();
            }
        });

        return v;
    }
    private void ChangeFramentEdit(){
        getFragmentManager().beginTransaction().replace(R.id.frame_parkir,new BlankFragment()).addToBackStack(null).commit();
    }
}
