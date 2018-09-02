package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufJ extends AppCompatActivity {
    ImageView playJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_j);
        final MediaPlayer J = (MediaPlayer.create(this, R.raw.j));
        J.start();
        playJ = findViewById(R.id.soundJ);
        playJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                J.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufJ.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}