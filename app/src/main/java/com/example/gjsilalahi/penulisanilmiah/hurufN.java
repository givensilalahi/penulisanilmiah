package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufN extends AppCompatActivity {
    ImageView playN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_n);
        final MediaPlayer N = (MediaPlayer.create(this, R.raw.n));
        N.start();
        playN = findViewById(R.id.soundN);
        playN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                N.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufN.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}