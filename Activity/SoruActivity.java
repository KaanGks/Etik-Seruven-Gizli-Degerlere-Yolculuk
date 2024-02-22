package com.example.etikservengizlidegerlereyolculuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.etikservengizlidegerlereyolculuk.databinding.ActivityMainBinding;
import com.example.etikservengizlidegerlereyolculuk.databinding.ActivitySoruBinding;

public class SoruActivity extends AppCompatActivity {
    private ActivitySoruBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru);

        binding = ActivitySoruBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void GeriDon(View view){
        Intent intent = new Intent(getApplicationContext(),HaritaActivity.class);
        startActivity(intent);
    }
}