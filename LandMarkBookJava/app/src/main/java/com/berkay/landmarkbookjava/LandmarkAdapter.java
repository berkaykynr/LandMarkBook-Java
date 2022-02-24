package com.berkay.landmarkbookjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.berkay.landmarkbookjava.databinding.ReceyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {
    public LandmarkAdapter(ArrayList<LandMark> landMarks) {
        this.landMarks = landMarks;
    }

    ArrayList<LandMark>  landMarks;



    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ReceyclerRowBinding receyclerRowBinding = ReceyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(receyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkAdapter.LandmarkHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewTextView.setText(landMarks.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("landmark",landMarks.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return landMarks.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{
        private ReceyclerRowBinding binding;

        public LandmarkHolder(ReceyclerRowBinding binding) {

            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
