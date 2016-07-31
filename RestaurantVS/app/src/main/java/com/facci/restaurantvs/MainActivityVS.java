package com.facci.restaurantvs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityVS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_vs);
    }
    public void click1(View v){
        Toast.makeText(MainActivityVS.this,"Comida del menu",Toast.LENGTH_SHORT).show();

    }
    public void click2(View v){
        Toast.makeText(MainActivityVS.this,"POSTRE",Toast.LENGTH_SHORT).show();

    }
    public void click3(View v){
        Toast.makeText(MainActivityVS.this,"SANDUCHE",Toast.LENGTH_SHORT).show();

    }
    public void click4(View v){
        Toast.makeText(MainActivityVS.this,"HAMBURGUESA",Toast.LENGTH_SHORT).show();

    }
    public void click5(View v){
        Toast.makeText(MainActivityVS.this,"TACOS",Toast.LENGTH_SHORT).show();

    }
    public void click6(View v){
        Toast.makeText(MainActivityVS.this,"SOPA COREANA",Toast.LENGTH_SHORT).show();

    }
    public void click7(View v){
        Toast.makeText(MainActivityVS.this,"FILETE",Toast.LENGTH_SHORT).show();

    }
}
