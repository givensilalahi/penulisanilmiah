package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufG extends AppCompatActivity {

    ImageView playG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_g);
        final MediaPlayer G = (MediaPlayer.create(this, R.raw.g));
        G.start();
        playG = findViewById(R.id.soundG);
        playG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                G.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufG.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}