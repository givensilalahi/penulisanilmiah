package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufC extends AppCompatActivity {

    ImageView playC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_c);
        final MediaPlayer C = (MediaPlayer.create(this, R.raw.c));
        C.start();
        playC = findViewById(R.id.soundC);
        playC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufC.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}