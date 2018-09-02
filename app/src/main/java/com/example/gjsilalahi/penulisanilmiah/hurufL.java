package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufL extends AppCompatActivity {
    ImageView playL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_l);
        final MediaPlayer L = (MediaPlayer.create(this, R.raw.l));
        L.start();
        playL = findViewById(R.id.soundL);
        playL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufL.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}