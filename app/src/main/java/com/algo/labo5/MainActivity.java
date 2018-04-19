package com.algo.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        series=new ArrayList<>();
        rv= findViewById(R.id.recycler);
        rv.setHasFixedSize(true); //Que hace esto we !!!!

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter = new SeriesAdapter(series);
        rv.setAdapter(adapter);

    }

    public void prepareSeries(){
        String TAG = "Mensaje";
        series = new ArrayList<>();
        series.add(new Serie("Super Mario Odyssey", "1" ,R.drawable.mario, "The most recent Game of the Super Mario saga"));
        series.add(new Serie("Super Smash Bros WiiU", "1" ,R.drawable.smash, "Super Smash Bros for Wii U"));
        series.add(new Serie("TLOZ Breath of the Wild", "1" ,R.drawable.zelda, "One of the most impressive Game of the Last Year"));
    }
}
