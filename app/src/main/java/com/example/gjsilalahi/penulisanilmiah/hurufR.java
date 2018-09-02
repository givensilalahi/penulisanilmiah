package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufR extends AppCompatActivity {
    ImageView playR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_r);
        final MediaPlayer suaraR = (MediaPlayer.create(this, R.raw.suarar));
        suaraR.start();
        playR = findViewById(R.id.soundR);
        playR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraR.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufR.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}