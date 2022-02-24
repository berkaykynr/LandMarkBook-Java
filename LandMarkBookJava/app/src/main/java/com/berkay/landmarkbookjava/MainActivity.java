package com.berkay.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.berkay.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.berkay.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<LandMark> landmarks = new ArrayList<LandMark>();
        private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        LandMark galata = new LandMark("Galata Kulesi","Karaköy",R.drawable.galata);
        LandMark dolmabahce = new LandMark("Dolmabahçe Sarayı", "Beşiktaş",R.drawable.dolmabahce);
        LandMark camlica = new LandMark("Çamlıca Tepesi","Çamlıca",R.drawable.camlicatepesi);
        LandMark kizKulesi = new LandMark("Kız Kulesi", "Üsküdar",R.drawable.kizkulesi2 );
        LandMark ortakoy = new LandMark("Ortaköy Camii", "Ortaköy",R.drawable.ortakok);

        landmarks.add(galata);
        landmarks.add(dolmabahce);
        landmarks.add(camlica);
        landmarks.add(kizKulesi);
        landmarks.add(ortakoy);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarks);
        binding.recyclerView.setAdapter(landmarkAdapter);


    }
}