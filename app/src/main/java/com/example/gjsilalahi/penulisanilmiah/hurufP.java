package com.example.gjsilalahi.penulisanilmiah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hurufP extends AppCompatActivity {
    ImageView playP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_p);
        final MediaPlayer P = (MediaPlayer.create(this, R.raw.p));
        P.start();
        playP = findViewById(R.id.soundP);
        playP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                P.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(hurufP.this, alphabet2.class);
        startActivity(back);
        super.onBackPressed();
    }
}
