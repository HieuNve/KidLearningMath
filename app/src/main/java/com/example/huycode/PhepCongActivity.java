package com.example.huycode;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PhepCongActivity extends AppCompatActivity {

    ImageView imageViewQuayLai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_cong);
        DialogHDLam();
        //Ánh xạ
        imageViewQuayLai = findViewById(R.id.imgQuayLaiCuaMHPhepCong);
        //Chuyển màn hình
        //Quay lại:
        imageViewQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuayLai = new Intent(PhepCongActivity.this, CongTruActivity.class);
                startActivity(intentQuayLai);
            }
        });
    }

    public void DialogHDLam() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PhepCongActivity.this);
        alertDialogBuilder.setView(R.layout.dialog_hdphepcong);
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