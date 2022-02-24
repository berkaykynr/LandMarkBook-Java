package com.berkay.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.berkay.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        LandMark selectedLandmark = (LandMark)intent.getSerializableExtra("landmark");

        binding.txtName.setText(selectedLandmark.name);
        binding.imageView.setImageResource(selectedLandmark.image);
        binding.txtDetails.setText(selectedLandmark.location);


    }
}