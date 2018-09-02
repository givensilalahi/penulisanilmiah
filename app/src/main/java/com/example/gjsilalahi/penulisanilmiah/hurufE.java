package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufE extends AppCompatActivity {

    ImageView playE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_e);
        final MediaPlayer E = (MediaPlayer.create(this, R.raw.e));
        E.start();
        playE = findViewById(R.id.soundE);
        playE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufE.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}