package com.example.stories;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class StoriesDisplay extends AppCompatActivity {
    private ImageView imgStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        imgStory = findViewById(R.id.imgStory);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            imgStory.setImageResource(bundle.getInt("image"));
        }
    }
}
