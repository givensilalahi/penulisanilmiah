package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufT extends AppCompatActivity {
    ImageView playT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_t);
        final MediaPlayer T = (MediaPlayer.create(this, R.raw.t));
        T.start();
        playT = findViewById(R.id.soundT);
        playT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufT.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}