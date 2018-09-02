package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufX extends AppCompatActivity {
    ImageView playX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_x);
        final MediaPlayer X = (MediaPlayer.create(this, R.raw.x));
        X.start();
        playX = findViewById(R.id.soundX);
        playX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufX.this, alphabet2.class);
        startActivity(back);
    }
}