package com.internship.cloning;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.internship.cloning.card_FIVE.cardFive;
import com.internship.cloning.card_FOUR.cardFour;
import com.internship.cloning.card_ONE.cardOne;
import com.internship.cloning.card_SIX.cardSix;
import com.internship.cloning.card_THREE.cardThree;
import com.internship.cloning.card_TWO.cardTwo;

public class MainActivity extends AppCompatActivity {

    Button one , two , threee , four , five , six;
    ProgressDialog progress1,progress2, progress3,progress4,progress5, progress6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress1 = new ProgressDialog(MainActivity.this);
        progress1.setMessage("Wait while loading\nStatistics Learning for\nData Science");
        progress1.setCancelable(false);
        one =(Button)findViewById(R.id.btn_one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {Thread.sleep(5000);
                            Intent intent = new Intent(MainActivity.this, cardOne.class);
                            startActivity(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progress1.dismiss();
                    }
                }).start();
            }
        });

        progress2 = new ProgressDialog(MainActivity.this);
        progress2.setMessage("Wait while loading\nData Science\nUsing R");
        progress2.setCancelable(false);
        two =(Button)findViewById(R.id.btn_two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress2.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {Thread.sleep(5000);
                            Intent intent = new Intent(MainActivity.this, cardTwo.class);
                            startActivity(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progress2.dismiss();
                    }
                }).start();
            }
        });
        progress3 = new ProgressDialog(MainActivity.this);
        progress3.setMessage("Wait while loading\nPython for Data Science");
        progress3.setCancelable(false);
        threee =(Button)findViewById(R.id.btn_three);
        threee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress3.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {Thread.sleep(5000);
                            Intent intent = new Intent(MainActivity.this, cardThree.class);
                            startActivity(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progress3.dismiss();
                    }
                }).start();
            }
        });
        progress4 = new ProgressDialog(MainActivity.this);
        progress4.setMessage("Wait while loading\nSample Projects");
        progress4.setCancelable(false);
        four =(Button)findViewById(R.id.btn_four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress4.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {Thread.sleep(5000);
                            Intent intent = new Intent(MainActivity.this, cardFour.class);
                            startActivity(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progress4.dismiss();
                    }
                }).start();
            }
        });
        progress5 = new ProgressDialog(MainActivity.this);
        progress5.setMessage("Wait while loading\nOnline Compiler");
        progress5.setCancelable(false);
        five =(Button)findViewById(R.id.btn_five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress5.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {Thread.sleep(5000);
                            Intent intent = new Intent(MainActivity.this, cardFive.class);
                            startActivity(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progress5.dismiss();
                    }
                }).start();
            }
        });
        progress6 = new ProgressDialog(MainActivity.this);
        progress6.setMessage("Wait while loading\nSimulation Exam");
        progress6.setCancelable(false);
        six =(Button)findViewById(R.id.btn_six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress6.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {Thread.sleep(5000);
                            Intent intent = new Intent(MainActivity.this, cardSix.class);
                            startActivity(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progress6.dismiss();
                    }
                }).start();
            }
        });
    }
}
