package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufY extends AppCompatActivity {
    ImageView playY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_y);
        final MediaPlayer Y = (MediaPlayer.create(this, R.raw.y));
        Y.start();
        playY = findViewById(R.id.soundY);
        playY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Y.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufY.this, alphabet2.class);
        startActivity(back);

    }
}