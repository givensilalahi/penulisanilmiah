package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufA extends AppCompatActivity {

    ImageView playA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_a);
        final MediaPlayer A = (MediaPlayer.create(this, R.raw.a));
        A.start();
        playA = findViewById(R.id.soundA);
        playA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufA.this, alphabet2.class);
        startActivity(back);
    }
}
