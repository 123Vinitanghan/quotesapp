package com.example.quotesapp;

import static com.example.quotesapp.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.QuoteSpan;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Mainactivityinterface {
//    Resources res = getResources();
//    Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.alone,null);

    String name[] ={"Alone","Angry","Attitude","Life","Goal","Hard Work","Failure","Happiness","Forgiveness","Experience","Inspiration","love"};
    int   image[] ={alone,angry,attitude,life,goal,hardwork,failure,happiness,forgiveness,experience,inspire,love};
    RecyclerView quotelist;
   List<QuoteData> quoteData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quotelist = findViewById(R.id.quotelist);

        for( int i=0;i< name.length;i++ ){
            QuoteData data = new QuoteData(name[i],image[i]);
            quoteData.add(data);
        }
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(),1,GridLayoutManager.VERTICAL,false);

        QuoteAdapter adapter= new QuoteAdapter(quoteData,this);

        quotelist.setLayoutManager(manager);
        quotelist.setAdapter(adapter);

        quotelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });


    }

    @Override
    public void onItemClick(int Position) {
        startActivity(new Intent(MainActivity.this,MainActivity2.class));

    }
}