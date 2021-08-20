package com.example.imagebotonkevinulquiango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo btn erina

    public void mensajeErina(View view){
        Toast.makeText(this,"Imagen Erina",Toast.LENGTH_SHORT).show();
    }
    //Metodo btn Garfiel
    public void mensajeGarfiel(View view){
        Toast.makeText(this,"Imagen Garfiel",Toast.LENGTH_SHORT).show();
    }
}