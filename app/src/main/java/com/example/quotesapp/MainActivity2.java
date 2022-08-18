package com.example.quotesapp;

import static com.example.quotesapp.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    int aloneimage[]={alone1,alone2,alone3,alone4,alone5};

    RecyclerView alonegrid;
    List<AloneData> aloneData=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        alonegrid = findViewById(R.id.alonegrid);



        for( int i=0;i< aloneimage.length;i++ ){
            AloneData data = new AloneData(aloneimage[i]);
            aloneData.add(data);
        }
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(),2,GridLayoutManager.VERTICAL,false);
        AloneAdapter adapter= new AloneAdapter(aloneData);

        alonegrid.setLayoutManager(manager);
        alonegrid.setAdapter(adapter);

    }
}