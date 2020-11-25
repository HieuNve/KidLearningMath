package com.example.huycode;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TapDemActivity extends AppCompatActivity {

    ImageView imageViewQuayLai, imgSo1;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_dem);

        DialogHDLam();
        //Ánh xạ
        imgSo1 = findViewById(R.id.imgSo1TapDem);
        mediaPlayer = MediaPlayer.create(this, R.raw.amthanhso1);
        imageViewQuayLai = findViewById(R.id.imgQuayLaiCuaMHTapDem);
        imgSo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        //Chuyển màn hình
        //Quay lại:
        imageViewQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuayLai = new Intent(TapDemActivity.this, ManHinhChinhActivity.class);
                startActivity(intentQuayLai);
            }
        });
    }

    public void DialogHDLam() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TapDemActivity.this);
        alertDialogBuilder.setView(R.layout.dialod_hdtapdem);
        alertDialogBuilder.setTitle("Hướng dẫn");
        alertDialogBuilder
                .setMessage("Bấm để chọn")
                .setCancelable(false)
                .setNegativeButton("Tiếp tục", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}