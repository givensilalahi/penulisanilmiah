package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufU extends AppCompatActivity {
    ImageView playU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_u);
        final MediaPlayer U = (MediaPlayer.create(this, R.raw.u));
        U.start();
        playU = findViewById(R.id.soundU);
        playU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                U.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufU.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}