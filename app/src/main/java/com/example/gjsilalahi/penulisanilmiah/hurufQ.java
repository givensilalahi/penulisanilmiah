package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufQ extends AppCompatActivity {
    ImageView playQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_q);
        final MediaPlayer Q = (MediaPlayer.create(this, R.raw.q));
        Q.start();
        playQ = findViewById(R.id.soundQ);
        playQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufQ.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}