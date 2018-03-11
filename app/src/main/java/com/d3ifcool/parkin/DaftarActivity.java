package com.d3ifcool.parkin;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DaftarActivity extends AppCompatActivity {
    TextView txt_masuk;
    ImageView btn_daftar;
    EditText username_daftar,password_daftar,email_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        btn_daftar = (ImageView)findViewById(R.id.btn_daftar);
        txt_masuk = (TextView)findViewById(R.id.txt_masuk);
        username_daftar = (EditText)findViewById(R.id.username_daftar);
        password_daftar = (EditText)findViewById(R.id.password_daftar);
        email_daftar = (EditText)findViewById(R.id.email_daftar);
        txt_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });


        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname =  username_daftar.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(),uname+" Berhasil Daftar",Toast.LENGTH_SHORT);
                toast.show();
                username_daftar.setText("");
                email_daftar.setText("");
                password_daftar.setText("");
            }
        });
    }
}
