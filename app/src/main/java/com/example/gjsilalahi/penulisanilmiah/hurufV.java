package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufV extends AppCompatActivity {
    ImageView playV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_v);
        final MediaPlayer V = (MediaPlayer.create(this, R.raw.v));
        V.start();
        playV = findViewById(R.id.soundV);
        playV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                V.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufV.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}