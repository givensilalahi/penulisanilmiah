package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufK extends AppCompatActivity {
    ImageView playK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_k);
        final MediaPlayer K = (MediaPlayer.create(this, R.raw.k));
        K.start();
        playK = findViewById(R.id.soundK);
        playK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                K.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufK.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}