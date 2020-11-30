package com.kml.KidsMathLearning;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class PhepCongActivity extends AppCompatActivity {

    ImageView imageViewQuayLai, imgDA1, imgs1, imgs2, imgDA2, imgDA3, imgDamMay1, imgDamMay2, imgDamMay3;
    int i = 1;
    int Tong;
    int dung;
    int sai;
    TextView tvphepcong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_cong);
        //Ánh xạ
        imageViewQuayLai = findViewById(R.id.imgQuayLaiCuaMHPhepCong);
        imgDA1 = findViewById(R.id.imgDapAn1);
        imgDA2 = findViewById(R.id.imgDapAn2);
        imgDA3 = findViewById(R.id.imgDapAn3);
        imgs1 = findViewById(R.id.imgSoThuNhat);
        imgs2 = findViewById(R.id.imgSoThuHai);
        imgDamMay1 = findViewById(R.id.imgDamMay1);
        imgDamMay2 = findViewById(R.id.imgDamMay2);
        imgDamMay3 = findViewById(R.id.imgDamMay3);
        tvphepcong = findViewById(R.id.tvPhepCong);
        //Chuyển màn hình
        DialogHDLam();
        //Quay lại:
        Log.e("AAAA", "" + Tong);

        myRandomDapAn(Tong);
        imgDA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tong == 0 || Tong == 3 || Tong == 6 || Tong == 9) {
                    imgDamMay1.setImageResource(R.drawable.anhxanh);
                    imgDamMay2.setImageResource(R.drawable.maydo);
                    imgDamMay3.setImageResource(R.drawable.maydo);
                    dung++;
                    MyRunnable myRunnable = new MyRunnable();
                    myRunnable.start();
                } else {
                    imgDamMay1.setImageResource(R.drawable.maydo);
                    sai++;
                    MyRunnable myRunnable = new MyRunnable();
                    myRunnable.start();
                }
                Service();
            }
        });

        imgDA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tong == 1 || Tong == 4 || Tong == 7) {
                    imgDamMay2.setImageResource(R.drawable.anhxanh);
                    imgDamMay1.setImageResource(R.drawable.maydo);
                    imgDamMay3.setImageResource(R.drawable.maydo);
                    dung++;
                    MyRunnable myRunnable = new MyRunnable();
                    myRunnable.start();
                } else {
                    imgDamMay2.setImageResource(R.drawable.maydo);
                    sai++;
                    MyRunnable myRunnable = new MyRunnable();
                    myRunnable.start();
                }
                Service();
            }
        });
        imgDA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tong == 2 || Tong == 5 || Tong == 8) {
                    imgDamMay3.setImageResource(R.drawable.anhxanh);
                    imgDamMay2.setImageResource(R.drawable.maydo);
                    imgDamMay1.setImageResource(R.drawable.maydo);
                    dung++;
                    MyRunnable myRunnable = new MyRunnable();
                    myRunnable.start();
                } else {
                    imgDamMay3.setImageResource(R.drawable.maydo);
                    sai++;
                    MyRunnable myRunnable = new MyRunnable();
                    myRunnable.start();
                }
                Service();
            }
        });
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

    public int myRandomso1() {
        int so1;
        Random random = new Random();
        so1 = random.nextInt(6);
        switch (so1) {
            case 0:
                imgs1.setImageResource(R.drawable.so0);
                break;
            case 1:
                imgs1.setImageResource(R.drawable.so1);
                break;
            case 2:
                imgs1.setImageResource(R.drawable.so2);
                break;
            case 3:
                imgs1.setImageResource(R.drawable.so3);
                break;
            case 4:
                imgs1.setImageResource(R.drawable.so4);
                break;
            case 5:
                imgs1.setImageResource(R.drawable.so5);
                break;
        }
        return so1;
    }

    public int myRandomso2() {
        int so2;
        Random random = new Random();
        so2 = random.nextInt(5);
        switch (so2) {
            case 0:
                imgs2.setImageResource(R.drawable.so0);
                break;
            case 1:
                imgs2.setImageResource(R.drawable.so1);
                break;
            case 2:
                imgs2.setImageResource(R.drawable.so2);
                break;
            case 3:
                imgs2.setImageResource(R.drawable.so3);
                break;
            case 4:
                imgs2.setImageResource(R.drawable.so4);
                break;
        }
        return so2;
    }

    public void myRandomDapAn(int Tong) {
        switch (Tong) {
            case 0:
                imgDA1.setImageResource(R.drawable.so0);
                break;
            case 1:
                imgDA2.setImageResource(R.drawable.so1);
                break;
            case 2:
                imgDA3.setImageResource(R.drawable.so2);
                break;
            case 3:
                imgDA1.setImageResource(R.drawable.so3);
                break;
            case 4:
                imgDA2.setImageResource(R.drawable.so4);
                break;
            case 5:
                imgDA3.setImageResource(R.drawable.so5);
                break;
            case 6:
                imgDA1.setImageResource(R.drawable.so6);
                break;
            case 7:
                imgDA2.setImageResource(R.drawable.so7);
                break;
            case 8:
                imgDA3.setImageResource(R.drawable.so8);
                break;
            case 9:
                imgDA1.setImageResource(R.drawable.so9);
                break;
        }
    }

    private class MyRunnable extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                imgDamMay3.setImageResource(R.drawable.dammay);
                imgDamMay2.setImageResource(R.drawable.dammay);
                imgDamMay1.setImageResource(R.drawable.dammay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void Service() {
        Tong = myRandomso1() + myRandomso2();
        myRandomDapAn(Tong);
        Log.e("BBB", "tong 3:  " + Tong);
        i++;
        tvphepcong.setText("Câu " + i + "/10");
        if (i > 10) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PhepCongActivity.this);
            final View view1 = LayoutInflater.from(PhepCongActivity.this).inflate(R.layout.dialog_hdpheptru,null);
            alertDialogBuilder.setCancelable(false);
            alertDialogBuilder.setView(view1);
            alertDialogBuilder
                    .setMessage("Bấm để chọn")
                    .setCancelable(false)
                    .setPositiveButton("Quay Lại", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(PhepCongActivity.this, CongTruActivity.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Chơi Lại >>>", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            i = 1;
                            tvphepcong.setText("Câu " + i + "/10");
                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        Log.e("AAA","Đúng: "+dung);
        Log.e("AAA","Sai: "+sai);
    }
}