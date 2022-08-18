package com.example.quotesapp;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class AloneData {
    public int aloneimage;

    public AloneData(int aloneimage) {
        this.aloneimage = aloneimage;
    }

    public static class AloneHolder extends RecyclerView.ViewHolder {
        public AloneHolder(View inflate) {
            super(inflate);
        }
    }
}
