package com.example.etikservengizlidegerlereyolculuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Basla(View view){
        Intent intent = new Intent(getApplicationContext(),HaritaActivity.class);
        startActivity(intent);

    }

    /*public void NasilOynanir(View view){
        Intent intent = new Intent(getApplicationContext(),HaritaActivity.class);
        startActivity(intent);

    }*/ //Activitysi yok
}