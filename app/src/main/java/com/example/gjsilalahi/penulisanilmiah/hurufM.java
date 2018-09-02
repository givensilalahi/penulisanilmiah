package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufM extends AppCompatActivity {
    ImageView playM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_m);
        final MediaPlayer M = (MediaPlayer.create(this, R.raw.m));
        M.start();
        playM = findViewById(R.id.soundM);
        playM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                M.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufM.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}