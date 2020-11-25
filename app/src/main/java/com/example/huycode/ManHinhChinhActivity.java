package com.example.huycode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ManHinhChinhActivity extends AppCompatActivity {
    ImageView imgHome, imgThoatApp;
    FrameLayout frameLayoutCongTru, frameLayoutDoVui, frameLayoutTapDem, frameLayoutGiaiTri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);
        //Ánh xạ

        imgHome = findViewById(R.id.imgHome);
        frameLayoutCongTru = findViewById(R.id.frameLOCongtru);
        frameLayoutDoVui = findViewById(R.id.frameLODoVui);
        frameLayoutTapDem = findViewById(R.id.frameLOTapDem);
        frameLayoutGiaiTri = findViewById(R.id.frameLOGiaiTri);
        //Chuyển màn hình
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(ManHinhChinhActivity.this, ManHinhChaoActivity.class);
                startActivity(intentHome);
            }
        });
        //Cộng trừ
        frameLayoutCongTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCongTru = new Intent(ManHinhChinhActivity.this, CongTruActivity.class);
                startActivity(intentCongTru);
            }
        });
        //Đố vui
        frameLayoutDoVui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCongTru = new Intent(ManHinhChinhActivity.this, DoVuiActivity.class);
                startActivity(intentCongTru);
            }
        });
        //Tập đếm
        frameLayoutTapDem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCongTru = new Intent(ManHinhChinhActivity.this, TapDemActivity.class);
                startActivity(intentCongTru);
            }
        });
        //Giải trí
        frameLayoutGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCongTru = new Intent(ManHinhChinhActivity.this, MHChaoGameActivity.class);
                startActivity(intentCongTru);
            }
        });

    }
}