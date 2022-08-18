package com.example.quotesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AloneAdapter extends RecyclerView.Adapter<AloneAdapter.AloneHolder> {
    List<AloneData> aloneData;
    public AloneAdapter(List<AloneData> aloneData) {
        this.aloneData= aloneData;
    }

    @NonNull
    @Override
    public AloneAdapter.AloneHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AloneHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.aloneitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AloneAdapter.AloneHolder holder, int position) {
        holder.alonequote.setImageResource(aloneData.get(position).aloneimage);

    }

    @Override
    public int getItemCount() {
        return aloneData.size();
    }

    public class AloneHolder extends RecyclerView.ViewHolder {
        ImageView alonequote;
        public AloneHolder(@NonNull View itemView) {
            super(itemView);

            alonequote = itemView.findViewById(R.id.alonequote);
        }
    }
}
