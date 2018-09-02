package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufD extends AppCompatActivity {

    ImageView playD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_d);
        final MediaPlayer D = (MediaPlayer.create(this, R.raw.d));
        D.start();
        playD = findViewById(R.id.soundD);
        playD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufD.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}