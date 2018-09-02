package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufO extends AppCompatActivity {
    ImageView playO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_o);
        final MediaPlayer O = (MediaPlayer.create(this, R.raw.o));
        O.start();
        playO = findViewById(R.id.soundO);
        playO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                O.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufO.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}
