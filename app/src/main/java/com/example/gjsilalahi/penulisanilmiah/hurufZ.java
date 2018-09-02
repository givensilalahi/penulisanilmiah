package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufZ extends AppCompatActivity {
    ImageView playZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_z);
        final MediaPlayer Z = (MediaPlayer.create(this, R.raw.z));
        Z.start();
        playZ = findViewById(R.id.soundZ);
        playZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Z.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufZ.this, alphabet2.class);
        startActivity(back);

    }
}