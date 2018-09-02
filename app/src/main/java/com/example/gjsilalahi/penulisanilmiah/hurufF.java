package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufF extends AppCompatActivity {
    ImageView playF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_f);
        final MediaPlayer F = (MediaPlayer.create(this, R.raw.f));
        F.start();
        playF = findViewById(R.id.soundF);
        playF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                F.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufF.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}