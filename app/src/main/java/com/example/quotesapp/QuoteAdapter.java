package com.example.quotesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteHolder> {

    private final Mainactivityinterface mainactivityinterface;

    List<QuoteData> quoteData ;

    public QuoteAdapter(List<QuoteData> quoteData ,Mainactivityinterface mainactivityinterface) {
        this.quoteData = quoteData;
        this.mainactivityinterface =mainactivityinterface;

    }

    @NonNull
    @Override
    public QuoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuoteHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteAdapter.QuoteHolder holder, int position) {

        holder.idname.setText(quoteData.get(position).name);
        holder.profile.setImageResource(quoteData.get(position).image);

//        LinearLayout click = null;
//        click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return quoteData.size();
    }

    public class QuoteHolder extends RecyclerView.ViewHolder {
        CircleImageView profile;
        TextView idname;
        LinearLayout click;

        public QuoteHolder(View inflate) {
            super(inflate);

            profile = inflate.findViewById(R.id.profile);
            idname = inflate.findViewById(R.id.idname);
            click =inflate.findViewById(R.id.click);

            inflate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mainactivityinterface != null){
                        int pos =getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            mainactivityinterface.onItemClick(pos);
                        }
                    }
                }
            });

        }
    }
}
