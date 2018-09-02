package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufS extends AppCompatActivity {
    ImageView playS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_s);
        final MediaPlayer S = (MediaPlayer.create(this, R.raw.s));
        S.start();
        playS = findViewById(R.id.soundS);
        playS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufS.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}