package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufB extends AppCompatActivity {

    ImageView playB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_b);
        final MediaPlayer B = (MediaPlayer.create(this, R.raw.b));
        B.start();
        playB = findViewById(R.id.soundB);
        playB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufB.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}