package com.example.gjsilalahi.penulisanilmiah;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView ivImg_play, ivImg_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        ivImg_play = (ImageView) findViewById(R.id.play);
        ivImg_info = (ImageView) findViewById(R.id.info);
        // function tombol

        ivImg_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iplay = new Intent(MainActivity.this, alphabet2.class);
                startActivity(iplay);
            }
        });

        ivImg_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iinfo = new Intent(MainActivity.this, info.class);
                startActivity(iinfo);
            }
        });

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Anda yakin ingin keluar ?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(startMain);
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog quit = builder.create();
        quit.show();
    }
}