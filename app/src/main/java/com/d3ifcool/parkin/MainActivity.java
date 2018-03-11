package com.d3ifcool.parkin;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ///Test Push
    ImageView coba;
    TextView txt_daftar;
    EditText username_login;
    EditText password_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisiasi
        coba = (ImageView)findViewById(R.id.coba);
        txt_daftar = (TextView)findViewById(R.id.txt_daftar);
        username_login = (EditText)findViewById(R.id.username_login);
        password_login = (EditText)findViewById(R.id.password_login);
        //
        coba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = username_login.getText().toString();
                String password = password_login.getText().toString();
                if (username.equals("admin") & password.equals("admin")){
                Intent i = new Intent(getApplicationContext(),BerandaActivity.class);
                startActivity(i);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),"Username/Password Salah!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        txt_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),DaftarActivity.class);
                startActivity(i);
            }
        });
    }
}
