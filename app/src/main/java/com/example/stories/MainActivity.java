package com.example.stories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.StoriesAdapter;
import model.Stories;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        //create list of stories
        List<Stories> storiesList = new ArrayList<>();
        storiesList.add(new Stories(R.drawable.bhuwan,R.drawable.anmol));
        storiesList.add(new Stories(R.drawable.bhuwan,R.drawable.anmol));
        storiesList.add(new Stories(R.drawable.bhuwan,R.drawable.anmol));
        storiesList.add(new Stories(R.drawable.bhuwan,R.drawable.anmol));
        storiesList.add(new Stories(R.drawable.bhuwan,R.drawable.anmol));
        storiesList.add(new Stories(R.drawable.bhuwan,R.drawable.anmol));

        StoriesAdapter storiesAdapter = new StoriesAdapter(this, storiesList);
        recyclerView.setAdapter(storiesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));

    }
}
