package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufW extends AppCompatActivity {
    ImageView playW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_w);
        final MediaPlayer W = (MediaPlayer.create(this, R.raw.w));
        W.start();
        playW = findViewById(R.id.soundW);
        playW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                W.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufW.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}