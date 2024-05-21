package com.random.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.random.kentsimgeleri.databinding.ActivityDetaylarBinding;

public class DetaylarActivity extends AppCompatActivity {
    private ActivityDetaylarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaylar);
        binding = ActivityDetaylarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent= getIntent();
        LanMark selectedLanMark=(LanMark) intent.getSerializableExtra("landmark");
        binding.nameText.setText(selectedLanMark.name);
        binding.contryText.setText(selectedLanMark.Ulke);
        binding.nameimage.setImageResource(selectedLanMark.image);




    }
}