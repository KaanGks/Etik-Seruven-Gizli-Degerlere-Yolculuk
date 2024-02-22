package com.example.etikservengizlidegerlereyolculuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.etikservengizlidegerlereyolculuk.databinding.ActivityHaritaBinding;
import com.example.etikservengizlidegerlereyolculuk.databinding.ActivityMainBinding;
import com.example.etikservengizlidegerlereyolculuk.databinding.ActivitySoruBinding;

public class HaritaActivity extends AppCompatActivity {

    private ActivityHaritaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harita);

        binding = ActivityHaritaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void Yonlendir(View view)
    {
        Intent intent = new Intent(getApplicationContext(),SoruActivity.class);
        startActivity(intent);
    }
}