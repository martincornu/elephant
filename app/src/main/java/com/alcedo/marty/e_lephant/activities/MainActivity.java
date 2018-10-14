package com.alcedo.marty.e_lephant.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.alcedo.marty.e_lephant.R;
import com.mancj.materialsearchbar.MaterialSearchBar;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
    {

    private List<String> lastSearches;
    private MaterialSearchBar searchBar;

    private RecyclerView recyclerView;
    private List<MyObject> videos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBar = (MaterialSearchBar) findViewById(R.id.searchBar);
        searchBar.setHint("Recherche");

        addVideo();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Adapter fill recycle view
        recyclerView.setAdapter(new CardAdapter(videos));
    }

        private void addVideo() {
            videos.add(new MyObject("Git", R.drawable.git));
            videos.add(new MyObject("Android",R.drawable.android));
            videos.add(new MyObject("xCode",R.drawable.xcode));
            videos.add(new MyObject("Mockplus",R.drawable.mockplus));
        }

        public void selectedVideo(View v)
        {
            Toast.makeText(this, "C'est parti !", Toast.LENGTH_LONG).show();
            Intent vid = new Intent(MainActivity.this, VideoActivity.class);
            startActivity(vid);
        }
}
