package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufI extends AppCompatActivity {

    ImageView playI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_i);
        final MediaPlayer I = (MediaPlayer.create(this, R.raw.i));
        I.start();
        playI = findViewById(R.id.soundI);
        playI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                I.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufI.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}