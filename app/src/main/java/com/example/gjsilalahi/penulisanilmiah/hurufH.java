package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufH extends AppCompatActivity {

    ImageView playH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_h);
        final MediaPlayer H = (MediaPlayer.create(this, R.raw.h));
        H.start();
        playH = findViewById(R.id.soundH);
        playH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                H.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufH.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}